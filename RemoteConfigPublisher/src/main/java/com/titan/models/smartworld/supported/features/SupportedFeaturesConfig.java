package com.titan.models.smartworld.supported.features;

import java.io.Serializable;
import java.util.List;

public class SupportedFeaturesConfig implements Serializable {

    private WearableFeatures wearableFeatures;
    private WearableSettings wearableSettings;
    private PlatformFeatures platformFeatures;
    private List<String> types;
    private List<String> conditions;

    public WearableFeatures getWearableFeatures() {
        return wearableFeatures;
    }

    public void setWearableFeatures(WearableFeatures wearableFeatures) {
        this.wearableFeatures = wearableFeatures;
    }

    public WearableSettings getWearableSettings() {
        return wearableSettings;
    }

    public void setWearableSettings(WearableSettings wearableSettings) {
        this.wearableSettings = wearableSettings;
    }

    public PlatformFeatures getPlatformFeatures() {
        return platformFeatures;
    }

    public void setPlatformFeatures(PlatformFeatures platformFeatures) {
        this.platformFeatures = platformFeatures;
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

