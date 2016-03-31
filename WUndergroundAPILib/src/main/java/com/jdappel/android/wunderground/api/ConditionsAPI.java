package com.jdappel.android.wunderground.api;

import com.jdappel.android.wunderground.model.api.CurrentObservation;

/**
 * Interface defining the operations that are available for returning current
 * weather conditions as provided by Weather Underground.
 * 
 * @author jappel
 */
public interface ConditionsAPI {

    /**
     * Returns the current weather for a given location by latitude and
     * longitude
     * 
     * @param latitude the latitude of the location
     * @param longitude the longitude of the location
     * @return a response handler for the request
     */
    APIResponseHandler<CurrentObservation> getCurrentObservationByLatLong(float latitude, float longitude);
}
