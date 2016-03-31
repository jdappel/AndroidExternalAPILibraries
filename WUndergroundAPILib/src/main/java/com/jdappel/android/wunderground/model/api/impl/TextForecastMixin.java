package com.jdappel.android.wunderground.model.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.Forecast;
import com.jdappel.android.wunderground.model.api.SimpleTextForecast;
import com.jdappel.android.wunderground.model.api.TextForecast;

import java.util.List;

/**
 * Created by jappel on 3/30/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TextForecastMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    TextForecastMixin(@JsonProperty("forecastday") final List<SimpleTextForecast> forecasts) {

    }

    @JsonProperty("forecastday")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract List<SimpleTextForecast> getForecasts();
}
