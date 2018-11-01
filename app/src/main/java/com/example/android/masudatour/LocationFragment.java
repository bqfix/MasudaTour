package com.example.android.masudatour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LocationFragment extends Fragment {
    // Return subject on fragment initialization to decide which arraylist to use
    private static final String ARG_SUBJECT = "subject";

    private String mSubject;

    public LocationFragment() {
        // Required empty public constructor
    }

    /**
     * Factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param subject of the fragment
     * @return A new instance of fragment LocationFragment.
     */
    public static LocationFragment newInstance(String subject) {
        LocationFragment fragment = new LocationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SUBJECT, subject);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mSubject = getArguments().getString(ARG_SUBJECT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.location_list, container, false);

        //Choose the ArrayList
        final ArrayList<Location> locations;
        String arrayChoice = mSubject;
        switch (arrayChoice) {
            case "restaurants": locations = LocationArrays.getRestaurants(getActivity()); break;
            case "sightseeing": locations = LocationArrays.getSightseeing(getActivity()); break;
            case "shopping": locations = LocationArrays.getShopping(getActivity()); break;
            case "events": locations = LocationArrays.getEvents(getActivity()); break;
            default: locations = null;
        }

        //Create LocationAdapter
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);

        //Find Listview
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Set adapter to ListView
        listView.setAdapter(locationAdapter);

        //SetOnItemClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Intent to go to DetailsActivity
                Intent detailsIntent = new Intent(getActivity(),DetailsActivity.class);

                //Add current location object to Intent to make accessible in DetailsActivity
                detailsIntent.putExtra("location",locations.get(position));

                //Execute Intent
                startActivity(detailsIntent);
            }
        });

        return rootView;
    }



}
