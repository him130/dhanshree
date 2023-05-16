package com.example.dhanshree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OTPPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otppage);
        getSupportActionBar().hide();
    }

    public void submit(View view) {
        startActivity(new Intent(getApplicationContext(),NewpassActivity.class));
    }

    public void otpp(View view) {
        onBackPressed();
    }
}