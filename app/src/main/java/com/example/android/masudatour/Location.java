package com.example.android.masudatour;

public class Location {

    private String mLocationName;
    private String mLocationDescription;
    private int[] mImageID;

    /** Constructor
     * @param locationName of the Location
     * @param description of the Location
     * @param imageID of the picture(s) to represent the Location
     */
    public Location(String locationName, String description, int[] imageID) {
        this.mLocationName = locationName;
        this.mLocationDescription = description;
        this.mImageID = imageID;
    }


    public String getLocationName() {
        return mLocationName;
    }

    public String getLocationDescription() {
        return mLocationDescription;
    }

    public int[] getImageID() {
        return mImageID;
    }
}
