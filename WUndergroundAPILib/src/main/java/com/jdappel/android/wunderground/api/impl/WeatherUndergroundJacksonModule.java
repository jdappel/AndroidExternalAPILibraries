package com.jdappel.android.wunderground.api.impl;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.jdappel.android.wunderground.model.api.CurrentObservation;
import com.jdappel.android.wunderground.model.api.Forecast;
import com.jdappel.android.wunderground.model.api.Location;
import com.jdappel.android.wunderground.model.api.TextForecastDetail;
import com.jdappel.android.wunderground.model.api.TextForecast;

/**
 * Jackson module for mapping Mixins to their POJOs.
 * 
 * @jappel
 */
class WeatherUndergroundJacksonModule extends SimpleModule {

    @Override
    public void setupModule(Module.SetupContext context) {
        context.setMixInAnnotations(CurrentObservation.class, CurrentObservationMixin.class);
        context.setMixInAnnotations(Conditions.class, ConditionsMixin.class);
        context.setMixInAnnotations(TextForecastDetail.class, TextForecastDetailMixin.class);
        context.setMixInAnnotations(TextForecast.class, TextForecastMixin.class);
        context.setMixInAnnotations(Forecast.class, ForecastMixin.class);
        context.setMixInAnnotations(ForecastWrapper.class, ForecastWrapperMixin.class);
        context.setMixInAnnotations(Location.class, LocationMixin.class);
    }
}
