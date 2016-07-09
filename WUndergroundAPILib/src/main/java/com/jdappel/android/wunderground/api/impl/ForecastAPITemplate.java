package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.api.ForecastAPI;
import com.jdappel.android.wunderground.model.api.Forecast;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rx.Observable;
import rx.functions.Func1;

/**
 * Implementation of {@link ForecastAPI}
 * 
 * @author jappel
 */
class ForecastAPITemplate implements ForecastAPI {

    private static final Logger logger = LoggerFactory.getLogger(ForecastAPITemplate.class);

    private final RetrofitForecastAPI apiBinding;
    private final String apiToken;

    ForecastAPITemplate(final String apiToken) {
        this.apiToken = apiToken;
        this.apiBinding = WUndergroundAPIService.createAPI(RetrofitForecastAPI.class, apiToken);
    }

    @Override
    public Observable<Forecast> getForecastByLatLong(double latitude, double longitude) {
        return apiBinding.getForecastAtLatLong(latitude, longitude).map(new Func1<ForecastWrapper, Forecast>() {
            @Override
            public Forecast call(ForecastWrapper forecastWrapper) {
                return forecastWrapper.getForecast();
            }
        });
    }

}
