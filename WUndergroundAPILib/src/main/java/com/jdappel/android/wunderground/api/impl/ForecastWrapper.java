package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.model.api.Forecast;

/**
 * Internal POJO for binding to WUndergroundAPI Forecast Response.
 * 
 * @author jappel
 */
class ForecastWrapper {

    private final Forecast forecast;

    public ForecastWrapper(Forecast forecast) {
        this.forecast = forecast;
    }

    public Forecast getForecast() {
        return forecast;
    }
}
