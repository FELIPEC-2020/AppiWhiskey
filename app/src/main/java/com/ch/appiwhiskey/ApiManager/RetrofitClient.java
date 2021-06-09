package com.ch.appiwhiskey.ApiManager;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance = null;
    private ApiInicialWhiskey myApInicial;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiInicialWhiskey.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        myApInicial = retrofit.create(ApiInicialWhiskey.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public ApiInicialWhiskey getMyApi() {

        return myApInicial;
    }
}
