package com.example.sportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Sport> sportList;
    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        sportList = new ArrayList<>();

        Sport s1 = new Sport("Cricket",R.drawable.img_3);
        Sport s2 = new Sport("Football",R.drawable.img_4);
        Sport s3 = new Sport("Hockey",R.drawable.img_5);
        Sport s4 = new Sport("Volleyball",R.drawable.img_6);
        Sport s5 = new Sport("Tennis",R.drawable.img_7);
        Sport s6 = new Sport("Badminton",R.drawable.img_8);

        sportList.add(s1);
        sportList.add(s2);
        sportList.add(s3);
        sportList.add(s4);
        sportList.add(s5);
        sportList.add(s6);

        myAdapter = new MyAdapter(sportList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }
}