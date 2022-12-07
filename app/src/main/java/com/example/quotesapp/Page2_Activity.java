package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class Page2_Activity extends AppCompatActivity {
RecyclerView recyclerView;
private static  final String TAG = "Page2_Activity";
ArrayList<QuotesData> modelArrayList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        recyclerView = findViewById(R.id.recycleview);

        for (int i = 0; i < ; i++) {
            
        }
    }
}