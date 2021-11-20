package com.example.wathi9tek;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class home extends AppCompatActivity {

    RecyclerView recyclerView;
    documentsAdapter adapter;
    String documents[]= {"certificat 1 ","certificat 2", "certificat 3","certificat 4", "certificat 5", "certificat 6", "certificat 7", "certificat 8", "certificat 9"};
    Button site;
    ImageButton notification;
    ImageView settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.rv_documents);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new documentsAdapter(documents,this);
        recyclerView.setAdapter(adapter);
        site = findViewById(R.id.site);
        notification = findViewById(R.id.notification);
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nofitication = new Intent(home.this, notifications.class);
                startActivity(nofitication);
            }
        });
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent site_web = new Intent(Intent.ACTION_VIEW);
                site_web.setData(Uri.parse("https://ft.univ-tlemcen.dz/"));
                startActivity(site_web);
            }
        });
        settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settings = new Intent(home.this, settings.class);
                startActivity(settings);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}