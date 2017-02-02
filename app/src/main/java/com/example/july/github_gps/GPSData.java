package com.example.july.github_gps;

/**
 * Created by Nikola on 27.01.17.
 */

public class GPSData {
    int langitude;
    int latitude;
    String date;
    String time;

    public GPSData(String date, int langitude, int latitude, String time) {
        this.date = date;
        this.langitude = langitude;
        this.latitude = latitude;
        this.time = time;
    }

    public String getTime() {return time; }

    public void setTime(String time) {this.time = time;}

    public int getLangitude() {
        return langitude;
    }

    public void setLangitude(int langitude) {
        this.langitude = langitude;
    }

    public int getLatitude() {
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
