package com.ch.appiwhiskey.ApiManager;

import com.ch.appiwhiskey.models.Destileria;
import com.ch.appiwhiskey.models.Whiskey;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInicialWhiskey {
    String BASE_URL = "https://whiskyhunter.net/api/";

    @GET("auctions_info")
    Call<List<Whiskey>> getWhiskeys();

    @GET("distilleries_info")
    Call<List<Destileria>> getDestilerias();

}
