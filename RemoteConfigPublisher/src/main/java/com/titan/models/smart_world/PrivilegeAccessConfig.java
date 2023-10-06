package com.titan.models.smart_world;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

public class PrivilegeAccessConfig implements Serializable {
  private Integer syncTime;

  private String access;

  private String type;

  private String key;

  public Integer getSyncTime() {
    return this.syncTime;
  }

  public void setSyncTime(Integer syncTime) {
    this.syncTime = syncTime;
  }

  public String getAccess() {
    return this.access;
  }

  public void setAccess(String access) {
    this.access = access;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }
}
