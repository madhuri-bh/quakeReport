package com.example.quakereport;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class EarthQuakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private final String LOG_TAG = EarthQuakeLoader.class.getName();

    private String mUrl;

    public EarthQuakeLoader(@NonNull Context context, String url) {
        super(context);
        mUrl = url;
    }

    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null)
            return null;

        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}