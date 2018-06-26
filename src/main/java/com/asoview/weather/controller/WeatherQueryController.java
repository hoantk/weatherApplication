package com.asoview.weather.controller;

import com.asoview.weather.model.api.WeatherCity;
import com.asoview.weather.model.weathercity.WeatherCitySummary;
import com.asoview.weather.service.weathercity.WeatherCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.asoview.weather.model.register.city.Criteria;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.asoview.weather.service.city.CitySearchService;
import com.asoview.weather.service.api.CityCallAPI;
import com.asoview.weather.model.city.CitySummary;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/weather/query")
@SessionAttributes(value = "criteriaOfWeather")
public class WeatherQueryController {

    @Autowired
    CitySearchService citySearchService;

    @Autowired
    WeatherCityService weatherCityService;

    @ModelAttribute("criteriaOfWeather")
    Criteria criteria() {
        return new Criteria();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    String start() {

        return "weather/query/list";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    String search(@Validated @ModelAttribute("criteriaOfWeather") Criteria criteria,
                  BindingResult result,
                  RedirectAttributes redirectAttributes){

        if (result.hasErrors())
            return "weather/query/list";

        List<CitySummary> citySummaryList = citySearchService.findByCityName(criteria);
        List<WeatherCitySummary> weatherCitySummaryList = new ArrayList<WeatherCitySummary>();
        if(!citySummaryList.isEmpty()){
            weatherCityService.insert(citySummaryList);
            weatherCitySummaryList = weatherCityService.findAllCity();
        }

        if(weatherCitySummaryList.isEmpty())
            redirectAttributes.addFlashAttribute("noDataFound","Not match result data found");
        redirectAttributes.addFlashAttribute("weatherCitySummaryList", weatherCitySummaryList);
        return "redirect:/weather/query";
    }




}
