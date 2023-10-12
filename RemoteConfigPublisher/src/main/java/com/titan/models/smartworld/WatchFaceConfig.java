//package com.titan.models.smartworld;
//
//import java.io.Serializable;
//import java.util.List;
//import java.util.Map;
//
//public class WatchFaceConfig implements Serializable {
//    private List<PlatformData> android;
//    private List<PlatformData> iOS;
//
//    // Getters and setters for android and iOS fields
//
//    public List<PlatformData> getAndroid() {
//        return android;
//    }
//
//    public void setAndroid(List<PlatformData> android) {
//        this.android = android;
//    }
//
//    public List<PlatformData> getiOS() {
//        return iOS;
//    }
//
//    public void setiOS(List<PlatformData> iOS) {
//        this.iOS = iOS;
//    }
//}
//
//class PlatformData implements Serializable {
//    private List<CloudData> cloud;
//    private Integer cornerRadius;
//    private List<String> products;
//
//    // Getters and setters for cloud, cornerRadius, and products fields
//
//    public List<CloudData> getCloud() {
//        return cloud;
//    }
//
//    public void setCloud(List<CloudData> cloud) {
//        this.cloud = cloud;
//    }
//
//    public Integer getCornerRadius() {
//        return cornerRadius;
//    }
//
//    public void setCornerRadius(Integer cornerRadius) {
//        this.cornerRadius = cornerRadius;
//    }
//
//    public List<String> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<String> products) {
//        this.products = products;
//    }
//}
//
//class CloudData implements Serializable {
//    private Map<String, Object> strap;
//    private Map<String, Object> watchface;
//
//    // Getters and setters for strap and watchface fields
//
//    public Map<String, Object> getStrap() {
//        return strap;
//    }
//
//    public void setStrap(Map<String, Object> strap) {
//        this.strap = strap;
//    }
//
//    public Map<String, Object> getWatchface() {
//        return watchface;
//    }
//
//    public void setWatchface(Map<String, Object> watchface) {
//        this.watchface = watchface;
//    }
//
//    class WatchFace implements Serializable {
//        private String centerY;
//        private String height;
//        private String width;
//
//        private String centerX;
//
//        public String getCenterX() {
//            return centerX;
//        }
//
//        public void setCenterX(String centerX) {
//            this.centerX = centerX;
//        }
//
//        public String getCenterY() {
//            return centerY;
//        }
//
//        public void setCenterY(String centerY) {
//            this.centerY = centerY;
//        }
//
//        public String getHeight() {
//            return height;
//        }
//
//        public void setHeight(String height) {
//            this.height = height;
//        }
//
//        public String getWidth() {
//            return width;
//        }
//
//        public void setWidth(String width) {
//            this.width = width;
//        }
//
//    }
//}
