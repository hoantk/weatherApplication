package com.asoview.weather.controller;

import com.asoview.weather.service.weathercity.WeatherCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/weather/city")
public class WeatherController {

    @Autowired
    WeatherCityService weatherCityService;

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    String delete(@PathVariable String id, RedirectAttributes attributes) {
        weatherCityService.delete(id);
        return "redirect:/weather/query";
    }
}
