package com.otl.scatter.rest.service;

import com.otl.scatter.entity.City;

public interface CityService {

  public City findByLatLong(Double latitude, Double longitude);

}