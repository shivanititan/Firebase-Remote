package com.titan.models.app_icon;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;

public class DashboardIconConfig implements Serializable {
  private Icon3 icon3;

  public Icon3 getIcon3() {
    return this.icon3;
  }

  public void setIcon3(Icon3 icon3) {
    this.icon3 = icon3;
  }

  public static class Icon3 implements Serializable {
    private Reflex reflex;

    public Reflex getReflex() {
      return this.reflex;
    }

    public void setReflex(Reflex reflex) {
      this.reflex = reflex;
    }

    public static class Reflex implements Serializable {
      private Android android;

      private String name;

      private String type;

      private IOS iOS;

      private String uniqueId;

      private String url;

      public Android getAndroid() {
        return this.android;
      }

      public void setAndroid(Android android) {
        this.android = android;
      }

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String getType() {
        return this.type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public IOS getIOS() {
        return this.iOS;
      }

      public void setIOS(IOS iOS) {
        this.iOS = iOS;
      }

      public String getUniqueId() {
        return this.uniqueId;
      }

      public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
      }

      public String getUrl() {
        return this.url;
      }

      public void setUrl(String url) {
        this.url = url;
      }

      public static class Android implements Serializable {
        private Integer padding;

        private Double w;

        private Double h;

        private String default_icon;

        public Integer getPadding() {
          return this.padding;
        }

        public void setPadding(Integer padding) {
          this.padding = padding;
        }

        public Double getW() {
          return this.w;
        }

        public void setW(Double w) {
          this.w = w;
        }

        public Double getH() {
          return this.h;
        }

        public void setH(Double h) {
          this.h = h;
        }

        public String getDefault_icon() {
          return this.default_icon;
        }

        public void setDefault_icon(String default_icon) {
          this.default_icon = default_icon;
        }
      }

      public static class IOS implements Serializable {
        private Double w;

        private Integer h;

        private String default_icon;

        public Double getW() {
          return this.w;
        }

        public void setW(Double w) {
          this.w = w;
        }

        public Integer getH() {
          return this.h;
        }

        public void setH(Integer h) {
          this.h = h;
        }

        public String getDefault_icon() {
          return this.default_icon;
        }

        public void setDefault_icon(String default_icon) {
          this.default_icon = default_icon;
        }
      }
    }
  }
}
