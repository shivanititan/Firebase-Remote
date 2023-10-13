package com.titan.models.smartworld.supported.features;

import java.io.Serializable;

public class PlatformFeatures implements Serializable {
    private FeatureOption articles;
    private FeatureOption relaxMusic;

    public FeatureOption getArticles() {
        return articles;
    }

    public void setArticles(FeatureOption articles) {
        this.articles = articles;
    }

    public FeatureOption getRelaxMusic() {
        return relaxMusic;
    }

    public void setRelaxMusic(FeatureOption relaxMusic) {
        this.relaxMusic = relaxMusic;
    }
}
