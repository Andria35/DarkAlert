package com.example.darkalert;   // <-- change to your real package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.darkalert.R;

public class MainActivity extends AppCompatActivity {

    private Button btnPoliceStation;
    private Button btnPublish;
    private Button btnSubscribe;
    private Button btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   // uses your XML

        // 1. Connect XML views to Java
        btnPoliceStation = findViewById(R.id.btnPoliceStation);
        btnPublish       = findViewById(R.id.btnPublish);
        btnSubscribe     = findViewById(R.id.btnSubscribe);
        btnSettings      = findViewById(R.id.btnSettings);

        // 2. Set click listeners
        btnPoliceStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: open Police Station screen or do something
                Toast.makeText(MainActivity.this,
                        "Police Station clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnPublish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: open Publish screen
                Toast.makeText(MainActivity.this,
                        "Publish clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnSubscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: open Subscribe screen
                Toast.makeText(MainActivity.this,
                        "Subscribe clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: open Settings screen
                Toast.makeText(MainActivity.this,
                        "Settings clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}