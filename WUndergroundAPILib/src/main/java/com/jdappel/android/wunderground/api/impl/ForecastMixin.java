package com.jdappel.android.wunderground.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.TextForecast;

/**
 * Jackson Mixin class for binding to
 * {@link com.jdappel.android.wunderground.model.api.Forecast}.
 * 
 * @author jappel
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
