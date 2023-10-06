package com.titan.models.smart_world;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

public class MultiSportConfig implements Serializable {
  private List<String> easyTechAddMSCalories;

  private String imageUrl;

  private List<String> paceCategories;

  private List<String> category;

  private List<String> multiSports;

  private List<String> strava;

  public List<String> getEasyTechAddMSCalories() {
    return this.easyTechAddMSCalories;
  }

  public void setEasyTechAddMSCalories(List<String> easyTechAddMSCalories) {
    this.easyTechAddMSCalories = easyTechAddMSCalories;
  }

  public String getImageUrl() {
    return this.imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public List<String> getPaceCategories() {
    return this.paceCategories;
  }

  public void setPaceCategories(List<String> paceCategories) {
    this.paceCategories = paceCategories;
  }

  public List<String> getCategory() {
    return this.category;
  }

  public void setCategory(List<String> category) {
    this.category = category;
  }

  public List<String> getMultiSports() {
    return this.multiSports;
  }

  public void setMultiSports(List<String> multiSports) {
    this.multiSports = multiSports;
  }

  public List<String> getStrava() {
    return this.strava;
  }

  public void setStrava(List<String> strava) {
    this.strava = strava;
  }
}
