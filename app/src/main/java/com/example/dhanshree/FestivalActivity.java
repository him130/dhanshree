package com.example.dhanshree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FestivalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);
        getSupportActionBar().hide();
    }
}