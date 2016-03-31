package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.api.APIResponseHandler;
import com.jdappel.android.wunderground.model.api.CurrentObservation;

import org.junit.Before;
import org.junit.Test;

import retrofit2.Call;

import static org.junit.Assert.assertTrue;

public class ConditionsAPITemplateTest {

    private ConditionsAPITemplate conditionsAPI;

    @Before
    public void setup() {

        conditionsAPI =
                new ConditionsAPITemplate("74d0ddaca166ca48");
    }

    @Test
    public void testWeatherConditions() throws Exception {

        APIResponseHandler<CurrentObservation> call = conditionsAPI.getCurrentObservationByLatLong(40.034573f, -82.869865f);
        CurrentObservation returnedConditions = call.getModelData();
        assertTrue(returnedConditions.getCurrentTemperature() != null);
        assertTrue(returnedConditions.getCurrentWeather() != null);
        assertTrue(returnedConditions.getCurrentWind() != null);
    }
}