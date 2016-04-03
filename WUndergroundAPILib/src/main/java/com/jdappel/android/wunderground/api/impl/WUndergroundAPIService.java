package com.jdappel.android.wunderground.api.impl;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

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
            new Retrofit.Builder().
                addConverterFactory(JacksonConverterFactory.create(mapper)).baseUrl(
                "http://api.wunderground.com/api/" + apiToken + "/");

        return builder.build().create(apiType);
    }
}
