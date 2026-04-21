package com.saru.recyclerviewapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<LanguageModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        list = new ArrayList<>();

        list.add(new LanguageModel("Java", "Object Oriented Language", R.mipmap.ic_launcher));
        list.add(new LanguageModel("Python", "Easy and Powerful", R.mipmap.ic_launcher));
        list.add(new LanguageModel("Kotlin", "Modern Android Language", R.mipmap.ic_launcher));
        list.add(new LanguageModel("C++", "Fast and Low Level", R.mipmap.ic_launcher));

        LanguageAdapter adapter = new LanguageAdapter(this, list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}