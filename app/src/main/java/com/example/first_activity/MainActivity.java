package com.example.first_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login (View view){

        Intent intent = new Intent(MainActivity.this,Second_Activity.class);
        startActivity(intent);
    }
    public void budget (View view) {
        Intent intent = new Intent(MainActivity.this, Thrid_Activity.class);
        startActivity(intent);
    }
    }

