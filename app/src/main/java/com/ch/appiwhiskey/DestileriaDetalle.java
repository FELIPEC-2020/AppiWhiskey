package com.ch.appiwhiskey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ch.appiwhiskey.models.Destileria;

public class DestileriaDetalle extends AppCompatActivity {
    TextView txtNombreD;
    TextView txtSlugD;
    TextView txtCountryD;
    TextView txtWhiskyBase;
    TextView txtWhiskyBaseVotes;
    TextView txtWhiskyBaseRating;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destileria_detalle);
        txtNombreD = findViewById(R.id.txtNombreD);
        txtSlugD = findViewById(R.id.txtSlugD);
        txtCountryD = findViewById(R.id.txtCountryD);
        txtWhiskyBase = findViewById(R.id.txtWhiskyBase);
        txtWhiskyBaseVotes = findViewById(R.id.txtWhiskybaseVotes);
        txtWhiskyBaseRating = findViewById(R.id.txtWhiskyBaseRating);


        Destileria objDestilerias = (Destileria) getIntent().getSerializableExtra("objDestileria");
        txtNombreD.setText(objDestilerias.getDestileriaName());
        txtSlugD.setText("Slug: "+objDestilerias.getDestileriaSlug());
        txtCountryD.setText(objDestilerias.getDestileriaCountry());
        txtWhiskyBase.setText(objDestilerias.getDestileriaWhiskybase_whiskies());
        txtWhiskyBaseVotes.setText(objDestilerias.getDestileriaWhiskybase_votes());
        txtWhiskyBaseRating.setText(objDestilerias.getDestileriawhiskybase_rating());


    }

}