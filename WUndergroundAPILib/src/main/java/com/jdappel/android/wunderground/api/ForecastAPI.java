package com.jdappel.android.wunderground.api;

import com.jdappel.android.wunderground.model.api.Forecast;

import rx.Observable;

/**
 * Interface defining the operations that are available for returning forecasts
 * as provided by Weather Underground.
 * 
 * @author jappel
 */
public interface ForecastAPI {

    /**
     * Returns the current forecast for a give latitude and longitude
     * 
     * @param latitude the latitude of the location
     * @param longitude the longitude of the location
     * @return a response handler for the request
     */
    Observable<Forecast> getForecastByLatLong(double latitude, double longitude);
}
