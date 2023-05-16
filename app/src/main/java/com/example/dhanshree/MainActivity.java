package com.example.dhanshree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
    }

    public void registration(View view) {
        startActivity(new Intent(getApplicationContext(),RegistrationActivity.class));
    }
}