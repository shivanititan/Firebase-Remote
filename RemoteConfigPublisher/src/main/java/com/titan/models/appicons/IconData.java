package com.titan.models.appicons;

import java.io.Serializable;

public class IconData implements Serializable {
    public static class AndroidData implements Serializable {
        private String default_icon;
        private int w;
        private int h;
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

    public static class IOSData implements Serializable {
        private String default_icon;
        private int w;
        private int h;

        // Getters and setters for IOSData
    }

    private String name;
    private String uniqueId;
    private String type;
    private String url;
    private AndroidData android;
    private IOSData iOS;

    // Getters and setters for the main fields

    @Override
    public String toString() {
        return "IconData{" +
                "name='" + name + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", android=" + android +
                ", iOS=" + iOS +
                '}';
    }
}

