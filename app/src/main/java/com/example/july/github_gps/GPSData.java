package com.example.july.github_gps;

/**
 * Created by Nikola on 27.01.17.
 */

public class GPSData  {
    String longitude;
    String latitude;
    String date;
    String time;

    public GPSData(String date, String longitude, String latitude, String time) {
        this.date = (String) date;
        this.longitude = longitude;
        this.latitude = latitude;
        this.time = (String) time;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
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
