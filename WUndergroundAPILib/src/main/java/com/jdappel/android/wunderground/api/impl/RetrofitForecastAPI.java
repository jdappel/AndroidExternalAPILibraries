package com.jdappel.android.wunderground.api.impl;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Retrofit API binfing for client creation.
 */
interface RetrofitForecastAPI {

    @GET("forecast/q/{lat},{long}.json")
    Observable<ForecastWrapper> getForecastAtLatLong(@Path("lat") double lat, @Path("long") double longitude);
}
