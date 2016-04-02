package com.jdappel.android.wunderground.api.impl;

import com.jdappel.android.wunderground.api.APIResponseHandler;

/**
 * Implementation of {@link APIResponseHandler}
 * 
 * @author jappel
 */
class DefaultAPIResponseHandler<T> implements APIResponseHandler<T> {

    private T modelData = null;
    private boolean error = false;
    private boolean isComplete = false;

    void setData(T data) {
        this.modelData = data;
        this.error = false;
        this.isComplete = true;
    }

    void setError() {
        this.error = true;
        this.isComplete = true;
    }

    @Override
    public boolean hasError() {
        return error;
    }

    @Override
    public T getModelData() {
        if (modelData == null)
            throw new IllegalStateException("Model Data isn't available");
        return modelData;
    }
}
