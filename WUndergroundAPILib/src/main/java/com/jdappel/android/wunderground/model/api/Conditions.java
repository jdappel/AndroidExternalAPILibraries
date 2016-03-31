package com.jdappel.android.wunderground.model.api;

/**
 * Created by jappel on 3/30/2016.
 */
public class Conditions {

    private final CurrentObservation currentObservation;

    public Conditions(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
    }

    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }
}
