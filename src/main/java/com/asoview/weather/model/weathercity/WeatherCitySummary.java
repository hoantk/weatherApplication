package com.asoview.weather.model.weathercity;

public class WeatherCitySummary {
    public String getWeatherCityId() {
        return weatherCityId;
    }

    public void setWeatherCityId(String weatherCityId) {
        this.weatherCityId = weatherCityId;
    }

    String weatherCityId;
    String cityId;
    String cityName;
    String countryName;
    String createDate;
    String Icon;
    String Temperature;
    String Pressure;
    String Wind;
    String Cloud;
    String Status;

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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public WeatherCitySummary(){

    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
