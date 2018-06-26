package com.asoview.weather.datasource.city;

import com.asoview.weather.model.city.CitySummary;
import com.asoview.weather.model.register.city.Criteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CityMapper {
    List<CitySummary> findByCity(@Param("criteria") Criteria criteria);
}
