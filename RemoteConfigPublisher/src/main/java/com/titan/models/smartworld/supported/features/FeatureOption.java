package com.titan.models.smartworld.supported.features;

import java.io.Serializable;
import java.util.List;

public class FeatureOption implements Serializable {
    private boolean enable;
    private List<String> filter;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public List<String> getFilter() {
        return filter;
    }

    public void setFilter(List<String> filter) {
        this.filter = filter;
    }

}
