package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by Guilherme on 23/08/2017.
 */

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private Date mDate;

    public Earthquake(String mMagnitude, String mLocation, Date mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(String mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }
}
