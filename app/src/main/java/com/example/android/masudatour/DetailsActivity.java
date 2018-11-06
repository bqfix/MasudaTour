package com.example.android.masudatour;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Add up functionality
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Get location from Intent
        Intent detailsIntent = getIntent();
        final Location location = detailsIntent.getParcelableExtra("location");

        //Set details page to reflect location's details
        ImageView detailsMainImage = (ImageView) findViewById(R.id.details_main_image);
        detailsMainImage.setImageResource(location.getImageID()[0]);

        TextView detailsName = (TextView) findViewById(R.id.details_name);
        detailsName.setText(location.getLocationName());

        TextView detailsDescrip = (TextView) findViewById(R.id.details_descrip);
        detailsDescrip.setText(location.getLocationDescription());

        TextView detailsAddress = (TextView) findViewById(R.id.details_address);
        detailsAddress.setText(location.getAddress());

        TextView detailsHours = (TextView) findViewById(R.id.details_hours);
        detailsHours.setText(location.getHours());

        Button detailsWebsite = (Button) findViewById(R.id.details_website);
        detailsWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(location.getmURL()));
                startActivity(websiteIntent);
            }
        });

        //Create RecyclerView to handle images

        //Set Layout Manager
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.image_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        final ImageView zoomedImage = (ImageView) findViewById(R.id.zoomed_image);
        //Create and set instance of custom adapter
        RecyclerView.Adapter adapter = new ImagesRecyclerViewAdapter(location.getImageID(), zoomedImage);
        recyclerView.setAdapter(adapter);

        //Set on-click listener for zoomed image
        zoomedImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomedImage.setVisibility(View.INVISIBLE);
            }
        });

    }
}
