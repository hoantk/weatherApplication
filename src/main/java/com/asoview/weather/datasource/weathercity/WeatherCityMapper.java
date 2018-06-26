package com.asoview.weather.datasource.weathercity;

import com.asoview.weather.model.api.WeatherCity;
import com.asoview.weather.model.register.city.Criteria;
import com.asoview.weather.model.weathercity.WeatherCitySummary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeatherCityMapper {
    List<WeatherCitySummary> findAllCity();

    void insert(@Param("weatherCity") WeatherCity weatherCity);

    void delete(@Param("weatherCityId") String weatherCityId);

    void deleteCityCurrentDate(@Param("cityId") String cityId);
}
