package com.titan.models.smartworld;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppConfig implements Serializable {
  private List<ConfigConditions> syncTime;
  private List<ConfigConditions> TitanLifeSleepType;
  private List<ConfigConditions> weatherKey;
  private List<ConfigConditions> weatherKeyV2;
  private List<ConfigConditions> firebaseGroupLevel;
  private List<ConfigConditions> firebaseMobileNumberPrefix;
  private List<ConfigConditions> cropMinHeight;
  private List<ConfigConditions> contactUs;
  private List<ConfigConditions> smartDesk;
  private List<ConfigConditions> termsAndConditions;
  private List<ConfigConditions> privacyPolicy;
  private List<ConfigConditions> aboutTheProduct;
  private List<ConfigConditions> aboutCompany;
  private String ecgReportUrl;
  private String healthReportUrl;
  private String connectedAppsLogoUrl;
  private String subscriptionsLogoUrl;
  private List<ConfigConditions> worldClockMaxCount;
  private List<ConfigConditions> userManual;
  private List<ConfigConditions> watchfaceConfigVersion;
  private List<ConfigConditions> eventRemindersMaxCount;
  private List<String> types;
  private List<String> conditions;

  public List<ConfigConditions> getSyncTime() {
    return syncTime;
  }

  public void setSyncTime(List<ConfigConditions> syncTime) {
    this.syncTime = syncTime;
  }

  public List<ConfigConditions> getTitanLifeSleepType() {
    return TitanLifeSleepType;
  }

  public void setTitanLifeSleepType(List<ConfigConditions> TitanLifeSleepType) {
    this.TitanLifeSleepType = TitanLifeSleepType;
  }

  public List<ConfigConditions> getWeatherKey() {
    return weatherKey;
  }

  public void setWeatherKey(List<ConfigConditions> weatherKey) {
    this.weatherKey = weatherKey;
  }

  public List<ConfigConditions> getWeatherKeyV2() {
    return weatherKeyV2;
  }

  public void setWeatherKeyV2(List<ConfigConditions> weatherKeyV2) {
    this.weatherKeyV2 = weatherKeyV2;
  }

  public List<ConfigConditions> getFirebaseGroupLevel() {
    return firebaseGroupLevel;
  }

  public void setFirebaseGroupLevel(List<ConfigConditions> firebaseGroupLevel) {
    this.firebaseGroupLevel = firebaseGroupLevel;
  }

  public List<ConfigConditions> getFirebaseMobileNumberPrefix() {
    return firebaseMobileNumberPrefix;
  }

  public void setFirebaseMobileNumberPrefix(List<ConfigConditions> firebaseMobileNumberPrefix) {
    this.firebaseMobileNumberPrefix = firebaseMobileNumberPrefix;
  }

  public List<ConfigConditions> getCropMinHeight() {
    return cropMinHeight;
  }

  public void setCropMinHeight(List<ConfigConditions> cropMinHeight) {
    this.cropMinHeight = cropMinHeight;
  }

  public List<ConfigConditions> getContactUs() {
    return contactUs;
  }

  public void setContactUs(List<ConfigConditions> contactUs) {
    this.contactUs = contactUs;
  }

  public List<ConfigConditions> getSmartDesk() {
    return smartDesk;
  }

  public void setSmartDesk(List<ConfigConditions> smartDesk) {
    this.smartDesk = smartDesk;
  }

  public List<ConfigConditions> getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(List<ConfigConditions> termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  public List<ConfigConditions> getPrivacyPolicy() {
    return privacyPolicy;
  }

  public void setPrivacyPolicy(List<ConfigConditions> privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
  }

  public List<ConfigConditions> getAboutTheProduct() {
    return aboutTheProduct;
  }

  public void setAboutTheProduct(List<ConfigConditions> aboutTheProduct) {
    this.aboutTheProduct = aboutTheProduct;
  }

  public List<ConfigConditions> getAboutCompany() {
    return aboutCompany;
  }

  public void setAboutCompany(List<ConfigConditions> aboutCompany) {
    this.aboutCompany = aboutCompany;
  }

  public String getEcgReportUrl() {
    return ecgReportUrl;
  }

  public void setEcgReportUrl(String ecgReportUrl) {
    this.ecgReportUrl = ecgReportUrl;
  }

  public String getHealthReportUrl() {
    return healthReportUrl;
  }

  public void setHealthReportUrl(String healthReportUrl) {
    this.healthReportUrl = healthReportUrl;
  }

  public String getConnectedAppsLogoUrl() {
    return connectedAppsLogoUrl;
  }

  public void setConnectedAppsLogoUrl(String connectedAppsLogoUrl) {
    this.connectedAppsLogoUrl = connectedAppsLogoUrl;
  }

  public String getSubscriptionsLogoUrl() {
    return subscriptionsLogoUrl;
  }

  public void setSubscriptionsLogoUrl(String subscriptionsLogoUrl) {
    this.subscriptionsLogoUrl = subscriptionsLogoUrl;
  }

  public List<ConfigConditions> getWorldClockMaxCount() {
    return worldClockMaxCount;
  }

  public void setWorldClockMaxCount(List<ConfigConditions> worldClockMaxCount) {
    this.worldClockMaxCount = worldClockMaxCount;
  }

  public List<ConfigConditions> getUserManual() {
    return userManual;
  }

  public void setUserManual(List<ConfigConditions> userManual) {
    this.userManual = userManual;
  }

  public List<ConfigConditions> getWatchfaceConfigVersion() {
    return watchfaceConfigVersion;
  }

  public void setWatchfaceConfigVersion(List<ConfigConditions> watchfaceConfigVersion) {
    this.watchfaceConfigVersion = watchfaceConfigVersion;
  }

  public List<ConfigConditions> getEventRemindersMaxCount() {
    return eventRemindersMaxCount;
  }

  public void setEventRemindersMaxCount(List<ConfigConditions> eventRemindersMaxCount) {
    this.eventRemindersMaxCount = eventRemindersMaxCount;
  }

  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public List<String> getConditions() {
    return conditions;
  }

  public void setConditions(List<String> conditions) {
    this.conditions = conditions;
  }
}

class ConfigConditions implements Serializable{
  private String type;
  private String condition;
  private String result;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}



