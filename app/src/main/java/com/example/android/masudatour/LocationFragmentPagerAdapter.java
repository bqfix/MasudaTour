package com.example.android.masudatour;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LocationFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public LocationFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    //Instantiate fragments, passed arguments denote which array to use
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return LocationFragment.newInstance("restaurants");
            case 1: return LocationFragment.newInstance("sightseeing");
            case 2: return LocationFragment.newInstance("shopping");
            case 3: return LocationFragment.newInstance("events");
            default: return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return mContext.getString(R.string.restaurants);
            case 1: return mContext.getString(R.string.sightseeing);
            case 2: return mContext.getString(R.string.shopping);
            case 3: return mContext.getString(R.string.events);
            default: return null;
        }
    }

    //Set number of fragments
    @Override
    public int getCount() {
        return 4;
    }
}
