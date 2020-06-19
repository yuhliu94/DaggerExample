package com.bignerdranch.android.daggerexmaple.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";

    @Inject
    public DieselEngine() {
        Log.d(TAG, "DieselEngine constructor called");
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started");
    }
}
