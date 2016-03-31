package com.jdappel.android.wunderground.model.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jappel on 3/30/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class CurrentObservationMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    CurrentObservationMixin(@JsonProperty("weather") final String currentWeather,
                            @JsonProperty("temperature_string") final String currentTemperature,
                            @JsonProperty("wind_string") final String currentWind) {

    }

    @JsonProperty("weather")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getCurrentWeather();

    @JsonProperty("temperature_string")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getCurrentTemperature();

    @JsonProperty("wind_string")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getCurrentWind();
}
