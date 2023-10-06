package com.titan.models.smart_world;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

public class LiveChatConfig implements Serializable {
  private List<Filter> filter;

  private String license;

  private Boolean settings;

  private String groupID;

  private Boolean dashboard;

  public List<Filter> getFilter() {
    return this.filter;
  }

  public void setFilter(List<Filter> filter) {
    this.filter = filter;
  }

  public String getLicense() {
    return this.license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Boolean getSettings() {
    return this.settings;
  }

  public void setSettings(Boolean settings) {
    this.settings = settings;
  }

  public String getGroupID() {
    return this.groupID;
  }

  public void setGroupID(String groupID) {
    this.groupID = groupID;
  }

  public Boolean getDashboard() {
    return this.dashboard;
  }

  public void setDashboard(Boolean dashboard) {
    this.dashboard = dashboard;
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
