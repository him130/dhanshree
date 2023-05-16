package com.example.dhanshree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlanPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_payment);
        getSupportActionBar().hide();
    }
}