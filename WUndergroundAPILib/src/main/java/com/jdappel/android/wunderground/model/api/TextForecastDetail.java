package com.jdappel.android.wunderground.model.api;

/**
 * Immutable POJO for holding forecast detail pertaining to a text forecast from
 * WUnderground
 * 
 * @author jappel
 */
public class TextForecastDetail {

    private final String text;
    private final String title;

    public TextForecastDetail(String text, String title) {
        this.text = text;
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
}
