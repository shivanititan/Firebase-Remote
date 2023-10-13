package com.titan.validatejson;

import java.io.IOException;
import java.util.List;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.titan.models.appicons.AppIconConfiguration;
import com.titan.models.multisports.MultiSports;
import com.titan.models.smartworld.*;
import com.titan.models.smartworld.supported.features.SupportedFeaturesConfig;

public class JsonDataValidation {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    boolean isFailed = false;

    public static void main(String[] args) throws IOException {
        JsonDataValidation jsonDataValidation = new JsonDataValidation();
        jsonDataValidation.validateUrlConfigJson();
    }

    // test done
    private Boolean validateAppIconConfigJson() throws IOException {
        File filePath = new File("src/main/resources/Product_team/app_icons/");
        File[] jsonPath = filePath.listFiles();
        if (jsonPath != null) {
            try {
                for (File jsonData : jsonPath) {
                    AppIconConfiguration appIconConfiguration = objectMapper.readValue(jsonData, AppIconConfiguration.class);
                    System.out.println(appIconConfiguration);
                }
            } catch (Exception e) {
                isFailed = true;
            }
        }
        return isFailed;
    }

    // test done
    private Boolean validateAllMultiSportJson() throws IOException {
        File filePath = new File("src/main/resources/Product_team/multi_Sport/");
        File[] jsonPath = filePath.listFiles();
        if (jsonPath != null) {
            for (File jsonData : jsonPath) {
                try {
                    MultiSports multiSports = objectMapper.readValue(jsonData, MultiSports.class);
                    System.out.println(multiSports);
                } catch (Exception e) {
                    isFailed = true;
                }
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // getTitanLifeSleepType returns null value
    private Boolean validateAppConfigJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/app_config_default_value.json";
        if (jsonPath != null) {
            try {
                AppConfig appConfigList = objectMapper.readValue(new File(jsonPath), AppConfig.class);
                if (appConfigList.getTitanLifeSleepType() == null) {
                    System.out.println(appConfigList);
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // test done
    private Boolean supportedFeaturesConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/supported_features_default_value.json";
        if (jsonPath != null) {
            try {
                SupportedFeaturesConfig supportedFeaturesConfig = objectMapper.readValue(new File(jsonPath), SupportedFeaturesConfig.class);
                System.out.println(supportedFeaturesConfig);
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // test done
    private Boolean validateEditMultiSportConfigJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/edit_multi_sport_config_default_value.json";
        if (jsonPath != null) {
            try {
                List<EditMultiSportConfig> editMultiSportConfigList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, EditMultiSportConfig.class));
                for (EditMultiSportConfig editMultiSportConfig : editMultiSportConfigList) {
                    System.out.println(editMultiSportConfig);
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // test done
    private Boolean validateCountriesJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/countries_default_value.json";
        if (jsonPath != null) {
            try {
                List<CountriesDefaultConfig> countriesDefaultConfigList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, CountriesDefaultConfig.class));
                for (CountriesDefaultConfig countriesDefaultConfig : countriesDefaultConfigList) {
                    System.out.println(countriesDefaultConfig);
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // test done
    private Boolean validateGamiFicationJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/gamification_default_value.json";
        if (jsonPath != null) {
            try {
                GamiFicationConfig gamiFicationConfig = objectMapper.readValue(new File(jsonPath), GamiFicationConfig.class);
                System.out.println(gamiFicationConfig);
            } catch (IOException e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // test done
    private Boolean validateGoogleFitConfigJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/google_fit_config_default_value.json";
        if (jsonPath != null) {
            try {
                List<GoogleFitConfig> googleFitConfig = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, GoogleFitConfig.class));
                for (GoogleFitConfig fitConfig : googleFitConfig) {
                    System.out.println(fitConfig);
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // test done
    private Boolean validateLiveChatConfigJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/live_chat_default_value.json";
        if (jsonPath != null) {
            try {
                LiveChatConfig liveChatConfig = objectMapper.readValue(new File(jsonPath), LiveChatConfig.class);
                System.out.println(liveChatConfig);
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // test done
    private Boolean validateMultiSporyCategoryJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/multi_sport_category_config_default_value.json";
        if (jsonPath != null) {
            try {
                List<MultiSportCategory> multiSportCategories = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, MultiSportCategory.class));
                for (MultiSportCategory multiSportCategory : multiSportCategories) {
                    System.out.println(multiSportCategory);
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }

        return isFailed;
    }

    // test done
    private Boolean validateMultiSportConfigJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/multi_sport_config_default_value.json";
        if (jsonPath != null) {
            try {
                MultiSportConfig multiSportConfig = objectMapper.readValue(new File(jsonPath), MultiSportConfig.class);
                System.out.println(multiSportConfig);
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // test done
    private Boolean privilegeAccessConfigMap() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/privilege_access_default_value.json";
        if (jsonPath != null) {
            try {
                List<PrivilegeAccessConfig> privilegeAccessConfigList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, PrivilegeAccessConfig.class));
                for (PrivilegeAccessConfig privilegeAccessConfig : privilegeAccessConfigList) {
                    System.out.println(privilegeAccessConfig);
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // test done
    private Boolean validateSmartNotificationJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/smart_notification_config_default_value.json";
        if (jsonPath != null) {
            try {
                List<SmartNotificationConfig> smartNotificationConfigs = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, SmartNotificationConfig.class));
                for (SmartNotificationConfig smartNotificationConfig : smartNotificationConfigs) {
                    for (SmartNotificationConfig.Mapping mapping : smartNotificationConfig.getMapping()) {
                        System.out.println(mapping);
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

    // test done
    private Boolean validateSupportedProductsConfigJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/supported_products_default_value.json";
        if (jsonPath != null) {
            try {
                SupportedProductsConfig supportedFeaturesConfig = objectMapper.readValue(new File(jsonPath), SupportedProductsConfig.class);
                System.out.println(supportedFeaturesConfig);
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }

    // test done
    private Boolean validateUrlConfigJson() throws IOException {
        String jsonPath = "src/main/resources/Product_team/smart_world/url_config_default_value.json";
        if (jsonPath != null) {
            try {
                List<UrlConfig> urlConfigList = objectMapper.readValue(new File(jsonPath), objectMapper.getTypeFactory().constructCollectionType(List.class, UrlConfig.class));
                for (UrlConfig urlConfig : urlConfigList) {
                    System.out.println(urlConfig);
                }
            } catch (Exception e) {
                isFailed = true;
            }
        } else {
            isFailed = true;
        }
        return isFailed;
    }





}

