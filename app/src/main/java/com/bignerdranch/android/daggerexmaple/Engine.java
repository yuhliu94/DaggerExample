package com.bignerdranch.android.daggerexmaple;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    private static final String TAG = "Engine";
    @Inject
    public Engine() {
        Log.d(TAG, "Engine constructor called");
    }
}
