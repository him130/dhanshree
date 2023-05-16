package com.example.dhanshree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class FPMobileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpmobile);
        getSupportActionBar().hide();
        CardView card = findViewById(R.id.card);
        card.setCardBackgroundColor(Color.parseColor("#ffffff"));
    }

    public void next(View view) {
        startActivity(new Intent(getApplicationContext(),OTPPageActivity.class));
    }

    public void fpmbcack(View view) {
    }
}