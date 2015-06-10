package com.otl.scatter.rest.controller;

import com.otl.scatter.constants.ApplicationGlobal;
import com.otl.scatter.entity.City;
import com.otl.scatter.rest.service.CityService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@EnableAutoConfiguration
@RestController
public class LocationController {
  
  private static final Logger LOGGER = LoggerFactory.getLogger(LocationController.class);
  
  @Autowired
  private CityService cityService;

  @RequestMapping(value = ApplicationGlobal.API_LATLONGTOLOCATION_URI, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE+ ";charset=UTF-8")
  @ResponseStatus(HttpStatus.OK)
  public City getLocation(@RequestParam("lat") double latitude, @RequestParam("long") double longitude) {
    
    LOGGER.debug("Entered getLocation( lat:"+ latitude +" , longitude: "+longitude +") method.");
    
    return cityService.findByLatLong(latitude, longitude);
  }
}
