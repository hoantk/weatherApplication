package com.asoview.weather.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class WeatherCity {

    String id;
    String Icon;
    String Temperature;
    String Pressure;
    String Wind;
    String Cloud;
    String Status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    public String getPressure() {
        return Pressure;
    }

    public void setPressure(String pressure) {
        Pressure = pressure;
    }

    public String getWind() {
        return Wind;
    }

    public void setWind(String wind) {
        Wind = wind;
    }

    public String getCloud() {
        return Cloud;
    }

    public void setCloud(String cloud) {
        Cloud = cloud;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @JsonProperty("weather")
    public void setWeatherCity(List<Map<String, Object>> entries) {
        Map<String, Object> weather = entries.get(0);
        this.setStatus(weather.get("main").toString());
        this.setIcon(weather.get("icon").toString());
    }

    @JsonProperty("main")
    public void setMainCity(Map<String, Object> entries) {
        this.setTemperature(entries.get("temp").toString());
        this.setPressure(entries.get("pressure").toString());
    }

    @JsonProperty("wind")
    public void setWindCity(Map<String, Object> entries) {
        this.setWind(entries.get("speed").toString());
    }

    @JsonProperty("clouds")
    public void setCloudsCity(Map<String, Object> entries) {
        this.setCloud(entries.get("all").toString());
    }
}
