package com.jdappel.android.wunderground.api.impl;

import com.fasterxml.jackson.databind.ObjectMapper;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Internal class to construct {@link Retrofit} API bindings for WUnderground
 *
 * @author jappel
 */
class WUndergroundAPIService {

    static <T> T createAPI(Class<T> apiType, final String apiToken) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new WeatherUndergroundJacksonModule());
        Retrofit.Builder builder =
                new Retrofit.Builder().addCallAdapterFactory(RxJavaCallAdapterFactory.create()).
                        addConverterFactory(JacksonConverterFactory.create(mapper)).baseUrl(
                        "http://api.wunderground.com/api/" + apiToken + "/");

        return builder.build().create(apiType);
    }
}
