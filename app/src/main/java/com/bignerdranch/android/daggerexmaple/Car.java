package com.bignerdranch.android.daggerexmaple;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    // constructor -> fields -> methods
    private static final String TAG = "Car";

    @Inject
    Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        Log.d(TAG, "Car constructor called");
        // this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        Log.d(TAG, "enableRemote called");
        remote.setListener(this);
    }


    public void drive() {
        Log.d(TAG, "driving...");
    }
}
