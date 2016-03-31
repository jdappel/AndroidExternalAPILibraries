package com.jdappel.android.wunderground.api.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.TextForecastDetail;

/**
 * Jackson Mixin class for binding to
 * {@link com.jdappel.android.wunderground.model.api.TextForecast}.
 * 
 * @author jappel
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TextForecastMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    TextForecastMixin(@JsonProperty("forecastday") final List<TextForecastDetail> forecasts) {

    }

    @JsonProperty("forecastday")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract List<TextForecastDetail> getForecasts();
}
