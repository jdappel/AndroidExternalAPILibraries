package com.jdappel.android.wunderground.api;

/**
 * Interface for defining the contract when handling responses from the
 * WUnderground API.
 * 
 * @author jappel
 */
public interface APIResponseHandler<T> {

    /**
     * Should be called prior to accessing model data to determine if the
     * transaction was successful.
     * 
     * @return whether an error occurred while the API transaction took place.
     */
    boolean hasError();

    /**
     * @return the model object that contains the response data.
     * @throws IllegalStateException if the response data isn't available due to
     *         error.
     */
    T getModelData();
}
