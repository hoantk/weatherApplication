package com.asoview.weather.datasource.weathercity;

import com.asoview.weather.model.api.WeatherCity;
import com.asoview.weather.model.register.city.Criteria;
import com.asoview.weather.model.weathercity.WeatherCityRepository;
import com.asoview.weather.model.weathercity.WeatherCitySummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WeatherCityDataSource implements WeatherCityRepository {

    @Autowired
    WeatherCityMapper weatherCityMapper;

    @Override
    public List<WeatherCitySummary> findAllCity(){
        return weatherCityMapper.findAllCity();
    }

    @Override
    public void insert(WeatherCity weatherCity){
        weatherCityMapper.insert(weatherCity);
    }

    @Override
    public void delete(String weatherCityId){weatherCityMapper.delete(weatherCityId);}

    @Override
    public void deleteCityCurrentDate(String cityId){
        weatherCityMapper.deleteCityCurrentDate(cityId);
    }
}
