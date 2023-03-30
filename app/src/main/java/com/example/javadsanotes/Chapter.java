package com.example.javadsanotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class Chapter extends AppCompatActivity {

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
        model m6 = new model("06. Variables & Data Types");
        model m7 = new model("07. Operators in java  ");
        model m8 = new model("08. Conditional Statements ");

        arrChapter.add(m1);
        arrChapter.add(m2);
        arrChapter.add(m3);
        arrChapter.add(m4);
        arrChapter.add(m5);
        arrChapter.add(m6);
        arrChapter.add(m7);
        arrChapter.add(m8);

        ChapterAdapter chapterAdapter = new ChapterAdapter(this, arrChapter);
        chapterRecyclerView.setAdapter(chapterAdapter);
    }
}
