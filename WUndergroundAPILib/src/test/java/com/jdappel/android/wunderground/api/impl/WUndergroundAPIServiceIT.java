package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.model.api.Conditions;
import com.jdappel.android.wunderground.model.api.CurrentObservation;
import com.jdappel.android.wunderground.model.api.Forecast;
import com.jdappel.android.wunderground.model.api.ForecastWrapper;
import com.jdappel.android.wunderground.model.api.SimpleTextForecast;
import com.jdappel.android.wunderground.model.api.SimpleTextForecastList;
import com.jdappel.android.wunderground.model.api.TextForecast;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

import retrofit2.Call;

public class WUndergroundAPIServiceIT {

    private WUndergroundAPI service;

    @Before
    public void setup() {
        service = WUndergroundAPIService.createWUndergroundAPIService("74d0ddaca166ca48");
    }

    @Test
    public void testWeatherConditions() throws Exception {
        Call<Conditions> call = service.getConditionsAtLatLong(40.034573f, -82.869865f);
        CurrentObservation returnedConditions = call.execute().body().getCurrentObservation();
        assertTrue(returnedConditions.getCurrentTemperature() != null);
        assertTrue(returnedConditions.getCurrentWeather() != null);
        assertTrue(returnedConditions.getCurrentWind() != null);
    }

    @Test
    public void testWeatherForecast() throws Exception {
        Call<ForecastWrapper> call = service.getForecastAtLatLong(40.034573f, -82.869865f);
        TextForecast forecasts = call.execute().body().getForecast().getTextForecast();
        assertTrue(forecasts != null);
    }
}