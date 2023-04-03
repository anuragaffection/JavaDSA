package com.example.javadsanotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class ActChapter extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);

        RecyclerView chapterRecyclerView;
        chapterRecyclerView = findViewById(R.id.chapterRecyclerView);

        ArrayList<model> arrChapter;
        arrChapter = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        chapterRecyclerView.setLayoutManager(linearLayoutManager);

        model m1 = new model("01. Alpha");
        model m2 = new model("02. Course Introduction");
        model m3 = new model("03. Pre Requisites ");
        model m4 = new model("04. Flowcharts & Pseudo Codes");
        model m5 = new model("05. Mentorship Session");
        model m6 = new model("06. Variables & Data Types - 01");
        model m7 = new model("06. Variables & Data Types - 02");
        model m8 = new model("07. Operators");
        model m9 = new model("08. Conditional Statements");
        model m10 = new model("09. Loops");
        model m11 = new model("10. Patterns Basic");
        model m12 = new model("11. Function - 01");
        model m13 = new model("11. Function - 02");



        arrChapter.add(m1);
        arrChapter.add(m2);
        arrChapter.add(m3);
        arrChapter.add(m4);
        arrChapter.add(m5);
        arrChapter.add(m6);
        arrChapter.add(m7);
        arrChapter.add(m8);
        arrChapter.add(m9);
        arrChapter.add(m10);
        arrChapter.add(m11);
        arrChapter.add(m12);
        arrChapter.add(m13);


        AdapterChapter chapterAdapter = new AdapterChapter(this, arrChapter);
        chapterRecyclerView.setAdapter(chapterAdapter);
    }
}
