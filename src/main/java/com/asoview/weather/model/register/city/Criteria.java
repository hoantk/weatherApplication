package com.asoview.weather.model.register.city;

import javax.validation.constraints.AssertTrue;
import java.io.Serializable;

public class Criteria implements Serializable {
    String cityName = "";

    @AssertTrue(message = "検索条件を指定してください")
    public boolean isSpecified() {
        return !cityName.isEmpty();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}