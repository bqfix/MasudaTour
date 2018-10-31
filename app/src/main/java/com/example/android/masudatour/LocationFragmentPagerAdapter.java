package com.example.android.masudatour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LocationFragmentPagerAdapter extends FragmentPagerAdapter {

    public LocationFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //Instantiate fragments, passed arguments denote which array to use
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return LocationFragment.newInstance("restaurants");
            case 1: return LocationFragment.newInstance("restaurants");
            case 2: return LocationFragment.newInstance("restaurants");
            case 3: return LocationFragment.newInstance("restaurants");
            default: return null;
        }
    }

    //Set number of fragments
    @Override
    public int getCount() {
        return 4;
    }
}
