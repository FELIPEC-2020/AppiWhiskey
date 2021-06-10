package com.ch.appiwhiskey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ch.appiwhiskey.models.Whiskey;

public class WhiskeyDatalle extends AppCompatActivity implements View.OnClickListener {
    TextView txtNombre;
    TextView txtSlug;
    TextView txtBuyersFee;
    TextView txtSellersFee;
    TextView txtReserveFee;
    TextView txtListingFee;
    TextView txtBaseCurrency;
    Button btnVisitar;
    String enlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whiskey_datalle);
        txtNombre = findViewById(R.id.txtNombre);
        txtSlug = findViewById(R.id.txtSlug);
        txtBuyersFee = findViewById(R.id.txtBuyersFee);
        txtSellersFee = findViewById(R.id.txtSellersFee);
        txtReserveFee = findViewById(R.id.txtReserverFee);
        txtListingFee = findViewById(R.id.txtListing);
        txtBaseCurrency = findViewById(R.id.txtBaseCurrency);
        btnVisitar = findViewById(R.id.btnVisitar);

        btnVisitar.setOnClickListener(this);
        Whiskey objWhiskeys = (Whiskey) getIntent().getSerializableExtra("objWhiskey");
        txtNombre.setText(objWhiskeys.getWhiskeyName());
        txtSlug.setText("Slug"+objWhiskeys.getWhiskeySlug());
        txtBuyersFee.setText(objWhiskeys.getWhiskeyBuyers_fee());
        txtSellersFee.setText(objWhiskeys.getWhiskeySellers_fee());
        txtReserveFee.setText(objWhiskeys.getWhiskeyReserve_fee());
        txtListingFee.setText(objWhiskeys.getWhiskeyListing_fee());
        txtBaseCurrency.setText(objWhiskeys.getWhiskeyBase_currency());

        enlace = objWhiskeys.getWhiskeyUrl();
    }
    //al dar clic en boton lleva a URL que tiene el Endpoint
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnVisitar){
            Uri url = Uri.parse(enlace);
            Intent intent = new Intent(Intent.ACTION_VIEW, url);
            startActivity(intent);
        }
    }
}