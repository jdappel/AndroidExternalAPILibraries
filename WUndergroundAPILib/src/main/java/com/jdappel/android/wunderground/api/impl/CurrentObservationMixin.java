package com.jdappel.android.wunderground.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.Location;

/**
 * Jackson Mixin class for binding to
 * {@link com.jdappel.android.wunderground.model.api.CurrentObservation}.
 * 
 * @author jappel
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class CurrentObservationMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    CurrentObservationMixin(@JsonProperty("weather") final String currentWeather,
        @JsonProperty("temperature_string") final String currentTemperature,
        @JsonProperty("wind_string") final String currentWind,
                            @JsonProperty("observation_location") final Location location,
                            @JsonProperty("icon_url") final String iconUrl) {

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

    @JsonProperty("observation_location")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract Location getLocation();

    @JsonProperty("icon_url")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getIconUrl();
}
