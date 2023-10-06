package com.titan.models.smart_world;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

public class GoogleFitConfig implements Serializable {
  private List<Filter> filter;

  private String name;

  public List<Filter> getFilter() {
    return this.filter;
  }

  public void setFilter(List<Filter> filter) {
    this.filter = filter;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
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
