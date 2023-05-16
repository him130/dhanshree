package com.example.dhanshree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().hide();
    }

    public void signup(View view) {
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
        Toast.makeText(this, "Registration Successful!!", Toast.LENGTH_SHORT).show();
    }

    public void regback(View view) {
        onBackPressed();
    }
}