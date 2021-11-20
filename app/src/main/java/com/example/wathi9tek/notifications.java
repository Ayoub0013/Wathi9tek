package com.example.wathi9tek;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class notifications extends AppCompatActivity {
    RecyclerView recyclerView;
    notificationsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> titles =  new ArrayList<String>();
        ArrayList<String> times =  new ArrayList<String>();
        ArrayList<String> contents  =  new ArrayList<String>();
        titles.add("notif 1"); times.add("time1"); contents.add("content 1");
        titles.add("notif 2"); times.add("time2"); contents.add("content 2");
        titles.add("notif 3"); times.add("time3"); contents.add("content 3");
        titles.add("notif 4"); times.add("time4"); contents.add("content 4");
        titles.add("notif 5"); times.add("time5"); contents.add("content 5");
        titles.add("notif 6"); times.add("time6"); contents.add("content 6");
        titles.add("notif 7"); times.add("time7"); contents.add("content 7");
        setContentView(R.layout.activity_notifications);
        recyclerView = findViewById(R.id.rv_notifications);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new notificationsAdapter(titles, contents,times);
        recyclerView.setAdapter(adapter);
    }
}