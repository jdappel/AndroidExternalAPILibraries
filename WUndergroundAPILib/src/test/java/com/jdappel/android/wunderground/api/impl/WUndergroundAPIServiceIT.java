package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.model.api.Conditions;
import com.jdappel.android.wunderground.model.api.CurrentObservation;

import org.junit.Before;
import org.junit.Test;
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
}