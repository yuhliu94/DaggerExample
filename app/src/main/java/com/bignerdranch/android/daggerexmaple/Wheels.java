package com.bignerdranch.android.daggerexmaple;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {
    private static final String TAG = "Wheels";
    @Inject
    public Wheels() {
        Log.d(TAG, "Wheels: Wheels constructor called");
    }
}
