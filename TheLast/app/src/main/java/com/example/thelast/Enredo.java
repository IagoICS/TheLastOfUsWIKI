package com.example.thelast;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Enredo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enredo);

        ImageButton ib_voltar = findViewById(R.id.ib_voltar);
        ib_voltar.setOnClickListener(v -> {
            Intent voltarintent = new Intent(Enredo.this,MainActivity.class);
            startActivity(voltarintent);
        });
        ImageButton btnamazon = findViewById(R.id.btn_amazon);
        btnamazon.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://www.amazon.com.br/s?k=the+last+of+us");
            Intent amazon = new Intent(Intent.ACTION_VIEW, uri);


                startActivity(amazon);

        });
    }
}