package com.otl.scatter.entity;

import java.io.Serializable;

public class City implements Serializable{
  
  private static final long serialVersionUID = -6593819646281952836L;

  private String countrycode;
  private String city;
  private String asciiname;
  private Double latitude;
  private Double longitude;
  private Long population;
  private Integer elevation;
  private String timezone;
  private String modified;
  public String getCountrycode() {
    return countrycode;
  }
  public void setCountrycode(String countrycode) {
    this.countrycode = countrycode;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public String getAsciiname() {
    return asciiname;
  }
  public void setAsciiname(String asciiname) {
    this.asciiname = asciiname;
  }
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }
  public Long getPopulation() {
    return population;
  }
  public void setPopulation(Long population) {
    this.population = population;
  }
  public Integer getElevation() {
    return elevation;
  }
  public void setElevation(Integer elevation) {
    this.elevation = elevation;
  }
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }
  public String getModified() {
    return modified;
  }
  public void setModified(String modified) {
    this.modified = modified;
  }
  @Override
  public String toString() {
    return "City [countrycode=" + countrycode + ", city=" + city + ", asciiname=" + asciiname + ", latitude=" + latitude + ", longitude=" + longitude + ", population=" + population + ", elevation=" + elevation + ", timezone=" + timezone
        + ", modified=" + modified + "]";
  }
  
  
}
