package com.asoview.weather.datasource.city;

import com.asoview.weather.model.city.CityRepository;
import com.asoview.weather.model.city.CitySummary;
import com.asoview.weather.model.register.city.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CityDataSource implements CityRepository {

    @Autowired
    CityMapper cityMapper;

    @Override
    public List<CitySummary> findByCity(Criteria criteria){
        return cityMapper.findByCity(criteria);

    }
}
