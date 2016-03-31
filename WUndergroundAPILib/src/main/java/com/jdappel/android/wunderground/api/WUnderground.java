package com.jdappel.android.wunderground.api;

/**
 * Interface specifying basic set of APIs available through WUnderground API
 * binding.
 * 
 * @author jappel
 */
public interface WUnderground {

    /**
     * @return subset of functionality within WUnderground pertaining to
     *         forecasts.
     */
    ForecastAPI getForecastAPI();

    /**
     * @return subset of functionality within WUnderground pertaining to current
     *         conditions.
     */
    ConditionsAPI getConditionsAPI();
}
