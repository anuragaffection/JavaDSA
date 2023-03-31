package com.example.javadsanotes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerLanguage = findViewById(R.id.recyclerLanguage);
        ArrayList<model> arrLanguage = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerLanguage.setLayoutManager(linearLayoutManager);



        model l1 = new model(R.drawable.javadsa, " Notes ");
        model l2 = new model(R.drawable.javadsa, " Book ");
        model l3 = new model(R.drawable.javadsa, " Videos ");

        arrLanguage.add(l1);
        arrLanguage.add(l2);
        arrLanguage.add(l3);

        RecycleAdapter recycleAdapter = new RecycleAdapter(this, arrLanguage, Model -> {
            Intent iSwitch;
            iSwitch = new Intent(MainActivity.this, Chapter.class);
            startActivity(iSwitch);
        });

        recyclerLanguage.setAdapter(recycleAdapter);


    }

}