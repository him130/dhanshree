package com.example.dhanshree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        CardView card = findViewById(R.id.card);
        card.setCardBackgroundColor(Color.parseColor("#ffffff"));
    }
    public void FGPass(View view) {
        startActivity(new Intent(getApplicationContext(),FPMobileActivity.class));
    }

    public void HomePage(View view) {
        startActivity(new Intent(getApplicationContext(),HomePageActivity.class));
        Toast.makeText(this, "Login Successful!!", Toast.LENGTH_SHORT).show();
    }

    public void logback(View view) {
        onBackPressed();
    }
}