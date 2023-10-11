package com.titan.models.validate.json;

import java.io.IOException;
import java.util.List;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.titan.models.multisports.MultiSports;
import com.titan.models.app_icon.SplashIconsConfig;
import com.titan.models.smartworld.*;





public class JsonDataValidation {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    boolean isFailed = false;

    public Boolean validateAllMultiSportJson() throws IOException {
        File filePath = new File("src/main/resources/Product_team/multi_Sport/");
        File[] jsonPath = filePath.listFiles();
        if (jsonPath != null) {
            for (File jsonData : jsonPath) {
                try {
                    objectMapper.readValue(jsonData, MultiSports.class);
                } catch (Exception e) {
                    isFailed = true;
                }
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    public Boolean validateEditMultiSportConfigJson() throws IOException {
        String jsonPath = "edit_multi_sport_config_default_value.json";
        if (jsonPath != null) {
            try {
                List<EditMultiSportConfig> editMultiSportConfigList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, EditMultiSportConfig.class));
                for (EditMultiSportConfig editMultiSportConfig : editMultiSportConfigList) {
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    private Boolean validateCountriesJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/countries_default_value.json";
        if (jsonPath != null) {
            try {
                List<CountriesDefaultConfig> countriesDefaultConfigs = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, CountriesDefaultConfig.class));
                for (CountriesDefaultConfig countriesDefaultConfig : countriesDefaultConfigs) {
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    private Boolean validateGamiFicationJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/gamification_default_value.json";
        if (jsonPath != null) {
            try {
                objectMapper.readValue(new File(jsonPath), GamiFicationConfig.class);
            } catch (IOException e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }
    public Boolean validateSpalshIconJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/app_icons/dashboard_icons_config_default_value.json";
        if (jsonPath != null) {
            try {
                SplashIconsConfig data = objectMapper.readValue(new File(jsonPath), SplashIconsConfig.class);
                    System.out.println(data);

            } catch (IOException e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }


    private Boolean validateGoogleFitConfigJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/google_fit_config_default_value.json";
        if (jsonPath != null) {
            try {
                List<GoogleFitConfig> googleFitConfig = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, GoogleFitConfig.class));
                for (GoogleFitConfig fitConfig : googleFitConfig) {
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    private Boolean validateLiveChatConfigJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/live_chat_default_value.json";
        if (jsonPath != null) {
            try {
                objectMapper.readValue(new File(jsonPath), LiveChatConfig.class);
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    private Boolean multiSportCategoryMapper() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/multi_sport_category_config_default_value.json";
        if (jsonPath != null) {
            try {
                List<MultiSportCategory> multiSportCategories = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, MultiSportCategory.class));
                for (MultiSportCategory multiSportCategory : multiSportCategories) {
                    return isFailed;
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }

        return isFailed;
    }

    private Boolean multiSportConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/multi_sport_config_default_value.json";
        if (jsonPath != null) {
            try {
                objectMapper.readValue(new File(jsonPath), MultiSportConfig.class);
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    private Boolean privilegeAccessConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/privilege_access_default_value.json";
        if (jsonPath != null) {
            try {
                List<PrivilegeAccessConfig> privilegeAccessConfigList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, PrivilegeAccessConfig.class));
                for (PrivilegeAccessConfig privilegeAccessConfig : privilegeAccessConfigList) {
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    private Boolean smartNotificationConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/smart_notification_config_default_value.json";
        if (jsonPath != null) {
            try {
                List<SmartNotificationConfig> smartNotificationConfigs = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, SmartNotificationConfig.class));
                for (SmartNotificationConfig smartNotificationConfig : smartNotificationConfigs) {
                    for (SmartNotificationConfig.Mapping mapping : smartNotificationConfig.getMapping()) {
                    }
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    private Boolean supportedFeaturesConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/supported_features_default_value.json";
        if (jsonPath != null) {
            try {
                List<SupportedFeaturesConfig> supportedFeaturesConfigsList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, SupportedFeaturesConfig.class));
                for (SupportedFeaturesConfig supportedFeaturesConfig : supportedFeaturesConfigsList) {
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    private Boolean supportedProductsConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/supported_products_default_value.json";
        if (jsonPath != null) {
            try {
                objectMapper.readValue(new File(jsonPath), SupportedProductsConfig.class);
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    private Boolean urlConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/url_config_default_value.json";
        if (jsonPath != null) {
            try {
                List<UrlConfig> urlConfigList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, UrlConfig.class));
                for (UrlConfig urlConfig : urlConfigList) {
                }
            } catch (Exception e) {
                isFailed=true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }


//    private Temp tempMap() throws IOException {
//        String jsonPath = "src/main/resources/Product_team/smart_world/temp.json";
//        Temp temp = objectMapper.readValue(new File(jsonPath), Temp.class);
//        System.out.println(temp);
//        return null;
//    }


}

