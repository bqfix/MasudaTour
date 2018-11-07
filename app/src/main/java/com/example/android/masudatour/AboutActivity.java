package com.example.android.masudatour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Set up functionality
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
