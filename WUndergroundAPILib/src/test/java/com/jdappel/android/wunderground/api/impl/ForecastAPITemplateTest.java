package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.model.api.Forecast;

import org.junit.Before;
import org.junit.Test;

import rx.Observable;

import static org.junit.Assert.assertTrue;

public class ForecastAPITemplateTest {

    private ForecastAPITemplate forecastAPI;

    @Before
    public void setup() {

        forecastAPI = new ForecastAPITemplate("74d0ddaca166ca48");
    }

    @Test
    public void testWeatherForecast() throws Exception {

        Observable<Forecast> call = forecastAPI.getForecastByLatLong(40.034573f, -82.869865f);
        Forecast forecasts = call.toBlocking().first();
        assertTrue(forecasts != null && forecasts.getTextForecast() != null
            && forecasts.getTextForecast().getForecastList() != null);
    }
}
