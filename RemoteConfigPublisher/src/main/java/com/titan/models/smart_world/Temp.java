package com.titan.models.smart_world;

import java.io.Serializable;
import java.util.List;

public class Temp implements Serializable {
    private List<PlatformData> android;

    public List<PlatformData> getAndroid() {
        return android;
    }

    public void setAndroid(List<PlatformData> android) {
        this.android = android;
    }
}

class PlatformData implements Serializable {
    private List<CloudData> cloud;
    private List<String> product;
    private CustomData custom;

    public List<CloudData> getCloud() {
        return cloud;
    }

    public void setCloud(List<CloudData> cloud) {
        this.cloud = cloud;
    }

    public List<String> getProduct() {
        return product;
    }

    public void setProduct(List<String> product) {
        this.product = product;
    }

    public CustomData getCustom() {
        return custom;
    }

    public void setCustom(CustomData custom) {
        this.custom = custom;
    }
}

class CloudData implements Serializable {
    private String height;
    private String type;
    private String width;
    private String paddingRight;


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getPaddingRight() {
        return paddingRight;
    }

    public void setPaddingRight(String paddingRight) {
        this.paddingRight = paddingRight;
    }
}

class CustomData implements Serializable {
    private CropData crop;
    private List<FilterData> filter;

    public CropData getCrop() {
        return crop;
    }

    public void setCrop(CropData crop) {
        this.crop = crop;
    }

    public List<FilterData> getFilter() {
        return filter;
    }

    public void setFilter(List<FilterData> filter) {
        this.filter = filter;
    }
}

class CropData implements Serializable {
    private int height;
    private int ratioX;
    private int ratioY;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRatioX() {
        return ratioX;
    }

    public void setRatioX(int ratioX) {
        this.ratioX = ratioX;
    }

    public int getRatioY() {
        return ratioY;
    }

    public void setRatioY(int ratioY) {
        this.ratioY = ratioY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

class FilterData implements Serializable {
    private String height;
    private String type;
    private String width;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
}
