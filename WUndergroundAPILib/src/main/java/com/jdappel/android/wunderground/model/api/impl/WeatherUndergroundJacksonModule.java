package com.jdappel.android.wunderground.model.api.impl;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.jdappel.android.wunderground.model.api.Conditions;
import com.jdappel.android.wunderground.model.api.CurrentObservation;

/**
 * Created by jappel on 3/30/2016.
 */
public class WeatherUndergroundJacksonModule extends SimpleModule {

    @Override
    public void setupModule(Module.SetupContext context) {
        context.setMixInAnnotations(CurrentObservation.class, CurrentObservationMixin.class);
        context.setMixInAnnotations(Conditions.class, ConditionsMixin.class);
    }
}
