package com.example.button_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * This Activity creates a Login Screen.
 * The user can click on a Button which has an OnClickListener.
 * This listener calls a new Intent which leads to another Activity.
 *
 * Layout File: activity_main.xml
 *
 * @author Lukas Plenk
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton;

    /**
     * The Button gets referenced from the layout.
     * An OnClickListener is being attached to the Button.
     * @param savedInstanceState is a standard parameter.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.button_login);
        loginButton.setOnClickListener(this);
    }

    /**
     * This method creates a new Intent from the MainActivity to the HomeActivity.
     * The intent is being used for leaving the Activity for the next one.
     * @param view is the specific UI element that was clicked on.
     */
    @Override
    public void onClick(View view) {

        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}