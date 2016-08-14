package com.example.kouta.jsonsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<Json> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String URL = "http://connpass.com/";
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        Api api = retrofit.create(Api.class);
        Call<Json> call = api.getJson();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<Json> call, Response<Json> response) {
        System.out.println(call.request().url());
        if (response.code() == 200){
            
            List<Event> events = response.body().getEvents();

            for (Event e:events){
                System.out.println(e.getTitle());
            }
        }
    }

    @Override
    public void onFailure(Call<Json> call, Throwable t) {
        Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
        t.printStackTrace();
    }
}
