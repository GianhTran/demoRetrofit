package com.abc.demoretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by framgia on 14/12/2016.
 */

public class LoginWrapper {
    @SerializedName("message")
    private String message;
    @SerializedName("status")
    private String status;
    @SerializedName("data")
    private LoginData data;
    @SerializedName("code")
    private String code;

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public LoginData getData() {
        return data;
    }

    public String getCode() {
        return code;
    }
}
