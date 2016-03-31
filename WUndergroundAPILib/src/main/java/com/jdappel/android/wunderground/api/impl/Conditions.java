package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.model.api.CurrentObservation;

/**
 * Internal Jackson binding class for capturing the root element of
 * WUndergroundAPI Conditions response.
 * 
 * @author jappel
 */
class Conditions {

    private final CurrentObservation currentObservation;

    public Conditions(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
    }

    CurrentObservation getCurrentObservation() {
        return currentObservation;
    }
}
