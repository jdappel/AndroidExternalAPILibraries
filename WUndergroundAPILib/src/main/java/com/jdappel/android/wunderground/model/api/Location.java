package com.jdappel.android.wunderground.model.api;

/**
 * Created by jappel on 4/1/2016.
 */
public class Location {


    public Location(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    private final String city;
    private final String state;
    private final String country;

    public String getCity() {
        return city;
    }
}
