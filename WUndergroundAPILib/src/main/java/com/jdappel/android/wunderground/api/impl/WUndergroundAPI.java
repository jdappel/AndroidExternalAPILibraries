package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.model.api.Conditions;
import com.jdappel.android.wunderground.model.api.CurrentObservation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jappel on 3/30/2016.
 */
interface WUndergroundAPI {

    @GET("conditions/q/{lat},{long}.json")
    Call<Conditions> getConditionsAtLatLong(@Path("lat") float lat,
                                            @Path("long") float longitude);


}
