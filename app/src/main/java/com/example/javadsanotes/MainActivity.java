package com.example.javadsanotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerLanguage = findViewById(R.id.recyclerLanguage);
        ArrayList<model> arrLanguage = new ArrayList<>();


        model l1 = new model(R.drawable.language, "Java DSA HandWritten");
        model l2 = new model(R.drawable.language, "Java DSA Book");
        model l3 = new model(R.drawable.language, "Java DSA Videos ");

        arrLanguage.add(l1);
        arrLanguage.add(l2);
        arrLanguage.add(l3);

        RecycleAdapter recycleAdapter = new RecycleAdapter(this, arrLanguage);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);


        recyclerLanguage.setLayoutManager(linearLayoutManager);
        recyclerLanguage.setAdapter(recycleAdapter);

    }
}