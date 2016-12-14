package com.abc.demoretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by framgia on 14/12/2016.
 */

public class Wind {
    @SerializedName("speed")
    private String speed;
    @SerializedName("deg")

    private String deg;

    public String getSpeed() {
        return speed;
    }

    public String getDeg() {
        return deg;
    }
}
