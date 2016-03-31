package com.jdappel.android.wunderground.model.api;

import java.util.List;

/**
 * Immutable POJO for holding a text forecast from WUnderground
 * 
 * @author jappel
 */
public class TextForecast {

    private final List<TextForecastDetail> forecasts;

    public TextForecast(List<TextForecastDetail> forecasts) {
        this.forecasts = forecasts;
    }

    public List<TextForecastDetail> getForecastList() {
        return forecasts;
    }
}
