package com.jdappel.android.wunderground.model.api;

/**
 * Created by jappel on 3/30/2016.
 */
public class Forecast {

    private final TextForecast textForecast;

    public Forecast(TextForecast textForecast) {
        this.textForecast = textForecast;
    }

    public TextForecast getTextForecast() {
        return textForecast;
    }
}
