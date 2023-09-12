package com.titan;

import com.google.firebase.remoteconfig.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TemplateManager {
    private static final Logger logger = Logger.getLogger(TemplateManager.class.getName());

    public Boolean published = false;

    public void publishUpdates() {
        Template template = getTemplate();
        try {
            updateTemplate(template);
            validateAndPublishTemplate(template);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//Get the current Remote Config Template
    private Template getTemplate() {
        try {
            return FirebaseRemoteConfig.getInstance().getTemplateAsync().get();
        } catch (ExecutionException | InterruptedException e) {
            handleException("Error in getting template:", e);
        }
        return null;
    }

//    Add, Modify, Delete
    private void updateTemplate(Template template) throws IOException {

        List<ChangeLogs> changeLogsList = new ChangeLogManager().getFilesChanged();

        List<MappingData> mappingDataList = parseMappingDataJson();

        for (ChangeLogs item : changeLogsList) {

            File file = new File("src/main/resources/" + item.getFileName());

            if (file.exists()) {
                if (item.getStatus() == ChangeLogStatus.DELETED) {
                    MappingData itemData = null;
                    for (MappingData data : mappingDataList) {
                        if (data.getFileName().equals(item.getFileName())) {

                            itemData = data;
                            System.out.println("Deleted Parameter Value Files: " + itemData);
                            break;
                        }
                    }
                    if (itemData != null) {
                        Map<String, ParameterGroup> parameterGroupMap = template.getParameterGroups();
                        if (parameterGroupMap != null) {
                            ParameterGroup parameterGroup = parameterGroupMap.get(itemData.getGroup());
                            if (parameterGroup != null) {
                                Map<String, Parameter> parameterMap = parameterGroup.getParameters();
                                if (parameterMap != null) {
                                    parameterMap.remove(itemData.getParameter());
                                }
                            }
                        }
                    }
                } else if (item.getStatus() == ChangeLogStatus.NEW) {
                    MappingData itemData = null;
                    for (MappingData data : mappingDataList) {
                        if (data.getFileName().equals(item.getFileName())) {
                            itemData = data;
                            System.out.println("Newly Added Parameter Value Files: " + itemData);
                            break;
                        }
                    }
                    if (itemData != null) {
                        Map<String, ParameterGroup> parameterGroupMap = template.getParameterGroups();
                        if (parameterGroupMap != null) {
                            ParameterGroup parameterGroup = parameterGroupMap.get(itemData.getGroup());
                            if (parameterGroup != null) {
                                Map<String, Parameter> parameterMap = parameterGroup.getParameters();
                                if (parameterMap != null) {
                                    String readDataFromFile = getDataFromFile(file);
                                    parameterMap.put(itemData.getParameter(), new Parameter().setDefaultValue(ParameterValue.of(readDataFromFile)));
                                }
                            }
                        }
                    }
                } else if (item.getStatus() == ChangeLogStatus.MODIFIED) {
                    MappingData itemData = null;
                    for (MappingData data : mappingDataList) {
                        if (data.getFileName().equals(item.getFileName())) {
                            itemData = data;
                            System.out.println("Modified Parameter Value Files: " +itemData);
                            break;
                        }
                    }
                    if (itemData != null) {
                        Map<String, ParameterGroup> parameterGroupMap = template.getParameterGroups();
                        if (parameterGroupMap != null) {
                            ParameterGroup parameterGroup = parameterGroupMap.get(itemData.getGroup());
                            if (parameterGroup != null) {
                                Map<String, Parameter> parameterMap = parameterGroup.getParameters();
                                if (parameterMap != null) {
                                    String readDataFromFile = getDataFromFile(file);
                                    Parameter parameter = parameterMap.get(itemData.getParameter());
                                    if (parameter != null) {
                                        parameter.setDefaultValue(ParameterValue.of(readDataFromFile));
                                    } else {
                                        parameterMap.put(itemData.getParameter(), new Parameter().setDefaultValue(ParameterValue.of(readDataFromFile)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

//    Read json data from files
    private String getDataFromFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        String st;
        while ((st = br.readLine()) != null) {
            stringBuilder.append(st);
        }
        return stringBuilder.toString();
    }
//    Validate and Publish the Remote Config template
    private boolean validateAndPublishTemplate(Template template) {
        try {
            Template validatedTemplate = FirebaseRemoteConfig.getInstance()
                    .validateTemplateAsync(template).get();
            logger.log(Level.INFO, "Template was valid and safe to use");
            Template publishedTemplate = FirebaseRemoteConfig.getInstance()
                    .publishTemplateAsync(validatedTemplate).get();
            published = true;
            logger.log(Level.INFO, "Template has been published");
            logger.log(Level.INFO, "ETag from server: " + publishedTemplate.getETag());

        } catch (ExecutionException | InterruptedException e) {
            handleException("Error validating or publishing template:", e);
            return false;
        }
        return true;
    }

//    Read Mapping file
    private List<MappingData> parseMappingDataJson() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        MappingData[] jsonData;

        File reader = new File("src/main/resources/mapping.json");

        File reader = new File("Firebase-Remote/RemoteConfigPublisher/src/main/resources/mapping.json");

        jsonData = gson.fromJson(getDataFromFile(reader), MappingData[].class);
        ArrayList<MappingData> mappingDataList = new ArrayList<MappingData>();
        if (jsonData != null) {
            Collections.addAll(mappingDataList, jsonData);

        }
        return mappingDataList;
    }

    private void handleException(String message, Exception e) {
        logger.log(Level.SEVERE, message, e);
    }
}
