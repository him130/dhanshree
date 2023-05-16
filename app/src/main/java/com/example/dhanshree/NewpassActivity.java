package com.example.dhanshree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class NewpassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpass);
        getSupportActionBar().hide();
        CardView card = findViewById(R.id.card);
        card.setCardBackgroundColor(Color.parseColor("#ffffff"));
    }

    public void PassChange(View view) {
        startActivity(new Intent(getApplicationContext(),PassChangedActivity.class));
    }

    public void newpassback(View view) {
        onBackPressed();
    }
}