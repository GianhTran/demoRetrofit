package com.abc.demoretrofit.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by framgia on 14/12/2016.
 */

public class Data {
    @SerializedName("id")
    private String id;
    @SerializedName("dt")

    private String dt;
    @SerializedName("clouds")

    private Clouds clouds;
    @SerializedName("coord")

    private Coord coord;
    @SerializedName("wind")

    private Wind wind;
    @SerializedName("cod")

    private String cod;
    @SerializedName("visibility")

    private String visibility;
    @SerializedName("sys")

    private Sys sys;
    @SerializedName("name")

    private String name;
    @SerializedName("base")

    private String base;
    @SerializedName("weather")

    private List<Weather> weather;
    @SerializedName("main")

    private Main main;

    public String getId() {
        return id;
    }

    public String getDt() {
        return dt;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Coord getCoord() {
        return coord;
    }

    public Wind getWind() {
        return wind;
    }

    public String getCod() {
        return cod;
    }

    public String getVisibility() {
        return visibility;
    }

    public Sys getSys() {
        return sys;
    }

    public String getName() {
        return name;
    }

    public String getBase() {
        return base;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public Main getMain() {
        return main;
    }
}
