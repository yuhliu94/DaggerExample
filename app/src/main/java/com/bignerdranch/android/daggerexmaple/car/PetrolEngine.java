package com.bignerdranch.android.daggerexmaple.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine() {
        Log.d(TAG, "PetrolEngine constructor called");
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started");
    }
}
