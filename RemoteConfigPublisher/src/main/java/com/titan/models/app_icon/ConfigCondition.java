package com.titan.models.app_icon;

import java.io.Serializable;

public class ConfigCondition implements Serializable {
    private String type;
    private String condition;
    private String result;


    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCondition() {
        return this.condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

