package com.jdappel.android.wunderground.model.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.CurrentObservation;

/**
 * Created by jappel on 3/30/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConditionsMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    ConditionsMixin(@JsonProperty("current_observation") final CurrentObservation observation) {

    }

    @JsonProperty("current_observation")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract CurrentObservation gettCurrentObservation();


}
