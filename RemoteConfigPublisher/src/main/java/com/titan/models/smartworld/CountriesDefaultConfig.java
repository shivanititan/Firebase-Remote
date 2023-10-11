package com.titan.models.smartworld;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class CountriesDefaultConfig implements Serializable {
  private Boolean emailOTP;

  private String code;

  private String name;

  private List<Integer> maxLength;

  private Boolean enabled;

  private Boolean mobileOTP;

  public Boolean getEmailOTP() {
    return this.emailOTP;
  }

  public void setEmailOTP(Boolean emailOTP) {
    this.emailOTP = emailOTP;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Integer> getMaxLength() {
    return this.maxLength;
  }

  public void setMaxLength(List<Integer> maxLength) {
    this.maxLength = maxLength;
  }

  public Boolean getEnabled() {
    return this.enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Boolean getMobileOTP() {
    return this.mobileOTP;
  }

  public void setMobileOTP(Boolean mobileOTP) {
    this.mobileOTP = mobileOTP;
  }
}
