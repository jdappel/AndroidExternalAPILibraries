package com.jdappel.android.wunderground.model.api;

import java.util.List;

/**
 * Created by jappel on 3/30/2016.
 */
public class TextForecast {

    private final List<SimpleTextForecast> forecasts;

    public TextForecast(List<SimpleTextForecast> forecasts) {
        this.forecasts = forecasts;
    }

    public List<SimpleTextForecast> getForecastList() {
        return forecasts;
    }
}
