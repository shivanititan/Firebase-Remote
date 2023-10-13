package com.titan.models.smartworld.supported.features;

import java.io.Serializable;
import java.util.List;

public class WearableFeatures implements Serializable {
    private List<FeatureCondition> myFitness;
    private List<FeatureCondition> sleep;
    private List<FeatureCondition> remSleep;
    private List<FeatureCondition> napSleep;
    private List<FeatureCondition> awakeSleep;
    private List<FeatureCondition> heartRate;
    private List<FeatureCondition> bloodOxygen;
    private List<FeatureCondition> bloodPressure;
    private List<FeatureCondition> myCycle;
    private List<FeatureCondition> multiSport;
    private List<FeatureCondition> settings;
    private List<FeatureCondition> watchFace;
    private List<FeatureCondition> stress;
    private List<FeatureCondition> mood;
    private List<FeatureCondition> ecg;
    private List<FeatureCondition> hrv;
    private List<FeatureCondition> respiratoryRate;
    private List<FeatureCondition> bodyEnergy;
    private List<FeatureCondition> smartCompetitor;
    private List<FeatureCondition> runningTraining;
    private List<FeatureCondition> temperature;

    public List<FeatureCondition> getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(List<FeatureCondition> bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public List<FeatureCondition> getTemperature() {
        return temperature;
    }

    public void setTemperature(List<FeatureCondition> temperature) {
        this.temperature = temperature;
    }

    public List<FeatureCondition> getMyFitness() {
        return myFitness;
    }

    public void setMyFitness(List<FeatureCondition> myFitness) {
        this.myFitness = myFitness;
    }

    public List<FeatureCondition> getSleep() {
        return sleep;
    }

    public void setSleep(List<FeatureCondition> sleep) {
        this.sleep = sleep;
    }

    public List<FeatureCondition> getRemSleep() {
        return remSleep;
    }

    public void setRemSleep(List<FeatureCondition> remSleep) {
        this.remSleep = remSleep;
    }

    public List<FeatureCondition> getNapSleep() {
        return napSleep;
    }

    public void setNapSleep(List<FeatureCondition> napSleep) {
        this.napSleep = napSleep;
    }

    public List<FeatureCondition> getAwakeSleep() {
        return awakeSleep;
    }

    public void setAwakeSleep(List<FeatureCondition> awakeSleep) {
        this.awakeSleep = awakeSleep;
    }

    public List<FeatureCondition> getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(List<FeatureCondition> heartRate) {
        this.heartRate = heartRate;
    }

    public List<FeatureCondition> getBloodOxygen() {
        return bloodOxygen;
    }

    public void setBloodOxygen(List<FeatureCondition> bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    public List<FeatureCondition> getMyCycle() {
        return myCycle;
    }

    public void setMyCycle(List<FeatureCondition> myCycle) {
        this.myCycle = myCycle;
    }

    public List<FeatureCondition> getMultiSport() {
        return multiSport;
    }

    public void setMultiSport(List<FeatureCondition> multiSport) {
        this.multiSport = multiSport;
    }

    public List<FeatureCondition> getSettings() {
        return settings;
    }

    public void setSettings(List<FeatureCondition> settings) {
        this.settings = settings;
    }

    public List<FeatureCondition> getWatchFace() {
        return watchFace;
    }

    public void setWatchFace(List<FeatureCondition> watchFace) {
        this.watchFace = watchFace;
    }

    public List<FeatureCondition> getStress() {
        return stress;
    }

    public void setStress(List<FeatureCondition> stress) {
        this.stress = stress;
    }

    public List<FeatureCondition> getMood() {
        return mood;
    }

    public void setMood(List<FeatureCondition> mood) {
        this.mood = mood;
    }

    public List<FeatureCondition> getEcg() {
        return ecg;
    }

    public void setEcg(List<FeatureCondition> ecg) {
        this.ecg = ecg;
    }

    public List<FeatureCondition> getHrv() {
        return hrv;
    }

    public void setHrv(List<FeatureCondition> hrv) {
        this.hrv = hrv;
    }

    public List<FeatureCondition> getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(List<FeatureCondition> respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public List<FeatureCondition> getBodyEnergy() {
        return bodyEnergy;
    }

    public void setBodyEnergy(List<FeatureCondition> bodyEnergy) {
        this.bodyEnergy = bodyEnergy;
    }

    public List<FeatureCondition> getSmartCompetitor() {
        return smartCompetitor;
    }

    public void setSmartCompetitor(List<FeatureCondition> smartCompetitor) {
        this.smartCompetitor = smartCompetitor;
    }

    public List<FeatureCondition> getRunningTraining() {
        return runningTraining;
    }

    public void setRunningTraining(List<FeatureCondition> runningTraining) {
        this.runningTraining = runningTraining;
    }
}
