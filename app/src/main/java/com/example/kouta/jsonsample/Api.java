package com.example.kouta.jsonsample;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by kouta on 16/08/15.
 */
public interface Api {
    @GET("/api/v1/event")
    Call<Json> getJson();
}
