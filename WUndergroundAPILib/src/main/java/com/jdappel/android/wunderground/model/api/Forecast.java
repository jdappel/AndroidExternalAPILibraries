package com.jdappel.android.wunderground.model.api;

/**
 * Immutable POJO for representing a forecast returned from WUnderground.
 * 
 * @author jappel
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
