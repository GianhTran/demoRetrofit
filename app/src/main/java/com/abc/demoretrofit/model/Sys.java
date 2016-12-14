package com.abc.demoretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by framgia on 14/12/2016.
 */

public class Sys {
    @SerializedName("message")
    private String message;
    @SerializedName("id")

    private String id;
    @SerializedName("sunset")
    private String sunset;
    @SerializedName("sunrise")

    private String sunrise;
    @SerializedName("type")

    private String type;
    @SerializedName("country")

    private String country;

    public String getMessage() {
        return message;
    }

    public String getId() {
        return id;
    }

    public String getSunset() {
        return sunset;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }
}
