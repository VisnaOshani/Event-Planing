package com.example.first_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
    }

    public void budgetList (View view) {

        Intent intent = new Intent(Second_Activity.this,Fourth_Activity.class);
        startActivity(intent);
    }
    public void Signup(View view) {
        Intent intent = new Intent(Second_Activity.this,MainActivity.class);
        startActivity(intent);
    }
}
