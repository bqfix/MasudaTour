package com.example.android.masudatour;

import android.os.Parcel;
import android.os.Parcelable;

public class Location implements Parcelable {

    private String mLocationName;
    private String mLocationDescription;
    private int[] mImageID;
    private String mAddress;
    private String mHours;
    private String mURL;

    /** Constructor
     * @param locationName of the Location
     * @param description of the Location
     * @param imageID of the picture(s) to represent the Location
     * @param address of the Location
     * @param hours of operation of the Location
     * @param url of the Location's site
     */
    public Location(String locationName, String description, int[] imageID, String address, String hours, String geoLocation, String url) {
        this.mLocationName = locationName;
        this.mLocationDescription = description;
        this.mImageID = imageID;
        this.mAddress = address;
        this.mHours = hours;
        this.mURL = url;
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

    public String getAddress() {
        return mAddress;
    }

    public String getHours() {
        return mHours;
    }

    public String getmURL() {
        return mURL;
    }

    //Parcelable logic
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mLocationName);
        dest.writeString(this.mLocationDescription);
        dest.writeIntArray(this.mImageID);
    }

    protected Location(Parcel in) {
        this.mLocationName = in.readString();
        this.mLocationDescription = in.readString();
        this.mImageID = in.createIntArray();
    }

    public static final Parcelable.Creator<Location> CREATOR = new Parcelable.Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel source) {
            return new Location(source);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };
}
