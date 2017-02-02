package com.example.july.github_gps;

/**
 * Created by Nikola on 27.01.17.
 */

public class GPSData {
    double longitude;
    double latitude;
    String date;
    String time;

    public GPSData(String date, double longitude, double latitude, String time) {
        this.date = date;
        this.longitude = longitude;
        this.latitude = latitude;
        this.time = time;
    }

    public String getTime() {return time; }

    public void setTime(String time) {this.time = time;}

    public double getLangitude() {
        return longitude;
    }

    public void setLangitude(int langitude) {
        this.longitude = langitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
