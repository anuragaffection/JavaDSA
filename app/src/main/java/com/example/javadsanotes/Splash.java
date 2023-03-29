package com.example.javadsanotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        CardView clickCard;
        clickCard = findViewById(R.id.clickCard);

        clickCard.setOnClickListener(v -> {
            Intent iCard;
            iCard = new Intent(Splash.this, MainActivity.class);
            startActivity(iCard);
        });
    }
}