package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.api.ConditionsAPI;
import com.jdappel.android.wunderground.api.ForecastAPI;
import com.jdappel.android.wunderground.api.WUnderground;

/**
 * Implementation of {@link WUnderground}.
 * 
 * @author jappel
 */
public class WUndergroundTemplate implements WUnderground {

    private static final String DEFAULT_API_TOKEN = "74d0ddaca166ca48";
    private final String apiToken;
    private final ConditionsAPI conditionsAPI;
    private final ForecastAPI forecastAPI;

    public WUndergroundTemplate() {
        this(DEFAULT_API_TOKEN);
    }

    public WUndergroundTemplate(final String apiToken) {
        this.apiToken = apiToken != null ? apiToken : DEFAULT_API_TOKEN;
        this.conditionsAPI = new ConditionsAPITemplate(apiToken);
        this.forecastAPI = new ForecastAPITemplate(apiToken);
    }

    @Override
    public ForecastAPI getForecastAPI() {
        return forecastAPI;
    }

    @Override
    public ConditionsAPI getConditionsAPI() {
        return conditionsAPI;
    }
}
