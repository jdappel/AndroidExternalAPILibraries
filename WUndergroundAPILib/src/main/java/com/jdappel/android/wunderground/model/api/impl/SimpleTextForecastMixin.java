package com.jdappel.android.wunderground.model.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.TextForecast;

/**
 * Created by jappel on 3/30/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SimpleTextForecastMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    SimpleTextForecastMixin(@JsonProperty("fcttext") final String text,
                            @JsonProperty("title") final String title) {

    }

    @JsonProperty("fcttext")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getText();

    @JsonProperty("title")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getTitle();
}
