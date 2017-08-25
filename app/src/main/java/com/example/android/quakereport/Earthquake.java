package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by Guilherme on 23/08/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mDate;
    private String mUrl;

    public Earthquake(double mMagnitude, String mLocation, long mDate, String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
        this.mUrl = url;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public long getUnixTime() {
        return mDate;
    }

    public Date getDate() {
        return new Date(mDate);
    }

    public void setDate(long mDate) {
        this.mDate = mDate;
    }
}
