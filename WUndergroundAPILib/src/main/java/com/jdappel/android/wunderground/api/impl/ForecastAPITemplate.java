package com.jdappel.android.wunderground.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import retrofit2.Response;

import com.jdappel.android.wunderground.api.APIResponseHandler;
import com.jdappel.android.wunderground.api.ForecastAPI;
import com.jdappel.android.wunderground.model.api.CurrentObservation;
import com.jdappel.android.wunderground.model.api.Forecast;

import java.io.IOException;

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
    public APIResponseHandler<Forecast> getForecastByLatLong(double latitude, double longitude) {
        final DefaultAPIResponseHandler<Forecast> response = new DefaultAPIResponseHandler<>();
        try {
            Response<ForecastWrapper> resp = apiBinding.getForecastAtLatLong(latitude, longitude).execute();
            if (resp.isSuccessful())
                response.setData(resp.body().getForecast());
        } catch (IOException e) {
            logger.error(getClass().getName(), "Exception while retrieving forecast");
        }
        return response;
    }
}
