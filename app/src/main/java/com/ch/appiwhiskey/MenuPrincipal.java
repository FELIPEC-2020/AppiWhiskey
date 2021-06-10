package com.ch.appiwhiskey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnWhiskey;
    private ImageButton btnDestileria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btnWhiskey = findViewById(R.id.btnWhiskey);
        btnDestileria = findViewById(R.id.btnDestileria);
        btnWhiskey.setOnClickListener(this);
        btnDestileria.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnWhiskey) {
            Intent abrirWhiskey = new Intent(this, MainActivity.class);
            startActivity(abrirWhiskey);
        }else if(v.getId() == R.id.btnDestileria){
            Intent abrirDestileria = new Intent(this, Destilerias.class);
            startActivity(abrirDestileria);
        }
    }

}
