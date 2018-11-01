package com.example.android.masudatour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Get location from Intent
        Intent detailsIntent = getIntent();
        Location location = detailsIntent.getParcelableExtra("location");

        //Set details page to reflect location's details
        ImageView detailsMainImage = (ImageView) findViewById(R.id.details_main_image);
        detailsMainImage.setImageResource(location.getImageID()[0]);

        TextView detailsName = (TextView) findViewById(R.id.details_name);
        detailsName.setText(location.getLocationName());

        TextView detailsDescrip = (TextView) findViewById(R.id.details_descrip);
        detailsDescrip.setText(location.getLocationDescription());

    }
}
