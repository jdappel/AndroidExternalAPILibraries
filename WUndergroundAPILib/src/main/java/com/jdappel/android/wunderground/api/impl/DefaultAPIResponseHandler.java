package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.api.APIResponseHandler;

/**
 * Implementation of {@link APIResponseHandler}
 * 
 * @author jappel
 */
class DefaultAPIResponseHandler<T> implements APIResponseHandler<T> {

    private final T modelData;
    private final boolean error;

    DefaultAPIResponseHandler(T data) {
        this.error = data != null ? false : true;
        this.modelData = data;
    }

    @Override
    public boolean hasError() {
        return error;
    }

    @Override
    public T getModelData() {
        if (modelData == null)
            throw new IllegalStateException("Model Data isn't available for " + modelData.getClass().getName());
        return modelData;
    }
}
