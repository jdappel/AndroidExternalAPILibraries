package com.jdappel.android.wunderground.model.api.impl;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.jdappel.android.wunderground.model.api.Conditions;
import com.jdappel.android.wunderground.model.api.CurrentObservation;
import com.jdappel.android.wunderground.model.api.Forecast;
import com.jdappel.android.wunderground.model.api.ForecastWrapper;
import com.jdappel.android.wunderground.model.api.SimpleTextForecast;
import com.jdappel.android.wunderground.model.api.SimpleTextForecastList;
import com.jdappel.android.wunderground.model.api.TextForecast;

/**
 * Created by jappel on 3/30/2016.
 */
public class WeatherUndergroundJacksonModule extends SimpleModule {

    @Override
    public void setupModule(Module.SetupContext context) {
        context.setMixInAnnotations(CurrentObservation.class, CurrentObservationMixin.class);
        context.setMixInAnnotations(Conditions.class, ConditionsMixin.class);
        context.setMixInAnnotations(SimpleTextForecast.class, SimpleTextForecastMixin.class);
        context.setMixInAnnotations(TextForecast.class, TextForecastMixin.class);
        context.setMixInAnnotations(Forecast.class, ForecastMixin.class);
        context.setMixInAnnotations(ForecastWrapper.class, ForecastWrapperMixin.class);
    }
}
