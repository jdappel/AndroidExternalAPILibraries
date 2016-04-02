package com.jdappel.android.wunderground.api.impl;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Retrofit API binfing for client creation.
 */
interface RetrofitForecastAPI {

    @GET("forecast/q/{lat},{long}.json")
    Call<ForecastWrapper> getForecastAtLatLong(@Path("lat") double lat, @Path("long") double longitude);
}
