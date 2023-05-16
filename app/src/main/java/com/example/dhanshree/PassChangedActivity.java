package com.example.dhanshree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class PassChangedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_changed);
        getSupportActionBar().hide();
        CardView card = findViewById(R.id.card);
        card.setCardBackgroundColor(Color.parseColor("#ffffff"));
    }

    public void BTL(View view) {
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
    }
}