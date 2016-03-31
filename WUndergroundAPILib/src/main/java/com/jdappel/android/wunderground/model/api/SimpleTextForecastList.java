package com.jdappel.android.wunderground.model.api;

import java.util.List;

/**
 * Created by jappel on 3/30/2016.
 */
public class SimpleTextForecastList {

    private final List<SimpleTextForecast> forecasts;

    public SimpleTextForecastList(List<SimpleTextForecast> forecasts) {
        this.forecasts = forecasts;
    }

    public List<SimpleTextForecast> getForecasts() {
        return forecasts;
    }
}
