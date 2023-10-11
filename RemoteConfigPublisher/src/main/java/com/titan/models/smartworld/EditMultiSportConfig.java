package com.titan.models.smartworld;

import java.io.Serializable;
import java.lang.String;

public class EditMultiSportConfig implements Serializable {
  private String sportID;

  private String sportName;

  public String getSportID() {
    return this.sportID;
  }

  public void setSportID(String sportID) {
    this.sportID = sportID;
  }

  public String getSportName() {
    return this.sportName;
  }

  public void setSportName(String sportName) {
    this.sportName = sportName;
  }
}
