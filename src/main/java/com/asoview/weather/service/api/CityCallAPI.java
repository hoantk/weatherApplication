package com.asoview.weather.service.api;

import com.asoview.weather.model.api.WeatherCity;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import java.net.URI;

@Service
public class CityCallAPI {

    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather?q={city},{country}&APPID={apikey}&units=metric";

    private final String API_KEY = "21f64bcd9b719a342c087ddc538fa039";

    public WeatherCity getWeatherAPI(String city, String country){
        URI url = new UriTemplate(WEATHER_URL).expand(city, country, API_KEY);
        return this.invoke(url, WeatherCity.class);
    }

    private <T> T invoke(URI url, Class<T> responseType) {
        RequestEntity<?> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
        RestTemplate restTemplate = new RestTemplate(new SimpleClientHttpRequestFactory());
        ResponseEntity<T> exchange = restTemplate.exchange(request, responseType);
        return exchange.getBody();
    }
}
