package com.jdappel.android.wunderground.model.api;

/**
 * Created by jappel on 3/30/2016.
 */
public class CurrentObservation {

    private final String currentWeather;
    private final String currentTemperature;
    private final String currentWind;

    public CurrentObservation(String currentWeather, String currentTemperature, String currentWind) {
        this.currentWeather = currentWeather;
        this.currentTemperature = currentTemperature;
        this.currentWind = currentWind;
    }

    public String getCurrentWeather() {
        return currentWeather;
    }

    public String getCurrentTemperature() {
        return currentTemperature;
    }

    public String getCurrentWind() {
        return currentWind;
    }
}
