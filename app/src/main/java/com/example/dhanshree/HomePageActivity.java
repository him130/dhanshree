package com.example.dhanshree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        getSupportActionBar().hide();
    }

    public void festival(View view) {
        startActivity(new Intent(getApplicationContext(),FestivalActivity.class));
    }

    public void profile(View view) {
        startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
    }

    public void rupee(View view) {
        startActivity(new Intent(getApplicationContext(),PlanPaymentActivity.class));
    }

    public void setting(View view) {
        startActivity(new Intent(getApplicationContext(),SettingActivity.class));
    }
}