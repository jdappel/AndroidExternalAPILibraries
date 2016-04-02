package com.jdappel.android.wunderground.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import retrofit2.Response;

import com.jdappel.android.wunderground.api.APIResponseHandler;
import com.jdappel.android.wunderground.api.ConditionsAPI;
import com.jdappel.android.wunderground.model.api.CurrentObservation;
import com.jdappel.android.wunderground.model.api.Forecast;

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
    public APIResponseHandler<CurrentObservation> getCurrentObservationByLatLong(double latitude, double longitude) {
        final DefaultAPIResponseHandler<CurrentObservation> response = new DefaultAPIResponseHandler<>();
        try {
            Response<Conditions> resp = apiBinding.getConditionsAtLatLong(latitude, longitude).execute();
            if (resp.isSuccessful())
                response.setData(resp.body().getCurrentObservation());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.error(getClass().getName(), "Error while invoking WUnderground API to retrieve current conditions");
        }
        return response;
    }
}
