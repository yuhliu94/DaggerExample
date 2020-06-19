package com.bignerdranch.android.daggerexmaple.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    // constructor -> fields -> methods
    private static final String TAG = "Car";

    // @Inject
    // Engine engine;
    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        Log.d(TAG, "Car constructor called");
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        Log.d(TAG, "enableRemote called");
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " drives " + this);
    }
}
