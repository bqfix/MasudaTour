package com.example.android.masudatour;

public class Location {

    private String mLocationName;
    private String mDescription;
    private int[] mImageID;

    /** Constructor
     * @param locationName of the Location
     * @param description of the Location
     * @param imageID of the picture(s) to represent the Location
     */
    public Location(String locationName, String description, int[] imageID) {
        this.mLocationName = locationName;
        this.mDescription = description;
        this.mImageID = imageID;
    }


    public String getLocationName() {
        return mLocationName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int[] getImageID() {
        return mImageID;
    }
}
