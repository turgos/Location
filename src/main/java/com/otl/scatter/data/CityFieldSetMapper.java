package com.otl.scatter.data;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

import com.otl.scatter.entity.City;

public class CityFieldSetMapper implements FieldSetMapper<City>{

  @Override
  public City mapFieldSet(FieldSet fieldSet) {
    
    if (fieldSet == null) 
      return null;
    
    City city = new City();
    city.setCountrycode(fieldSet.readString("country code"));
    city.setCity(fieldSet.readString("name"));
    city.setAsciiname(fieldSet.readString("asciiname"));
    city.setLatitude(fieldSet.readDouble("latitude"));
    city.setLongitude(fieldSet.readDouble("longitude"));
    city.setElevation(fieldSet.readInt("elevation"));
    city.setPopulation(fieldSet.readLong("population"));
    city.setTimezone(fieldSet.readString("timezone"));
    city.setModified(fieldSet.readString("modification date"));
    return city;
  }

}
