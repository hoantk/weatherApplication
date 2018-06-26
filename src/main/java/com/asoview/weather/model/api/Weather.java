package com.asoview.weather.model.api;

public class Weather {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String id;

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String main;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String description;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String icon;
}
