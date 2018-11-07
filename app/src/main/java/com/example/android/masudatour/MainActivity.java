package com.example.android.masudatour;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add navigation button
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.baseline_menu_white_24);

        //Assign Drawer Layout
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        //Logic for drawer buttons
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //Mark tapped item as the choice
                menuItem.setChecked(true);

                //Close Navigation Drawer
                mDrawerLayout.closeDrawers();

                //Open appropriate fragment based on selection
                Intent specificLocationIntent = new Intent(MainActivity.this, LocationActivity.class);
                switch (menuItem.getItemId()) {
                    case R.id.nav_restaurants: specificLocationIntent.putExtra("position", 0); break;
                    case R.id.nav_sightseeing: specificLocationIntent.putExtra("position", 1); break;
                    case R.id.nav_shopping: specificLocationIntent.putExtra("position", 2); break;
                    case R.id.nav_events: specificLocationIntent.putExtra("position", 3); break;
                    case R.id.nav_about: Intent aboutIntent = new Intent(MainActivity.this,AboutActivity.class); startActivity(aboutIntent); return true;
                }

                startActivity(specificLocationIntent);
                return true;
            }
        });

        Button enterButton = (Button) findViewById(R.id.enter_button);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locationIntent = new Intent(MainActivity.this,LocationActivity.class);
                startActivity(locationIntent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
