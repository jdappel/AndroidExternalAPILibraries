package com.jdappel.android.wunderground.model.api;

/**
 * Created by jappel on 3/30/2016.
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
