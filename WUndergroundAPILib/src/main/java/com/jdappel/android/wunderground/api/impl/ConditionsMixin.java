package com.jdappel.android.wunderground.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.CurrentObservation;

/**
 * Jackson Mixin class for binding to {@link Conditions}.
 * 
 * @author jappel
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConditionsMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    ConditionsMixin(@JsonProperty("current_observation") final CurrentObservation observation) {

    }

    @JsonProperty("current_observation")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract CurrentObservation getCurrentObservation();
}
