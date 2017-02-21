package com.udacity.example;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {
TextView joketext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        joketext= (TextView) findViewById(R.id.libraryJokeTextView);
        Intent i=getIntent();
        joketext.setText(i.getStringExtra("joke"));
    }
}
