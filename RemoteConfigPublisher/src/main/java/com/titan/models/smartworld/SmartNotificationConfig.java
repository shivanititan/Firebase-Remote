package com.titan.models.smartworld;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class SmartNotificationConfig implements Serializable {
  private List<Mapping> mapping;



  private List<String> packageNames;

  private String name;

  private List<String> defaultForProducts;

  public List<Mapping> getMapping() {
    return this.mapping;
  }

  public void setMapping(List<Mapping> mapping) {
    this.mapping = mapping;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public List<String> getPackageNames() {
    return packageNames;
  }

  public void setPackageNames(List<String> packageNames) {
    this.packageNames = packageNames;
  }

  public List<String> getDefaultForProducts() {
    return this.defaultForProducts;
  }

  public void setDefaultForProducts(List<String> defaultForProducts) {
    this.defaultForProducts = defaultForProducts;
  }

  public static class Mapping implements Serializable {
    private List<String> product;

    private Integer id;

    public List<String> getProduct() {
      return this.product;
    }

    public void setProduct(List<String> product) {
      this.product = product;
    }

    public Integer getId() {
      return this.id;
    }

    public void setId(Integer id) {
      this.id = id;
    }
  }
}
