package com.joora.complaint;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.webkit.WebHistoryItem;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {
    private RecyclerView recyclerView;
    private HistoryAdapter mAdapter;
    ArrayList<historyItem> items =new ArrayList<historyItem>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_layout);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        mAdapter = new HistoryAdapter(items);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareHistoryData();

    }
    private void prepareHistoryData() {
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));
        items.add(new historyItem("Mad Max: Fury Road", "Action & Adventure"));



    }


    }


