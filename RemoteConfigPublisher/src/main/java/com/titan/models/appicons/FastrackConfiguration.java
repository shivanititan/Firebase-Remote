package com.titan.models.appicons;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

public class FastrackConfiguration implements Serializable {
    private String name;
    private String uniqueId;
    private String type;
    private String url;
    private ConfigurationData android;
    private ConfigurationData iOS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ConfigurationData getAndroid() {
        return android;
    }

    public void setAndroid(ConfigurationData android) {
        this.android = android;
    }

    public ConfigurationData getiOS() {
        return iOS;
    }

    public void setiOS(ConfigurationData iOS) {
        this.iOS = iOS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
