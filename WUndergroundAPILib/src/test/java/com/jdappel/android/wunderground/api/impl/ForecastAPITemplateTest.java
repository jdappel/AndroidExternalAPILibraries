package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.api.APIResponseHandler;
import com.jdappel.android.wunderground.model.api.Forecast;
import com.jdappel.android.wunderground.model.api.TextForecast;

import org.junit.Before;
import org.junit.Test;

import retrofit2.Call;

import static org.junit.Assert.assertTrue;

public class ForecastAPITemplateTest {

    private ForecastAPITemplate forecastAPI;

    @Before
    public void setup() {
        forecastAPI = new ForecastAPITemplate("74d0ddaca166ca48");
    }

    @Test
    public void testWeatherForecast() throws Exception {
        APIResponseHandler<Forecast> call = forecastAPI.getForecastByLatLong(40.034573f, -82.869865f);
        Forecast forecasts = call.getModelData();
        assertTrue(forecasts != null && forecasts.getTextForecast() != null && forecasts.getTextForecast().getForecastList() != null);
    }
}
