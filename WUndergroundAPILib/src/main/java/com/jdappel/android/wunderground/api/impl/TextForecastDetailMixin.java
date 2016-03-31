package com.jdappel.android.wunderground.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jdappel.android.wunderground.model.api.TextForecastDetail;

/**
 * Jackson Mixin class for binding to
 * {@link TextForecastDetail}.
 * 
 * @author jappel
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TextForecastDetailMixin {

    @SuppressWarnings("unused")
    @JsonCreator
    TextForecastDetailMixin(@JsonProperty("fcttext") final String text, @JsonProperty("title") final String title) {

    }

    @JsonProperty("fcttext")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getText();

    @JsonProperty("title")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    abstract String getTitle();
}
