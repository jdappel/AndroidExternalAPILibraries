package com.jdappel.android.wunderground.api.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jdappel.android.wunderground.model.api.impl.WeatherUndergroundJacksonModule;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by jappel on 3/30/2016.
 */
class WUndergroundAPIService {

    static WUndergroundAPI createWUndergroundAPIService(final String apiToken) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new WeatherUndergroundJacksonModule());
        Retrofit.Builder builder = new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .baseUrl("http://api.wunderground.com/api/" + apiToken + "/");

        return builder.build().create(WUndergroundAPI.class);
    }
}
