package com.asoview.weather.model.city;

import com.asoview.weather.model.register.city.Criteria;
import java.util.List;

public interface CityRepository {
    List<CitySummary> findByCity(Criteria criteria);
}
