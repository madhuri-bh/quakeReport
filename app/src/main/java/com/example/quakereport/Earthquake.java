package com.example.quakereport;

class Earthquake {
    private String Magnitude;
    private String Location;
    private String Date;

    public Earthquake(String magnitude, String location, String date) {
        Magnitude = magnitude;
        Location = location;
        Date = date;
    }

    public String getMagnitude() {
        return Magnitude;
    }

    public void setMagnitude(String magnitude) {
        Magnitude = magnitude;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
