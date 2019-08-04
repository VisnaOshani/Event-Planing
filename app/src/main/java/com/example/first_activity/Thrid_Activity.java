package com.example.first_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Thrid_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid_);
    }

    public void addNewBudget (View view) {

        Intent intent = new Intent(Thrid_Activity.this, Fourth_Activity.class);
        startActivity(intent);
    }
    public void save(View view){

        Intent intent = new Intent(Thrid_Activity.this,Fourth_Activity.class);
        startActivity(intent);
    }

}
