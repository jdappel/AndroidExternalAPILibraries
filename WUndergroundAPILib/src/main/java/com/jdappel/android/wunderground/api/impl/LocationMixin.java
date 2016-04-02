package com.jdappel.android.wunderground.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.CurrentObservation;
import com.jdappel.android.wunderground.model.api.TextForecast;

/**
 * Created by jappel on 4/1/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LocationMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    LocationMixin(@JsonProperty("city") final String city, @JsonProperty("state") final String state, @JsonProperty("country") final String country) {

    }

    @JsonProperty("city")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getCity();

    @JsonProperty("state")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getState();

    @JsonProperty("country")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getCountry();
}
