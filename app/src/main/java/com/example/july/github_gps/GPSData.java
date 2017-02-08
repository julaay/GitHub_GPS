package com.example.july.github_gps;

/**
 * Created by Nikola on 27.01.17.
 */

public class GPSData  {
    double longitude;
    double latitude;
    String date;
    String time;

    public GPSData(CharSequence date, double longitude, double latitude, CharSequence time) {
        this.date = (String) date;
        this.longitude = longitude;
        this.latitude = latitude;
        this.time = (String) time;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTime() {return time; }

    public void setTime(String time) {this.time = time;}



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
