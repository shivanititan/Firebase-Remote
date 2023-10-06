package com.titan;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.titan.models.Multi_Sports.MultiSports;
import com.titan.models.smart_world.*;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class JsonDataValidation {
    private static final ObjectMapper objectMapper = new ObjectMapper();


    private MultiSports multiSportMapper() throws IOException {
        File filePath = new File("src/main/resources/Product_team/multi_Sport/");
        File[] jsonPath = filePath.listFiles();
        if (jsonPath != null) {
            for (File jsonData : jsonPath) {
                return objectMapper.readValue(jsonData, MultiSports.class);
            }
        } else {
            System.out.println("Multi Sports Data are not Mapped");
        }

        return null;
    }

    private  EditMultiSportConfig editMultiSportMapper() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/edit_multi_sport_config_default_value.json";
        List<EditMultiSportConfig> editMultiSportConfigList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, EditMultiSportConfig.class));
        for (EditMultiSportConfig editMultiSportConfig : editMultiSportConfigList) {
            return editMultiSportConfig;
        }
        return null;
    }

    private  CountriesDefaultConfig countriesDefaultConfigMapper() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/countries_default_value.json";
        List<CountriesDefaultConfig> countriesDefaultConfigs = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, CountriesDefaultConfig.class));
        for (CountriesDefaultConfig countriesDefaultConfig : countriesDefaultConfigs) {
            return countriesDefaultConfig;
        }
        return null;
    }

    private  GamiFicationConfig gamiFicationConfigMapper() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/gamification_default_value.json";
        return objectMapper.readValue(new File(jsonPath), GamiFicationConfig.class);
    }

    private  GoogleFitConfig googleFitConfigMapper() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/google_fit_config_default_value.json";
        List<GoogleFitConfig> googleFitConfig = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, GoogleFitConfig.class));
        for (GoogleFitConfig fitConfig : googleFitConfig) {
            return fitConfig;
        }
        return null;
    }

    private  LiveChatConfig liveChatConfigMapper() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/live_chat_default_value.json";
        LiveChatConfig liveChatConfigs = objectMapper.readValue(new File(jsonPath), LiveChatConfig.class);
        return liveChatConfigs;
    }

    private  MultiSportCategory multiSportCategoryMapper() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/multi_sport_category_config_default_value.json";
        List<MultiSportCategory> multiSportCategories = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, MultiSportCategory.class));
        for (MultiSportCategory multiSportCategory : multiSportCategories) {
            return multiSportCategory;
        }
        return null;
    }

    private MultiSportConfig multiSportConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/multi_sport_config_default_value.json";
        MultiSportConfig multiSportConfig = objectMapper.readValue(new File(jsonPath), MultiSportConfig.class);
        return multiSportConfig;
    }

    private  PrivilegeAccessConfig privilegeAccessConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/privilege_access_default_value.json";
        List<PrivilegeAccessConfig> privilegeAccessConfigList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, PrivilegeAccessConfig.class));
        for (PrivilegeAccessConfig privilegeAccessConfig : privilegeAccessConfigList) {
            return privilegeAccessConfig;
        }
        return null;
    }

    private  SmartNotificationConfig.Mapping smartNotificationConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/smart_notification_config_default_value.json";
        List<SmartNotificationConfig> smartNotificationConfigs = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, SmartNotificationConfig.class));
        for (SmartNotificationConfig smartNotificationConfig : smartNotificationConfigs) {
            for (SmartNotificationConfig.Mapping mapping : smartNotificationConfig.getMapping()) {
                return mapping;
            }

        }
        return null;
    }
    private  SupportedFeaturesConfig supportedFeaturesConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/supported_features_default_value.json";
        List<SupportedFeaturesConfig> supportedFeaturesConfigsList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, SupportedFeaturesConfig.class));
        for (SupportedFeaturesConfig supportedFeaturesConfig : supportedFeaturesConfigsList){
            System.out.println(supportedFeaturesConfig.getPlatformFeatures().getArticles());
        }
        return null;
    }
    private  SupportedProductsConfig supportedProductsConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/supported_products_default_value.json";
        SupportedProductsConfig supportedProductsConfigs = objectMapper.readValue(new File(jsonPath), SupportedProductsConfig.class);
        if(supportedProductsConfigs != null) {
            return supportedProductsConfigs;
        }
        return null;
    }
    private  UrlConfig urlConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/url_config_default_value.json";
        List<UrlConfig> urlConfigList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, UrlConfig.class));
        for (UrlConfig urlConfig : urlConfigList){
            return urlConfig;
        }
        return null;
    }


    private  Temp tempMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/temp.json";
        Temp temp = objectMapper.readValue(new File(jsonPath), Temp.class);
        System.out.println(temp);
        return null;
    }



}

