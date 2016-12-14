package com.abc.demoretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by framgia on 14/12/2016.
 */

public class Main {
    @SerializedName("humidity")
    private String humidity;
    @SerializedName("pressure")

    private String pressure;
    @SerializedName("temp_max")

    private String temp_max;
    @SerializedName("temp_min")

    private String temp_min;
    @SerializedName("temp")

    private String temp;
}
