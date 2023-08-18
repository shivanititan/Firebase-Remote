package com.example;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.remoteconfig.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final String SERVICE_ACCOUNT_KEY_PATH = "/serviceAccount.json";


    public static void main(String[] args) {
        try {
            InputStream serviceAccount = Main.class.getResourceAsStream(SERVICE_ACCOUNT_KEY_PATH);
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();            FirebaseApp.initializeApp(options);

            modifyAndPublishTemplate();

        } catch (IOException e) {
            handleException("Error initializing Firebase:", e);
        }
    }

    private static void modifyAndPublishTemplate() {
        try {
            Template template = FirebaseRemoteConfig.getInstance().getTemplateAsync().get();


            modifyTemplate(template);


            validateAndPublishTemplate(template);

        } catch (ExecutionException | InterruptedException e) {
            handleException("Error modifying or publishing template:", e);
        }
    }

    private static void modifyTemplate(Template template) {
        ParameterGroup group = template.getParameterGroups().get("Hospitalization");
        if (group != null) {
            Parameter parameter = group.getParameters().get("spring_season");
            if (parameter != null) {
                parameter.setDefaultValue(ParameterValue.of("Summer " + new Random().nextInt()));
            }
        }
    }

    private static void validateAndPublishTemplate(Template template) {
        try {
            Template validatedTemplate = FirebaseRemoteConfig.getInstance()
                    .validateTemplateAsync(template).get();
            logger.log(Level.INFO, "Template was valid and safe to use");

            Template publishedTemplate = FirebaseRemoteConfig.getInstance()
                    .publishTemplateAsync(validatedTemplate).get();
            logger.log(Level.INFO, "Template has been published");
            logger.log(Level.INFO, "ETag from server: " + publishedTemplate.getETag());

        } catch (ExecutionException | InterruptedException e) {
            handleException("Error validating or publishing template:", e);
        }
    }

    private static void handleException(String message, Exception e) {
        logger.log(Level.SEVERE, message, e);
    }
}