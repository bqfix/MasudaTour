package com.example.android.masudatour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    /**Constructor
     * @param context of the activity
     * @param locations to be listed
     *
     */
    public LocationAdapter(Context context, ArrayList<Location> locations){
        super(context, 0, locations);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        //Check if reusable view exists, else inflate view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_item, parent, false);
        }

        //Get current song object
         Location currentLocation = getItem(position);

        //Set Location Name
        TextView locationName = (TextView) listItemView.findViewById(R.id.location_name);
        locationName.setText(currentLocation.getLocationName());

        //Set Description
        TextView description = (TextView) listItemView.findViewById(R.id.location_description);
        description.setText(currentLocation.getLocationDescription());

        //Set Location Image
        ImageView imageID = (ImageView) listItemView.findViewById(R.id.location_image);
        imageID.setImageResource(currentLocation.getImageID()[0]);



        return listItemView;

    }

}
