package com.titan.models.smartworld;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

public class GamiFicationConfig implements Serializable {
  private Dashboard dashboard;

  public Dashboard getDashboard() {
    return this.dashboard;
  }

  public void setDashboard(Dashboard dashboard) {
    this.dashboard = dashboard;
  }

  public static class Dashboard implements Serializable {
    private List<Filter> filter;

    private Boolean enable;

    private String url;

    public List<Filter> getFilter() {
      return this.filter;
    }

    public void setFilter(List<Filter> filter) {
      this.filter = filter;
    }

    public Boolean getEnable() {
      return this.enable;
    }

    public void setEnable(Boolean enable) {
      this.enable = enable;
    }

    public String getUrl() {
      return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }

    public static class Filter implements Serializable {
      private String condition;

      private List<String> pattern;

      private String type;

      public String getCondition() {
        return this.condition;
      }

      public void setCondition(String condition) {
        this.condition = condition;
      }

      public List<String> getPattern() {
        return this.pattern;
      }

      public void setPattern(List<String> pattern) {
        this.pattern = pattern;
      }

      public String getType() {
        return this.type;
      }

      public void setType(String type) {
        this.type = type;
      }
    }
  }
}
