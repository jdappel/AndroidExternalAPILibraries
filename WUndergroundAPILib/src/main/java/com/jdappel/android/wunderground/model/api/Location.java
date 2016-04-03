package com.jdappel.android.wunderground.model.api;

/**
 * Immutable POJO for representing location information.
 *
 * @autho jappel
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

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }
}
