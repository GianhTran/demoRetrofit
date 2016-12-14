package com.abc.demoretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by framgia on 14/12/2016.
 */

public class Weather {
    @SerializedName("id")
    private String id;
    @SerializedName("icon")

    private String icon;
    @SerializedName("description")

    private String description;
    @SerializedName("main")

    private String main;

    public String getId() {
        return id;
    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }

    public String getMain() {
        return main;
    }
}
