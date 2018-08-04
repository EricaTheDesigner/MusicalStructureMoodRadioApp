package com.example.android.musicalstructuremoodradioapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the happy playlist
        TextView happy = findViewById(R.id.happy);

        // Set a click listener on that View
        happy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the happy playlist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HappyActivity}
                Intent happyIntent = new Intent(MainActivity.this, HappyActivity.class);

                // Start the new activity
                startActivity(happyIntent);
            }
        });

        // Find the View that shows the sad playlist
        TextView sad = findViewById(R.id.sad);

        // Set a click listener on that View
        sad.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SadActivity}
                Intent sadIntent = new Intent(MainActivity.this, SadActivity.class);

                // Start the new activity
                startActivity(sadIntent);
            }
        });

        // Find the View that shows the romantic playlist
        TextView romantic = findViewById(R.id.romantic);

        // Set a click listener on that View
        romantic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RomanticActivity}
                Intent romanticIntent = new Intent(MainActivity.this, RomanticActivity.class);

                // Start the new activity
                startActivity(romanticIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView phrases = findViewById(R.id.sleepy);

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SleepyActivity}
                Intent sleepyIntent = new Intent(MainActivity.this, SleepyActivity.class);

                // Start the new activity
                startActivity(sleepyIntent);
            }
        });
    }

    public void openHappyRadio(View view){
        //code to open new screen with intent from onClickListener?
        Intent i = new Intent(this, HappyActivity.class);
        startActivity(i);

    }

}
