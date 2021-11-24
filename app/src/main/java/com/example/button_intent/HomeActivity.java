package com.example.button_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * This Activity shows the user a TextView which tells them that they entered the app.
 *
 * Layout File: activity_home.xml
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}