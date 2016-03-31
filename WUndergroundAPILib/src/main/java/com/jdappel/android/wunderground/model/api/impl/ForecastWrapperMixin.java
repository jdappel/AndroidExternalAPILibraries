package com.jdappel.android.wunderground.model.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.Forecast;

/**
 * Created by jappel on 3/30/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ForecastWrapperMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    ForecastWrapperMixin(@JsonProperty("forecast") final Forecast forecast) {

    }

    @JsonProperty("forecast")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract Forecast getForecast();
}
