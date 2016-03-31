package com.jdappel.android.wunderground.model.api;

/**
 * Created by jappel on 3/30/2016.
 */
public class ForecastWrapper {

    private final Forecast forecast;

    public ForecastWrapper(Forecast forecast) {
        this.forecast = forecast;
    }

    public Forecast getForecast() {
        return forecast;
    }
}
