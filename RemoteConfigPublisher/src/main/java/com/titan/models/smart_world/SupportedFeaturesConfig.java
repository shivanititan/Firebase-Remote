package com.titan.models.smart_world;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

public class SupportedFeaturesConfig implements Serializable {
  private List<String> types;

  private WearableFeatures wearableFeatures;

  private WearableSettings wearableSettings;

  private PlatformFeatures platformFeatures;

  private List<String> conditions;

  public List<String> getTypes() {
    return this.types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public WearableFeatures getWearableFeatures() {
    return this.wearableFeatures;
  }

  public void setWearableFeatures(WearableFeatures wearableFeatures) {
    this.wearableFeatures = wearableFeatures;
  }

  public WearableSettings getWearableSettings() {
    return this.wearableSettings;
  }

  public void setWearableSettings(WearableSettings wearableSettings) {
    this.wearableSettings = wearableSettings;
  }

  public PlatformFeatures getPlatformFeatures() {
    return this.platformFeatures;
  }

  public void setPlatformFeatures(PlatformFeatures platformFeatures) {
    this.platformFeatures = platformFeatures;
  }

  public List<String> getConditions() {
    return this.conditions;
  }

  public void setConditions(List<String> conditions) {
    this.conditions = conditions;
  }

  public static class WearableFeatures implements Serializable {
    private List<BloodPressure> bloodPressure;

    private List<BloodPressure> settings;

    private List<BloodPressure> stress;

    private List<BloodPressure> remSleep;

    private List<BloodPressure> mood;

    private List<BloodPressure> respiratoryRate;

    private List<BloodPressure> bodyEnergy;

    private List<BloodPressure> ecg;

    private List<BloodPressure> multiSport;

    private List<BloodPressure> hrv;

    private List<BloodPressure> sleep;

    private List<BloodPressure> myCycle;

    private List<BloodPressure> bloodOxygen;

    private List<BloodPressure> watchFace;

    private List<BloodPressure> myFitness;

    private List<BloodPressure> heartRate;

    private List<BloodPressure> temperature;

    private List<BloodPressure> napSleep;

    private List<BloodPressure> runningTraining;

    private List<BloodPressure> smartCompetitor;

    private List<BloodPressure> awakeSleep;

    public List<BloodPressure> getBloodPressure() {
      return this.bloodPressure;
    }

    public void setBloodPressure(List<BloodPressure> bloodPressure) {
      this.bloodPressure = bloodPressure;
    }

    public List<BloodPressure> getSettings() {
      return this.settings;
    }

    public void setSettings(List<BloodPressure> settings) {
      this.settings = settings;
    }

    public List<BloodPressure> getStress() {
      return this.stress;
    }

    public void setStress(List<BloodPressure> stress) {
      this.stress = stress;
    }

    public List<BloodPressure> getRemSleep() {
      return this.remSleep;
    }

    public void setRemSleep(List<BloodPressure> remSleep) {
      this.remSleep = remSleep;
    }

    public List<BloodPressure> getMood() {
      return this.mood;
    }

    public void setMood(List<BloodPressure> mood) {
      this.mood = mood;
    }

    public List<BloodPressure> getRespiratoryRate() {
      return this.respiratoryRate;
    }

    public void setRespiratoryRate(List<BloodPressure> respiratoryRate) {
      this.respiratoryRate = respiratoryRate;
    }

    public List<BloodPressure> getBodyEnergy() {
      return this.bodyEnergy;
    }

    public void setBodyEnergy(List<BloodPressure> bodyEnergy) {
      this.bodyEnergy = bodyEnergy;
    }

    public List<BloodPressure> getEcg() {
      return this.ecg;
    }

    public void setEcg(List<BloodPressure> ecg) {
      this.ecg = ecg;
    }

    public List<BloodPressure> getMultiSport() {
      return this.multiSport;
    }

    public void setMultiSport(List<BloodPressure> multiSport) {
      this.multiSport = multiSport;
    }

    public List<BloodPressure> getHrv() {
      return this.hrv;
    }

    public void setHrv(List<BloodPressure> hrv) {
      this.hrv = hrv;
    }

    public List<BloodPressure> getSleep() {
      return this.sleep;
    }

    public void setSleep(List<BloodPressure> sleep) {
      this.sleep = sleep;
    }

    public List<BloodPressure> getMyCycle() {
      return this.myCycle;
    }

    public void setMyCycle(List<BloodPressure> myCycle) {
      this.myCycle = myCycle;
    }

    public List<BloodPressure> getBloodOxygen() {
      return this.bloodOxygen;
    }

    public void setBloodOxygen(List<BloodPressure> bloodOxygen) {
      this.bloodOxygen = bloodOxygen;
    }

    public List<BloodPressure> getWatchFace() {
      return this.watchFace;
    }

    public void setWatchFace(List<BloodPressure> watchFace) {
      this.watchFace = watchFace;
    }

    public List<BloodPressure> getMyFitness() {
      return this.myFitness;
    }

    public void setMyFitness(List<BloodPressure> myFitness) {
      this.myFitness = myFitness;
    }

    public List<BloodPressure> getHeartRate() {
      return this.heartRate;
    }

    public void setHeartRate(List<BloodPressure> heartRate) {
      this.heartRate = heartRate;
    }

    public List<BloodPressure> getTemperature() {
      return this.temperature;
    }

    public void setTemperature(List<BloodPressure> temperature) {
      this.temperature = temperature;
    }

    public List<BloodPressure> getNapSleep() {
      return this.napSleep;
    }

    public void setNapSleep(List<BloodPressure> napSleep) {
      this.napSleep = napSleep;
    }

    public List<BloodPressure> getRunningTraining() {
      return this.runningTraining;
    }

    public void setRunningTraining(List<BloodPressure> runningTraining) {
      this.runningTraining = runningTraining;
    }

    public List<BloodPressure> getSmartCompetitor() {
      return this.smartCompetitor;
    }

    public void setSmartCompetitor(List<BloodPressure> smartCompetitor) {
      this.smartCompetitor = smartCompetitor;
    }

    public List<BloodPressure> getAwakeSleep() {
      return this.awakeSleep;
    }

    public void setAwakeSleep(List<BloodPressure> awakeSleep) {
      this.awakeSleep = awakeSleep;
    }

    public static class BloodPressure implements Serializable {
      private String condition;
      private List<String> pattern;
      private String type;
      public String getCondition() {
        return this.condition;
      }
      public void setCondition(String condition) {
        this.condition = condition;
      }
      public List<String> getPattern() {
        return this.pattern;
      }
      public void setPattern(List<String> pattern) {
        this.pattern = pattern;
      }
      public String getType() {
        return this.type;
      }
      public void setType(String type) {
        this.type = type;
      }
    }
  }

  public static class WearableSettings implements Serializable {
    private List<WearableFeatures.BloodPressure> intensityGoal;
    private List<WearableFeatures.BloodPressure> resetPassword;
    private List<WearableFeatures.BloodPressure> subscriptions;
    private List<WearableFeatures.BloodPressure> highStressReminder;
    private List<WearableFeatures.BloodPressure> about;
    private List<WearableFeatures.BloodPressure> alexa;
    private List<WearableFeatures.BloodPressure> dndFromWatchSupport;
    private List<WearableFeatures.BloodPressure> language;
    private List<WearableFeatures.BloodPressure> batteryOptimization;
    private List<WearableFeatures.BloodPressure> liftToViewFromWatchSupport;
    private List<WearableFeatures.BloodPressure> music;
    private List<WearableFeatures.BloodPressure> liftToView;
    private List<WearableFeatures.BloodPressure> weather;
    private List<WearableFeatures.BloodPressure> dnd;
    private List<WearableFeatures.BloodPressure> ota;
    private List<WearableFeatures.BloodPressure> watchfaceDelete;
    private List<WearableFeatures.BloodPressure> worldClock;
    private List<WearableFeatures.BloodPressure> quickReply;
    private List<WearableFeatures.BloodPressure> aiSticker;
    private List<WearableFeatures.BloodPressure> musicStorage;
    private List<WearableFeatures.BloodPressure> lowSpO2Reminder;
    private List<WearableFeatures.BloodPressure> autoStressLogs;
    private List<WearableFeatures.BloodPressure> dialSync;
    private List<WearableFeatures.BloodPressure> editMultiSport;
    private List<WearableFeatures.BloodPressure> strava;
    private List<WearableFeatures.BloodPressure> activeHourGoal;
    private List<WearableFeatures.BloodPressure> autoSleep;
    private List<WearableFeatures.BloodPressure> sedentaryAlert;
    private List<WearableFeatures.BloodPressure> voiceAssistant;
    private List<WearableFeatures.BloodPressure> temperatureUnitSystem;
    private List<WearableFeatures.BloodPressure> notificationsEnableDisable;
    private List<WearableFeatures.BloodPressure> systemLogs;
    private List<WearableFeatures.BloodPressure> hydration;
    private List<WearableFeatures.BloodPressure> watchfaceWallpaper;
    private List<WearableFeatures.BloodPressure> deviceInfoNotNeededForDnd;
    private List<WearableFeatures.BloodPressure> autoTemperature;
    private List<WearableFeatures.BloodPressure> distanceGoal;
    private List<WearableFeatures.BloodPressure> eCard;
    private List<WearableFeatures.BloodPressure> antiLost;
    private List<WearableFeatures.BloodPressure> sleepGoal;
    private List<WearableFeatures.BloodPressure> notifications;
    private List<WearableFeatures.BloodPressure> autoDetection;
    private List<WearableFeatures.BloodPressure> dndIntervalSupport;
    private List<WearableFeatures.BloodPressure> bandLayout;
    private List<WearableFeatures.BloodPressure> favouriteContacts;
    private List<WearableFeatures.BloodPressure> factoryReset;
    private List<WearableFeatures.BloodPressure> sensorHubOtaTest;
    private List<WearableFeatures.BloodPressure> autoSpo2;
    private List<WearableFeatures.BloodPressure> sosContacts;
    private List<WearableFeatures.BloodPressure> alexaLog;
    private List<WearableFeatures.BloodPressure> alarm;
    private List<WearableFeatures.BloodPressure> eventLog;
    private List<WearableFeatures.BloodPressure> sdkLog;
    private List<WearableFeatures.BloodPressure> camera;
    private List<WearableFeatures.BloodPressure> highHR;
    private List<WearableFeatures.BloodPressure> screenTimeout;
    private List<WearableFeatures.BloodPressure> quickReplyForNotification;
    private List<WearableFeatures.BloodPressure> sevenDaysWeatherSupport;
    private List<WearableFeatures.BloodPressure> stepGoal;
    private List<WearableFeatures.BloodPressure> handWashReminder;
    private List<WearableFeatures.BloodPressure> agpsUpdate;
    private List<WearableFeatures.BloodPressure> autoHeartRate;
    private List<WearableFeatures.BloodPressure> restart;
    private List<WearableFeatures.BloodPressure> bluetoothCalling;
    private List<WearableFeatures.BloodPressure> calorieGoal;
    private List<WearableFeatures.BloodPressure> medication;
    private List<WearableFeatures.BloodPressure> pair;
    private List<WearableFeatures.BloodPressure> myCycle;
    private List<WearableFeatures.BloodPressure> iconForNotification;
    private List<WearableFeatures.BloodPressure> autoStress;
    private List<WearableFeatures.BloodPressure> otaUpgradeSupport;
    private List<WearableFeatures.BloodPressure> findBand;
    private List<WearableFeatures.BloodPressure> multiSportGoal;
    private List<WearableFeatures.BloodPressure> googleFit;
    private List<WearableFeatures.BloodPressure> activeTimeGoal;
    private List<WearableFeatures.BloodPressure> unitSystem;
    private List<WearableFeatures.BloodPressure> stressAndMood;

    private List<WearableFeatures.BloodPressure> testNotifications;

    private List<WearableFeatures.BloodPressure> eventReminder;

    private List<WearableFeatures.BloodPressure> connectedApps;

    private List<WearableFeatures.BloodPressure> syncContacts;

    private List<WearableFeatures.BloodPressure> myCycleOnWatch;

    private List<WearableFeatures.BloodPressure> findPhone;

    public List<WearableFeatures.BloodPressure> getIntensityGoal() {
      return this.intensityGoal;
    }

    public void setIntensityGoal(List<WearableFeatures.BloodPressure> intensityGoal) {
      this.intensityGoal = intensityGoal;
    }

    public List<WearableFeatures.BloodPressure> getResetPassword() {
      return this.resetPassword;
    }

    public void setResetPassword(List<WearableFeatures.BloodPressure> resetPassword) {
      this.resetPassword = resetPassword;
    }

    public List<WearableFeatures.BloodPressure> getSubscriptions() {
      return this.subscriptions;
    }

    public void setSubscriptions(List<WearableFeatures.BloodPressure> subscriptions) {
      this.subscriptions = subscriptions;
    }

    public List<WearableFeatures.BloodPressure> getHighStressReminder() {
      return this.highStressReminder;
    }

    public void setHighStressReminder(List<WearableFeatures.BloodPressure> highStressReminder) {
      this.highStressReminder = highStressReminder;
    }

    public List<WearableFeatures.BloodPressure> getAbout() {
      return this.about;
    }

    public void setAbout(List<WearableFeatures.BloodPressure> about) {
      this.about = about;
    }

    public List<WearableFeatures.BloodPressure> getAlexa() {
      return this.alexa;
    }

    public void setAlexa(List<WearableFeatures.BloodPressure> alexa) {
      this.alexa = alexa;
    }

    public List<WearableFeatures.BloodPressure> getDndFromWatchSupport() {
      return this.dndFromWatchSupport;
    }

    public void setDndFromWatchSupport(List<WearableFeatures.BloodPressure> dndFromWatchSupport) {
      this.dndFromWatchSupport = dndFromWatchSupport;
    }

    public List<WearableFeatures.BloodPressure> getLanguage() {
      return this.language;
    }

    public void setLanguage(List<WearableFeatures.BloodPressure> language) {
      this.language = language;
    }

    public List<WearableFeatures.BloodPressure> getBatteryOptimization() {
      return this.batteryOptimization;
    }

    public void setBatteryOptimization(List<WearableFeatures.BloodPressure> batteryOptimization) {
      this.batteryOptimization = batteryOptimization;
    }

    public List<WearableFeatures.BloodPressure> getLiftToViewFromWatchSupport() {
      return this.liftToViewFromWatchSupport;
    }

    public void setLiftToViewFromWatchSupport(List<WearableFeatures.BloodPressure> liftToViewFromWatchSupport) {
      this.liftToViewFromWatchSupport = liftToViewFromWatchSupport;
    }

    public List<WearableFeatures.BloodPressure> getMusic() {
      return this.music;
    }

    public void setMusic(List<WearableFeatures.BloodPressure> music) {
      this.music = music;
    }

    public List<WearableFeatures.BloodPressure> getLiftToView() {
      return this.liftToView;
    }

    public void setLiftToView(List<WearableFeatures.BloodPressure> liftToView) {
      this.liftToView = liftToView;
    }

    public List<WearableFeatures.BloodPressure> getWeather() {
      return this.weather;
    }

    public void setWeather(List<WearableFeatures.BloodPressure> weather) {
      this.weather = weather;
    }

    public List<WearableFeatures.BloodPressure> getDnd() {
      return this.dnd;
    }

    public void setDnd(List<WearableFeatures.BloodPressure> dnd) {
      this.dnd = dnd;
    }

    public List<WearableFeatures.BloodPressure> getOta() {
      return this.ota;
    }

    public void setOta(List<WearableFeatures.BloodPressure> ota) {
      this.ota = ota;
    }

    public List<WearableFeatures.BloodPressure> getWatchfaceDelete() {
      return this.watchfaceDelete;
    }

    public void setWatchfaceDelete(List<WearableFeatures.BloodPressure> watchfaceDelete) {
      this.watchfaceDelete = watchfaceDelete;
    }

    public List<WearableFeatures.BloodPressure> getWorldClock() {
      return this.worldClock;
    }

    public void setWorldClock(List<WearableFeatures.BloodPressure> worldClock) {
      this.worldClock = worldClock;
    }

    public List<WearableFeatures.BloodPressure> getQuickReply() {
      return this.quickReply;
    }

    public void setQuickReply(List<WearableFeatures.BloodPressure> quickReply) {
      this.quickReply = quickReply;
    }

    public List<WearableFeatures.BloodPressure> getAiSticker() {
      return this.aiSticker;
    }

    public void setAiSticker(List<WearableFeatures.BloodPressure> aiSticker) {
      this.aiSticker = aiSticker;
    }

    public List<WearableFeatures.BloodPressure> getMusicStorage() {
      return this.musicStorage;
    }

    public void setMusicStorage(List<WearableFeatures.BloodPressure> musicStorage) {
      this.musicStorage = musicStorage;
    }

    public List<WearableFeatures.BloodPressure> getLowSpO2Reminder() {
      return this.lowSpO2Reminder;
    }

    public void setLowSpO2Reminder(List<WearableFeatures.BloodPressure> lowSpO2Reminder) {
      this.lowSpO2Reminder = lowSpO2Reminder;
    }

    public List<WearableFeatures.BloodPressure> getAutoStressLogs() {
      return this.autoStressLogs;
    }

    public void setAutoStressLogs(List<WearableFeatures.BloodPressure> autoStressLogs) {
      this.autoStressLogs = autoStressLogs;
    }

    public List<WearableFeatures.BloodPressure> getDialSync() {
      return this.dialSync;
    }

    public void setDialSync(List<WearableFeatures.BloodPressure> dialSync) {
      this.dialSync = dialSync;
    }

    public List<WearableFeatures.BloodPressure> getEditMultiSport() {
      return this.editMultiSport;
    }

    public void setEditMultiSport(List<WearableFeatures.BloodPressure> editMultiSport) {
      this.editMultiSport = editMultiSport;
    }

    public List<WearableFeatures.BloodPressure> getStrava() {
      return this.strava;
    }

    public void setStrava(List<WearableFeatures.BloodPressure> strava) {
      this.strava = strava;
    }

    public List<WearableFeatures.BloodPressure> getActiveHourGoal() {
      return this.activeHourGoal;
    }

    public void setActiveHourGoal(List<WearableFeatures.BloodPressure> activeHourGoal) {
      this.activeHourGoal = activeHourGoal;
    }

    public List<WearableFeatures.BloodPressure> getAutoSleep() {
      return this.autoSleep;
    }

    public void setAutoSleep(List<WearableFeatures.BloodPressure> autoSleep) {
      this.autoSleep = autoSleep;
    }

    public List<WearableFeatures.BloodPressure> getSedentaryAlert() {
      return this.sedentaryAlert;
    }

    public void setSedentaryAlert(List<WearableFeatures.BloodPressure> sedentaryAlert) {
      this.sedentaryAlert = sedentaryAlert;
    }

    public List<WearableFeatures.BloodPressure> getVoiceAssistant() {
      return this.voiceAssistant;
    }

    public void setVoiceAssistant(List<WearableFeatures.BloodPressure> voiceAssistant) {
      this.voiceAssistant = voiceAssistant;
    }

    public List<WearableFeatures.BloodPressure> getTemperatureUnitSystem() {
      return this.temperatureUnitSystem;
    }

    public void setTemperatureUnitSystem(List<WearableFeatures.BloodPressure> temperatureUnitSystem) {
      this.temperatureUnitSystem = temperatureUnitSystem;
    }

    public List<WearableFeatures.BloodPressure> getNotificationsEnableDisable() {
      return this.notificationsEnableDisable;
    }

    public void setNotificationsEnableDisable(List<WearableFeatures.BloodPressure> notificationsEnableDisable) {
      this.notificationsEnableDisable = notificationsEnableDisable;
    }

    public List<WearableFeatures.BloodPressure> getSystemLogs() {
      return this.systemLogs;
    }

    public void setSystemLogs(List<WearableFeatures.BloodPressure> systemLogs) {
      this.systemLogs = systemLogs;
    }

    public List<WearableFeatures.BloodPressure> getHydration() {
      return this.hydration;
    }

    public void setHydration(List<WearableFeatures.BloodPressure> hydration) {
      this.hydration = hydration;
    }

    public List<WearableFeatures.BloodPressure> getWatchfaceWallpaper() {
      return this.watchfaceWallpaper;
    }

    public void setWatchfaceWallpaper(List<WearableFeatures.BloodPressure> watchfaceWallpaper) {
      this.watchfaceWallpaper = watchfaceWallpaper;
    }

    public List<WearableFeatures.BloodPressure> getDeviceInfoNotNeededForDnd() {
      return this.deviceInfoNotNeededForDnd;
    }

    public void setDeviceInfoNotNeededForDnd(List<WearableFeatures.BloodPressure> deviceInfoNotNeededForDnd) {
      this.deviceInfoNotNeededForDnd = deviceInfoNotNeededForDnd;
    }

    public List<WearableFeatures.BloodPressure> getAutoTemperature() {
      return this.autoTemperature;
    }

    public void setAutoTemperature(List<WearableFeatures.BloodPressure> autoTemperature) {
      this.autoTemperature = autoTemperature;
    }

    public List<WearableFeatures.BloodPressure> getDistanceGoal() {
      return this.distanceGoal;
    }

    public void setDistanceGoal(List<WearableFeatures.BloodPressure> distanceGoal) {
      this.distanceGoal = distanceGoal;
    }

    public List<WearableFeatures.BloodPressure> getECard() {
      return this.eCard;
    }

    public void setECard(List<WearableFeatures.BloodPressure> eCard) {
      this.eCard = eCard;
    }

    public List<WearableFeatures.BloodPressure> getAntiLost() {
      return this.antiLost;
    }

    public void setAntiLost(List<WearableFeatures.BloodPressure> antiLost) {
      this.antiLost = antiLost;
    }

    public List<WearableFeatures.BloodPressure> getSleepGoal() {
      return this.sleepGoal;
    }

    public void setSleepGoal(List<WearableFeatures.BloodPressure> sleepGoal) {
      this.sleepGoal = sleepGoal;
    }

    public List<WearableFeatures.BloodPressure> getNotifications() {
      return this.notifications;
    }

    public void setNotifications(List<WearableFeatures.BloodPressure> notifications) {
      this.notifications = notifications;
    }

    public List<WearableFeatures.BloodPressure> getAutoDetection() {
      return this.autoDetection;
    }

    public void setAutoDetection(List<WearableFeatures.BloodPressure> autoDetection) {
      this.autoDetection = autoDetection;
    }

    public List<WearableFeatures.BloodPressure> getDndIntervalSupport() {
      return this.dndIntervalSupport;
    }

    public void setDndIntervalSupport(List<WearableFeatures.BloodPressure> dndIntervalSupport) {
      this.dndIntervalSupport = dndIntervalSupport;
    }

    public List<WearableFeatures.BloodPressure> getBandLayout() {
      return this.bandLayout;
    }

    public void setBandLayout(List<WearableFeatures.BloodPressure> bandLayout) {
      this.bandLayout = bandLayout;
    }

    public List<WearableFeatures.BloodPressure> getFavouriteContacts() {
      return this.favouriteContacts;
    }

    public void setFavouriteContacts(List<WearableFeatures.BloodPressure> favouriteContacts) {
      this.favouriteContacts = favouriteContacts;
    }

    public List<WearableFeatures.BloodPressure> getFactoryReset() {
      return this.factoryReset;
    }

    public void setFactoryReset(List<WearableFeatures.BloodPressure> factoryReset) {
      this.factoryReset = factoryReset;
    }

    public List<WearableFeatures.BloodPressure> getSensorHubOtaTest() {
      return this.sensorHubOtaTest;
    }

    public void setSensorHubOtaTest(List<WearableFeatures.BloodPressure> sensorHubOtaTest) {
      this.sensorHubOtaTest = sensorHubOtaTest;
    }

    public List<WearableFeatures.BloodPressure> getAutoSpo2() {
      return this.autoSpo2;
    }

    public void setAutoSpo2(List<WearableFeatures.BloodPressure> autoSpo2) {
      this.autoSpo2 = autoSpo2;
    }

    public List<WearableFeatures.BloodPressure> getSosContacts() {
      return this.sosContacts;
    }

    public void setSosContacts(List<WearableFeatures.BloodPressure> sosContacts) {
      this.sosContacts = sosContacts;
    }

    public List<WearableFeatures.BloodPressure> getAlexaLog() {
      return this.alexaLog;
    }

    public void setAlexaLog(List<WearableFeatures.BloodPressure> alexaLog) {
      this.alexaLog = alexaLog;
    }

    public List<WearableFeatures.BloodPressure> getAlarm() {
      return this.alarm;
    }

    public void setAlarm(List<WearableFeatures.BloodPressure> alarm) {
      this.alarm = alarm;
    }

    public List<WearableFeatures.BloodPressure> getEventLog() {
      return this.eventLog;
    }

    public void setEventLog(List<WearableFeatures.BloodPressure> eventLog) {
      this.eventLog = eventLog;
    }

    public List<WearableFeatures.BloodPressure> getSdkLog() {
      return this.sdkLog;
    }

    public void setSdkLog(List<WearableFeatures.BloodPressure> sdkLog) {
      this.sdkLog = sdkLog;
    }

    public List<WearableFeatures.BloodPressure> getCamera() {
      return this.camera;
    }

    public void setCamera(List<WearableFeatures.BloodPressure> camera) {
      this.camera = camera;
    }

    public List<WearableFeatures.BloodPressure> getHighHR() {
      return this.highHR;
    }

    public void setHighHR(List<WearableFeatures.BloodPressure> highHR) {
      this.highHR = highHR;
    }

    public List<WearableFeatures.BloodPressure> getScreenTimeout() {
      return this.screenTimeout;
    }

    public void setScreenTimeout(List<WearableFeatures.BloodPressure> screenTimeout) {
      this.screenTimeout = screenTimeout;
    }

    public List<WearableFeatures.BloodPressure> getQuickReplyForNotification() {
      return this.quickReplyForNotification;
    }

    public void setQuickReplyForNotification(List<WearableFeatures.BloodPressure> quickReplyForNotification) {
      this.quickReplyForNotification = quickReplyForNotification;
    }

    public List<WearableFeatures.BloodPressure> getSevenDaysWeatherSupport() {
      return this.sevenDaysWeatherSupport;
    }

    public void setSevenDaysWeatherSupport(List<WearableFeatures.BloodPressure> sevenDaysWeatherSupport) {
      this.sevenDaysWeatherSupport = sevenDaysWeatherSupport;
    }

    public List<WearableFeatures.BloodPressure> getStepGoal() {
      return this.stepGoal;
    }

    public void setStepGoal(List<WearableFeatures.BloodPressure> stepGoal) {
      this.stepGoal = stepGoal;
    }

    public List<WearableFeatures.BloodPressure> getHandWashReminder() {
      return this.handWashReminder;
    }

    public void setHandWashReminder(List<WearableFeatures.BloodPressure> handWashReminder) {
      this.handWashReminder = handWashReminder;
    }

    public List<WearableFeatures.BloodPressure> getAgpsUpdate() {
      return this.agpsUpdate;
    }

    public void setAgpsUpdate(List<WearableFeatures.BloodPressure> agpsUpdate) {
      this.agpsUpdate = agpsUpdate;
    }

    public List<WearableFeatures.BloodPressure> getAutoHeartRate() {
      return this.autoHeartRate;
    }

    public void setAutoHeartRate(List<WearableFeatures.BloodPressure> autoHeartRate) {
      this.autoHeartRate = autoHeartRate;
    }

    public List<WearableFeatures.BloodPressure> getRestart() {
      return this.restart;
    }

    public void setRestart(List<WearableFeatures.BloodPressure> restart) {
      this.restart = restart;
    }

    public List<WearableFeatures.BloodPressure> getBluetoothCalling() {
      return this.bluetoothCalling;
    }

    public void setBluetoothCalling(List<WearableFeatures.BloodPressure> bluetoothCalling) {
      this.bluetoothCalling = bluetoothCalling;
    }

    public List<WearableFeatures.BloodPressure> getCalorieGoal() {
      return this.calorieGoal;
    }

    public void setCalorieGoal(List<WearableFeatures.BloodPressure> calorieGoal) {
      this.calorieGoal = calorieGoal;
    }

    public List<WearableFeatures.BloodPressure> getMedication() {
      return this.medication;
    }

    public void setMedication(List<WearableFeatures.BloodPressure> medication) {
      this.medication = medication;
    }

    public List<WearableFeatures.BloodPressure> getPair() {
      return this.pair;
    }

    public void setPair(List<WearableFeatures.BloodPressure> pair) {
      this.pair = pair;
    }

    public List<WearableFeatures.BloodPressure> getMyCycle() {
      return this.myCycle;
    }

    public void setMyCycle(List<WearableFeatures.BloodPressure> myCycle) {
      this.myCycle = myCycle;
    }

    public List<WearableFeatures.BloodPressure> getIconForNotification() {
      return this.iconForNotification;
    }

    public void setIconForNotification(List<WearableFeatures.BloodPressure> iconForNotification) {
      this.iconForNotification = iconForNotification;
    }

    public List<WearableFeatures.BloodPressure> getAutoStress() {
      return this.autoStress;
    }

    public void setAutoStress(List<WearableFeatures.BloodPressure> autoStress) {
      this.autoStress = autoStress;
    }

    public List<WearableFeatures.BloodPressure> getOtaUpgradeSupport() {
      return this.otaUpgradeSupport;
    }

    public void setOtaUpgradeSupport(List<WearableFeatures.BloodPressure> otaUpgradeSupport) {
      this.otaUpgradeSupport = otaUpgradeSupport;
    }

    public List<WearableFeatures.BloodPressure> getFindBand() {
      return this.findBand;
    }

    public void setFindBand(List<WearableFeatures.BloodPressure> findBand) {
      this.findBand = findBand;
    }

    public List<WearableFeatures.BloodPressure> getMultiSportGoal() {
      return this.multiSportGoal;
    }

    public void setMultiSportGoal(List<WearableFeatures.BloodPressure> multiSportGoal) {
      this.multiSportGoal = multiSportGoal;
    }

    public List<WearableFeatures.BloodPressure> getGoogleFit() {
      return this.googleFit;
    }

    public void setGoogleFit(List<WearableFeatures.BloodPressure> googleFit) {
      this.googleFit = googleFit;
    }

    public List<WearableFeatures.BloodPressure> getActiveTimeGoal() {
      return this.activeTimeGoal;
    }

    public void setActiveTimeGoal(List<WearableFeatures.BloodPressure> activeTimeGoal) {
      this.activeTimeGoal = activeTimeGoal;
    }

    public List<WearableFeatures.BloodPressure> getUnitSystem() {
      return this.unitSystem;
    }

    public void setUnitSystem(List<WearableFeatures.BloodPressure> unitSystem) {
      this.unitSystem = unitSystem;
    }

    public List<WearableFeatures.BloodPressure> getStressAndMood() {
      return this.stressAndMood;
    }

    public void setStressAndMood(List<WearableFeatures.BloodPressure> stressAndMood) {
      this.stressAndMood = stressAndMood;
    }

    public List<WearableFeatures.BloodPressure> getTestNotifications() {
      return this.testNotifications;
    }

    public void setTestNotifications(List<WearableFeatures.BloodPressure> testNotifications) {
      this.testNotifications = testNotifications;
    }

    public List<WearableFeatures.BloodPressure> getEventReminder() {
      return this.eventReminder;
    }

    public void setEventReminder(List<WearableFeatures.BloodPressure> eventReminder) {
      this.eventReminder = eventReminder;
    }

    public List<WearableFeatures.BloodPressure> getConnectedApps() {
      return this.connectedApps;
    }

    public void setConnectedApps(List<WearableFeatures.BloodPressure> connectedApps) {
      this.connectedApps = connectedApps;
    }

    public List<WearableFeatures.BloodPressure> getSyncContacts() {
      return this.syncContacts;
    }

    public void setSyncContacts(List<WearableFeatures.BloodPressure> syncContacts) {
      this.syncContacts = syncContacts;
    }

    public List<WearableFeatures.BloodPressure> getMyCycleOnWatch() {
      return this.myCycleOnWatch;
    }

    public void setMyCycleOnWatch(List<WearableFeatures.BloodPressure> myCycleOnWatch) {
      this.myCycleOnWatch = myCycleOnWatch;
    }

    public List<WearableFeatures.BloodPressure> getFindPhone() {
      return this.findPhone;
    }

    public void setFindPhone(List<WearableFeatures.BloodPressure> findPhone) {
      this.findPhone = findPhone;
    }
  }

  public static class PlatformFeatures implements Serializable {
    private RelaxMusic relaxMusic;

    private RelaxMusic articles;

    public RelaxMusic getRelaxMusic() {
      return this.relaxMusic;
    }

    public void setRelaxMusic(RelaxMusic relaxMusic) {
      this.relaxMusic = relaxMusic;
    }

    public RelaxMusic getArticles() {
      return this.articles;
    }

    public void setArticles(RelaxMusic articles) {
      this.articles = articles;
    }

    public static class RelaxMusic implements Serializable {
      private Boolean enable;

      public Boolean getEnable() {
        return this.enable;
      }

      public void setEnable(Boolean enable) {
        this.enable = enable;
      }
    }
  }
}
