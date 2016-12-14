package com.abc.demoretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by framgia on 14/12/2016.
 */

public class LoginData {
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("token")
    private String token;
    @SerializedName("email")
    private String email;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("user_id")
    private String userId;

    public String getFirstName() {
        return firstName;
    }

    public String getToken() {
        return token;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserId() {
        return userId;
    }
}
