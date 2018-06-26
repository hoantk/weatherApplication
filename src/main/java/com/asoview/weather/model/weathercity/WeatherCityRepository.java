package com.asoview.weather.model.weathercity;

import com.asoview.weather.model.api.WeatherCity;
import com.asoview.weather.model.register.city.Criteria;

import java.util.List;

public interface WeatherCityRepository {

    List<WeatherCitySummary> findAllCity();

    void insert(WeatherCity weatherCity);

    void delete(String cityId);

    void deleteCityCurrentDate(String cityId);
}
