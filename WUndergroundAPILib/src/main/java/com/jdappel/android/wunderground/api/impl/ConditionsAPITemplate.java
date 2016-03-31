package com.jdappel.android.wunderground.api.impl;

import retrofit2.Response;

import android.util.Log;

import com.jdappel.android.wunderground.api.APIResponseHandler;
import com.jdappel.android.wunderground.api.ConditionsAPI;
import com.jdappel.android.wunderground.model.api.CurrentObservation;

/**
 * Implementation of {@link ConditionsAPI}
 * 
 * @author jappel
 */
class ConditionsAPITemplate implements ConditionsAPI {

    private final RetrofitConditionsAPI apiBinding;
    private final String apiToken;

    ConditionsAPITemplate(final String apiToken) {
        this.apiToken = apiToken;
        this.apiBinding = WUndergroundAPIService.createAPI(RetrofitConditionsAPI.class, apiToken);
    }

    @Override
    public APIResponseHandler<CurrentObservation> getCurrentObservationByLatLong(float latitude, float longitude) {
        try {
            Response<Conditions> resp = apiBinding.getConditionsAtLatLong(latitude, longitude).execute();
            if (resp.isSuccessful())
                return new DefaultAPIResponseHandler<>(resp.body().getCurrentObservation());
        } catch (Exception e) {
            Log.e(getClass().getName(), "Error while invoking WUnderground API to retrieve current conditions");
        }
        return new DefaultAPIResponseHandler<>(null);
    }
}
