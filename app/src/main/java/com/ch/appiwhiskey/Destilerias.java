package com.ch.appiwhiskey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ch.appiwhiskey.ApiManager.RetrofitClient;
import com.ch.appiwhiskey.models.Destileria;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Destilerias extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvDestileria;
    List<Destileria> listaDestilerias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destilerias);
        lvDestileria = findViewById(R.id.lvDestileria);
        getDestileriasFromApi();
        lvDestileria.setOnItemClickListener(this);

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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, DestileriaDetalle.class);
        intent.putExtra("objDestileria", listaDestilerias.get(position));
        startActivity(intent);
    }
}