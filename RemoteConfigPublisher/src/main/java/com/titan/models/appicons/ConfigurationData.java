package com.titan.models.appicons;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

public class ConfigurationData implements Serializable {
    private String default_icon;
    private int w;
    private int h;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int padding;

    public String getDefault_icon() {
        return default_icon;
    }

    public void setDefault_icon(String default_icon) {
        this.default_icon = default_icon;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }
}
