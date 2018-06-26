package com.asoview.weather.service.weathercity;

import com.asoview.weather.model.api.WeatherCity;
import com.asoview.weather.model.city.CitySummary;
import com.asoview.weather.model.register.city.Criteria;
import com.asoview.weather.model.weathercity.WeatherCityRepository;
import com.asoview.weather.model.weathercity.WeatherCitySummary;
import com.asoview.weather.service.api.CityCallAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WeatherCityService {

    @Autowired
    WeatherCityRepository weatherCityRepository;

    @Autowired
    CityCallAPI cityCallAPI;

    //get all city by system
    public List<WeatherCitySummary> findAllCity(){
        return weatherCityRepository.findAllCity();
    }

    //delete
    public void delete(String cityId) {
        weatherCityRepository.delete(cityId);
    }

    //insert data after get API weather
    public void insert(List<CitySummary> citySummaryList){
        for(CitySummary citySummary : citySummaryList){
            WeatherCity weatherCity =  cityCallAPI.getWeatherAPI(citySummary.getCityName(), citySummary.getCountry());
            weatherCityRepository.deleteCityCurrentDate(citySummary.getId());
            weatherCityRepository.insert(weatherCity);
        }
    }
}
