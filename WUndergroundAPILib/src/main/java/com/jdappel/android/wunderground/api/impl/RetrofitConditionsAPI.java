package com.jdappel.android.wunderground.api.impl;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Retrofit specific interface for API binding.
 */
interface RetrofitConditionsAPI {

    @GET("conditions/q/{lat},{long}.json")
    Call<Conditions> getConditionsAtLatLong(@Path("lat") double lat, @Path("long") double longitude);
}
