package com.abc.demoretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by framgia on 14/12/2016.
 */

public class Coord {
    @SerializedName("lon")
    private String lon;
    @SerializedName("lat")
    private String lat;

    public String getLon() {
        return lon;
    }

    public String getLat() {
        return lat;
    }
}
