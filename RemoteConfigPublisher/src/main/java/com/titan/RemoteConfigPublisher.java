package com.titan;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoteConfigPublisher {
    private static final Logger logger = Logger.getLogger(RemoteConfigPublisher.class.getName());
    private static final String SERVICE_ACCOUNT_KEY_PATH = "src/main/resources/serviceAccountKey.json";
    private static final String CHANGED_FILES_PATH = "src/main/resources/ChangedFiles.txt";

    public static void main(String[] args) {
        try {
            initializeFirebase();
//            TemplateManager manager = new TemplateManager();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred in the main process.", e);
        }
    }

    // Initialize the SDK and authorize API requests
    private static void initializeFirebase() {
        try {
            File serviceAccount = new File(SERVICE_ACCOUNT_KEY_PATH);
            if (serviceAccount != null) {
                try (FileInputStream serviceAccountStream = new FileInputStream(serviceAccount)) {
                FirebaseOptions options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccountStream))
                        .build();
                FirebaseApp.initializeApp(options);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                logger.severe("Service account key not found or could not be loaded.");
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error initializing Firebase.", e);
        }
    }

/*    private static void deleteChangeLogFile() {
        File file = new File(CHANGED_FILES_PATH);
        if (file.delete()) {
            logger.info("Change log file deleted successfully.");
        } else {
            logger.warning("Failed to delete change log file.");
        }
    }*/
}

/*class MappingData {
    private final String fileName;
    private final String parameter;
    private final String group;

    MappingData(String fileName, String parameter, String group) {
        this.fileName = fileName;
        this.parameter = parameter;
        this.group = group;
    }

    public String getFileName() {
        return fileName;
    }

    public String getParameter() {
        return parameter;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "MappingData:" +
                "fileName= " + fileName +
                ", parameter= " + parameter +
                ", group= " + group;
    }
}*/
