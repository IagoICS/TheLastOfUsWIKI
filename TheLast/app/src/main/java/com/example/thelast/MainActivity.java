package com.example.thelast;

import android.content.Intent;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ib_joel = findViewById(R.id.ib_joel);
        ib_joel.setOnClickListener(v -> {
            Intent Joelintent = new Intent(MainActivity.this,JoelMiller.class);
            startActivity(Joelintent);


        });
        ImageButton ib_ellie = findViewById(R.id.ib_ellie);
        ib_ellie.setOnClickListener(v -> {
            Intent ellieintent = new Intent(MainActivity.this,Ellie.class);
            startActivity(ellieintent);
        });
        ImageButton ib_tess = findViewById(R.id.ib_tess);
        ib_tess.setOnClickListener(v -> {
            Intent tessintent = new Intent(MainActivity.this,Tess.class);
            startActivity(tessintent);
        });
        ImageButton ib_marlene = findViewById(R.id.ib_marlene);
        ib_marlene.setOnClickListener(v -> {
            Intent marleneintent = new Intent(MainActivity.this,Marlene.class);
            startActivity(marleneintent);
        });
        ImageButton ib_tommy = findViewById(R.id.ib_tommy);
        ib_tommy.setOnClickListener(v -> {
            Intent tommyintent = new Intent(MainActivity.this,Tommy.class);
            startActivity(tommyintent);
        });
        ImageButton ib_enredo = findViewById(R.id.ib_enredo);
        ib_enredo.setOnClickListener(v -> {
            Intent enredointent = new Intent(MainActivity.this,Enredo.class);
            startActivity(enredointent);
        });
        ImageButton ib_inimigo = findViewById(R.id.ib_inimigo);
        ib_inimigo.setOnClickListener(v -> {
            Intent inimigointent = new Intent(MainActivity.this,Inimigos.class);
            startActivity(inimigointent);
        });
        ImageButton ib_gameplay = findViewById(R.id.ib_gameplay);
        ib_gameplay.setOnClickListener(v -> {
            Intent gameplayintent = new Intent(MainActivity.this,Gameplay.class);
            startActivity(gameplayintent);
        });
        final HorizontalScrollView horizontalScrollView = findViewById(R.id.horizontalScrollView);
        final ImageButton lastImageButton = findViewById(R.id.ib_marlene);

        horizontalScrollView.getViewTreeObserver().addOnScrollChangedListener(() -> {
            int scrollViewWidth = horizontalScrollView.getChildAt(0).getWidth();
            int scrollX = horizontalScrollView.getScrollX();
            int containerWidth = horizontalScrollView.getWidth();


            if (scrollViewWidth - scrollX <= containerWidth) {

                horizontalScrollView.smoothScrollTo(lastImageButton.getLeft(), 0);
            }
        });
    }
}
