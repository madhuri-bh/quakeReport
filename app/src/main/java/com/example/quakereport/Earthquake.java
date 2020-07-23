package com.example.quakereport;

class Earthquake {
    private double Magnitude;
    private String Location;
    private String Url;
    private long TimeInMilliSeconds;

    public Earthquake(double magnitude, String location, long timeInMilliSeconds, String url) {
        Magnitude = magnitude;
        Location = location;
        TimeInMilliSeconds = timeInMilliSeconds;
        Url = url;
    }


    public double getMagnitude() {
        return Magnitude;
    }

    public void setMagnitude(double magnitude) {
        Magnitude = magnitude;
    }

    public String getLocation() {
        return Location;
    }

    public void setPrimaryLocationLocation(String primaryLocation) {
        Location = primaryLocation;

    }

    public long getTimeInMilliSeconds() {
        return TimeInMilliSeconds;
    }

    public void setTimeInMilliSeconds(long timeInMilliSeconds) {
        TimeInMilliSeconds = timeInMilliSeconds;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
