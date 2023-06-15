package com.example.thelast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

public class Gameplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        ImageButton ib_voltar = findViewById(R.id.ib_voltar);
        ib_voltar.setOnClickListener(v -> {
            Intent voltarintent = new Intent(Gameplay.this,MainActivity.class);
            startActivity(voltarintent);
        });

        ImageButton btnspotify = findViewById(R.id.btnspotify);
        btnspotify.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://open.spotify.com/album/2GFFxj8aR2XpwIMYanOPjh?si=48633c00c0994e3e");
            Intent spotify = new Intent(Intent.ACTION_VIEW, uri);


            startActivity(spotify);

        });
    }
}