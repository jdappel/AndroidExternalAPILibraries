package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.api.ConditionsAPI;
import com.jdappel.android.wunderground.model.api.CurrentObservation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rx.Observable;
import rx.functions.Func1;

/**
 * Implementation of {@link ConditionsAPI}
 *
 * @author jappel
 */
class ConditionsAPITemplate implements ConditionsAPI {

    private static final Logger logger = LoggerFactory.getLogger(ConditionsAPITemplate.class);

    private final RetrofitConditionsAPI apiBinding;
    private final String apiToken;

    ConditionsAPITemplate(final String apiToken) {
        this.apiToken = apiToken;
        this.apiBinding = WUndergroundAPIService.createAPI(RetrofitConditionsAPI.class, apiToken);
    }

    @Override
    public Observable<CurrentObservation> getCurrentObservationByLatLong(double latitude, double longitude) {
        return apiBinding.getConditionsAtLatLong(latitude, longitude).map(
                new Func1<Conditions, CurrentObservation>() {
                    @Override
                    public CurrentObservation call(Conditions conditions) {
                        return conditions.getCurrentObservation();
                    }
                });
    }
}
