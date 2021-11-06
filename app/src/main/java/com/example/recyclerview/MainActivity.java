package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private CountrieListAdapter mAdapter;
    private final LinkedList<Countrie> mCountrieList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCountrieList.add(new Countrie(R.drawable.tunisia,"Tunisia"));
        mCountrieList.add(new Countrie(R.drawable.angleterre,"angleterre"));
        mCountrieList.add(new Countrie(R.drawable.tour_eiffel,"Paris"));
        mCountrieList.add(new Countrie(R.drawable.tower_pisa,"Italy"));

        mRecyclerView = findViewById(R.id.recyclerview);
// Create an adapter and supply the data to be displayed.
        mAdapter = new CountrieListAdapter(this, mCountrieList);
// Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
// Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}