package com.titan.models.smart_world;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

public class MultiSportCategory implements Serializable {
  private List<String> tasksId;

  private String taskName;

  private String category;

  public List<String> getTasksId() {
    return this.tasksId;
  }

  public void setTasksId(List<String> tasksId) {
    this.tasksId = tasksId;
  }

  public String getTaskName() {
    return this.taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
