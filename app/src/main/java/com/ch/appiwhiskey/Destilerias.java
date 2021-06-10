package com.ch.appiwhiskey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.ch.appiwhiskey.ApiManager.RetrofitClient;
import com.ch.appiwhiskey.models.Destileria;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Destilerias extends AppCompatActivity {
    ListView lvDestileria;
    List<Destileria> listaDestilerias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destilerias);
        lvDestileria = findViewById(R.id.lvDestileria);
        getDestileriasFromApi();

    }
    private void getDestileriasFromApi(){
        Call<List<Destileria>> call = RetrofitClient.getInstance().getMyApi().getDestilerias();
        call.enqueue(new Callback<List<Destileria>>() {
            @Override
            public void onResponse(Call<List<Destileria>> call, Response<List<Destileria>> response) {
                listaDestilerias = response.body();
                DestileriaAdapter adapter = new DestileriaAdapter(Destilerias.this, listaDestilerias);
                lvDestileria.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Destileria>> call, Throwable t) {

            }
        });
    }
}