package com.titan;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RemoteConfigPublisher {
    private static final Logger logger = Logger.getLogger(RemoteConfigPublisher.class.getName());
    private static final String SERVICE_ACCOUNT_KEY_PATH = "/serviceAccountKey.json";

    public static void main(String[] args) {
        initializeFirebase();
        TemplateManager manager = new TemplateManager();
        manager.publishUpdates();
    }
    //    Initialize the SDK and authorize API requests
    private static void initializeFirebase() {
        try {
            InputStream serviceAccount = RemoteConfigPublisher.class.getResourceAsStream(SERVICE_ACCOUNT_KEY_PATH);
            if (serviceAccount != null) {
                FirebaseOptions options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                        .build();
                FirebaseApp.initializeApp(options);
            } else {
                logger.log(Level.SEVERE, "Service account key not found or could not be loaded.");
            }
        } catch (IOException e) {
            handleException("Error initializing Firebase:", e);
        }
    }

    private static void handleException(String message, Exception e) {
        logger.log(Level.SEVERE, message, e);
    }
}

class MappingData {
    private String fileName;
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
}
