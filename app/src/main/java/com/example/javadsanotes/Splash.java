package com.example.javadsanotes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Button clickHere;
        clickHere = findViewById(R.id.clickHere);

        clickHere.setOnClickListener(v -> {
            Intent iCard;
            iCard = new Intent(Splash.this, MainActivity.class);
            startActivity(iCard);
        });
    }
}