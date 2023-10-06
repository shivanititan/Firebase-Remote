package com.titan.models.app_icon;

import java.io.Serializable;
import java.lang.String;

public class AppIconConfig implements Serializable {
  private Text1 text1;

  private Text1 icon1;

  private Text1 icon2;

  public Text1 getText1() {
    return this.text1;
  }

  public void setText1(Text1 text1) {
    this.text1 = text1;
  }

  public Text1 getIcon1() {
    return this.icon1;
  }

  public void setIcon1(Text1 icon1) {
    this.icon1 = icon1;
  }

  public Text1 getIcon2() {
    return this.icon2;
  }

  public void setIcon2(Text1 icon2) {
    this.icon2 = icon2;
  }

  public  class Text1 implements Serializable {
    private Fastrack fastrack;

    public Fastrack getFastrack() {
      return this.fastrack;
    }

    public void setFastrack(Fastrack fastrack) {
      this.fastrack = fastrack;
    }

    public  class Fastrack implements Serializable {
      private String name;

      private String content;

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String getContent() {
        return this.content;
      }

      public void setContent(String content) {
        this.content = content;
      }
    }
  }
}
