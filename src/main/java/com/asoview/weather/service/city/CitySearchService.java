package com.asoview.weather.service.city;

import com.asoview.weather.model.api.WeatherCity;
import com.asoview.weather.model.city.CityRepository;
import com.asoview.weather.model.city.CitySummary;
import com.asoview.weather.model.register.city.Criteria;
import com.asoview.weather.service.api.CityCallAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CitySearchService {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    CityCallAPI cityCallApi;

    public List<CitySummary> findByCityName(Criteria criteria){
        return cityRepository.findByCity(criteria);
    }
}
