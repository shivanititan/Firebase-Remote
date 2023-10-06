package com.titan.models.smart_world;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

public class UrlConfig implements Serializable {
  private String name;

  private List<Conditions> conditions;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Conditions> getConditions() {
    return this.conditions;
  }

  public void setConditions(List<Conditions> conditions) {
    this.conditions = conditions;
  }

  public static class Conditions implements Serializable {
    private String result;

    private String condition;

    private String type;

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
}
