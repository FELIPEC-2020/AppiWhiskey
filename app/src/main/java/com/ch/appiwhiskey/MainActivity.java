package com.ch.appiwhiskey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ch.appiwhiskey.ApiManager.RetrofitClient;
import com.ch.appiwhiskey.models.Whiskey;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listaWhiskeys;
    List<Whiskey> myWhiskeys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaWhiskeys = findViewById(R.id.lvNombreWhiskey);
        getWhiskeysFromApi();
        listaWhiskeys.setOnItemClickListener(this);
    }

    private void getWhiskeysFromApi() {
        Call<List<Whiskey>> call = RetrofitClient.getInstance().getMyApi().getWhiskeys();
        call.enqueue(new Callback<List<Whiskey>>() {
            @Override
            public void onResponse(Call<List<Whiskey>> call, Response<List<Whiskey>> response) {
                myWhiskeys = response.body();

                WhiskeyAdapter adapter = new WhiskeyAdapter(MainActivity.this, myWhiskeys);
                listaWhiskeys.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Whiskey>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Ocurrió un error", Toast.LENGTH_SHORT).show();
            }


        });

    }
    //al dar clic a un whiskey de la lista lleva al detalle de este
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, WhiskeyDatalle.class);
        intent.putExtra("objWhiskey", myWhiskeys.get(position));
        startActivity(intent);
    }
}