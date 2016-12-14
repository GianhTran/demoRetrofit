package com.abc.demoretrofit.network;

import com.abc.demoretrofit.Constants;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by framgia on 14/12/2016.
 */

public class ServiceGenerator {
    private static OkHttpClient.Builder httpClient =
            new OkHttpClient.Builder().connectTimeout(Constants.CONNECT_TIME_OUT,
                    TimeUnit.MILLISECONDS)
                    .readTimeout(Constants.READ_TIME_OUT, TimeUnit.MILLISECONDS);

    private static Retrofit.Builder jSonBuilder =
            new Retrofit.Builder().baseUrl(Constants.POW_DABOX_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createGsonService(Class<S> serviceClass) {
        Retrofit retrofit = jSonBuilder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }
}
