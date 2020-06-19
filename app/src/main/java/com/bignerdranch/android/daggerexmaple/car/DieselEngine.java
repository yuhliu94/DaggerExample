package com.bignerdranch.android.daggerexmaple.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";

    private int horsePower;

    public DieselEngine(int horsePower) {
        Log.d(TAG, "DieselEngine constructor called");
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horsepower: " + horsePower);
    }
}
