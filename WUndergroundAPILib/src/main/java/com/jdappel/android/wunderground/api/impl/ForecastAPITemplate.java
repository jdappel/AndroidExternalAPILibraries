package com.jdappel.android.wunderground.api.impl;

import java.io.IOException;

import retrofit2.Response;

import android.util.Log;

import com.jdappel.android.wunderground.api.APIResponseHandler;
import com.jdappel.android.wunderground.api.ForecastAPI;
import com.jdappel.android.wunderground.model.api.Forecast;

/**
 * Implementation of {@link ForecastAPI}
 * 
 * @author jappel
 */
class ForecastAPITemplate implements ForecastAPI {

    private final RetrofitForecastAPI apiBinding;
    private final String apiToken;

    ForecastAPITemplate(final String apiToken) {
        this.apiToken = apiToken;
        this.apiBinding = WUndergroundAPIService.createAPI(RetrofitForecastAPI.class, apiToken);
    }

    @Override
    public APIResponseHandler<Forecast> getForecastByLatLong(float latitude, float longitude) {
        try {
            Response<ForecastWrapper> resp = apiBinding.getForecastAtLatLong(latitude, longitude).execute();
            if (resp.isSuccessful())
                return new DefaultAPIResponseHandler<>(resp.body().getForecast());
        } catch (IOException e) {
            Log.e(getClass().getName(), "Exception while retrieving forecast");
        }
        return new DefaultAPIResponseHandler<>(null);
    }
}
