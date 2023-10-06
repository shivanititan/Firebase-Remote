package com.titan.models.smart_world;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class SupportedProductsConfig implements Serializable {
  private String watchImageURL;
  private Map<String, List<Product>> products;

  private List<Product> titan;
  private List<Product> fastrack;

  public String getWatchImageURL() {
    return watchImageURL;
  }

  public void setWatchImageURL(String watchImageURL) {
    this.watchImageURL = watchImageURL;
  }
  public List<Product> getTitan() {
    return titan;
  }

  public void setTitan(List<Product> titan) {
    this.titan = titan;
  }

  public List<Product> getFastrack() {
    return fastrack;
  }

  public void setFastrack(List<Product> fastrack) {
    this.fastrack = fastrack;
  }



  public Map<String, List<Product>> getProducts() {
    return products;
  }

  public void setProducts(Map<String, List<Product>> products) {
    this.products = products;
  }
}

class Product implements Serializable {
  private String imageId;
  private boolean qrScanSupport;
  private String name;
  private int productId;
  private boolean pinPairing;
  private boolean dfu;
  private List<String> filterName;
  private SupportedVersions supportedFromVersion;
  private String productCode;
  private boolean enabled;
  private String sdk;
  private String processor;
  private String alexaKey; // Only for specific products

  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public boolean isQrScanSupport() {
    return qrScanSupport;
  }

  public void setQrScanSupport(boolean qrScanSupport) {
    this.qrScanSupport = qrScanSupport;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public boolean isPinPairing() {
    return pinPairing;
  }

  public void setPinPairing(boolean pinPairing) {
    this.pinPairing = pinPairing;
  }

  public boolean isDfu() {
    return dfu;
  }

  public void setDfu(boolean dfu) {
    this.dfu = dfu;
  }

  public List<String> getFilterName() {
    return filterName;
  }

  public void setFilterName(List<String> filterName) {
    this.filterName = filterName;
  }

  public SupportedVersions getSupportedFromVersion() {
    return supportedFromVersion;
  }

  public void setSupportedFromVersion(SupportedVersions supportedFromVersion) {
    this.supportedFromVersion = supportedFromVersion;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public String getSdk() {
    return sdk;
  }

  public void setSdk(String sdk) {
    this.sdk = sdk;
  }

  public String getProcessor() {
    return processor;
  }

  public void setProcessor(String processor) {
    this.processor = processor;
  }

  public String getAlexaKey() {
    return alexaKey;
  }

  public void setAlexaKey(String alexaKey) {
    this.alexaKey = alexaKey;
  }
}

class SupportedVersions implements Serializable {
  private String ios;
  private String android;

  public String getIos() {
    return ios;
  }

  public void setIos(String ios) {
    this.ios = ios;
  }

  public String getAndroid() {
    return android;
  }

  public void setAndroid(String android) {
    this.android = android;
  }
}
