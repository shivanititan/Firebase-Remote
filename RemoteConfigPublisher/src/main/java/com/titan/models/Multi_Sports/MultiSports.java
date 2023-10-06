package com.titan.models.Multi_Sports;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiSports implements Serializable {
        private int androidId;
        public HashMap<String, List<String>> androidMappingFromSdk;
        private List<String> androidMappingId;
        private String category;
        private int iOSId;
        private HashMap<String, List<String>> iOSMappingFromSdk;
        private String image;
        private String name;
        private List<String> serverKey;
        private String strava;
        private String type;


        public int getAndroidId() {
            return androidId;
        }

        public void setAndroidId(int androidId) {
            this.androidId = androidId;
        }

        public Map<String, List<String>> getAndroidMappingFromSdk() {
            return androidMappingFromSdk;
        }

        public void setAndroidMappingFromSdk(HashMap<String, List<String>> androidMappingFromSdk) {
            this.androidMappingFromSdk = androidMappingFromSdk;
        }

        public List<String> getAndroidMappingId() {
            return androidMappingId;
        }

        public void setAndroidMappingId(List<String> androidMappingId) {
            this.androidMappingId = androidMappingId;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getiOSId() {
            return iOSId;
        }

        public void setiOSId(int iOSId) {
            this.iOSId = iOSId;
        }

        public Map<String, List<String>> getiOSMappingFromSdk() {
            return iOSMappingFromSdk;
        }

        public void setiOSMappingFromSdk(HashMap<String, List<String>> iOSMappingFromSdk) {
            this.iOSMappingFromSdk = iOSMappingFromSdk;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getServerKey() {
            return serverKey;
        }

        public void setServerKey(List<String> serverKey) {
            this.serverKey = serverKey;
        }

        public String getStrava() {
            return strava;
        }

        public void setStrava(String strava) {
            this.strava = strava;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

}


