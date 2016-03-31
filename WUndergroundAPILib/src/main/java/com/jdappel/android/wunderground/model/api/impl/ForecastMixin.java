package com.jdappel.android.wunderground.model.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.CurrentObservation;
import com.jdappel.android.wunderground.model.api.Forecast;
import com.jdappel.android.wunderground.model.api.TextForecast;

/**
 * Created by jappel on 3/30/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ForecastMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    ForecastMixin(@JsonProperty("txt_forecast") final TextForecast forecast) {

    }

    @JsonProperty("txt_forecast")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract TextForecast getTextForecast();
}
