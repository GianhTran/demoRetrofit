package com.abc.demoretrofit.network;

import com.abc.demoretrofit.model.LoginWrapper;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by framgia on 14/12/2016.
 */

public interface ApiInterface {

    @FormUrlEncoded
    @Headers({
            "X-DEVICE-ID: 123456", "X-API-ID: 1", "X-OS-TYPE: ANDROID", "X-API-KEY: 0123456789",
            "X-OS-VERSION: 6.0", "X-APP-VERSION: 1.0"
    })
    @POST("login")
    Call<LoginWrapper> logIn(@Field("email") String email, @Field("password") String password);
}
