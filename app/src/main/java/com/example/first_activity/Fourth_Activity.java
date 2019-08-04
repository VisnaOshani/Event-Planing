package com.example.first_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Fourth_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_);
    }

    public void addNewBudget (View view) {

        Intent intent = new Intent(Fourth_Activity.this,Thrid_Activity.class);
        startActivity(intent);
    }
    public void backToEvent (View view){
        Intent intent = new Intent(Fourth_Activity.this,AddEvents.class);
        startActivity(intent);
    }
}
