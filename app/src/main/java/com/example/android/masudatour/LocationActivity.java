package com.example.android.masudatour;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set up functionality
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_location);

        //Set ViewPager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //Create an adapter for each page
        FragmentPagerAdapter fragmentPagerAdapter = new LocationFragmentPagerAdapter(getSupportFragmentManager());

        //Set the adapter per page
        viewPager.setAdapter(fragmentPagerAdapter);

        //Setup Tab Layout with ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);


    }
}
