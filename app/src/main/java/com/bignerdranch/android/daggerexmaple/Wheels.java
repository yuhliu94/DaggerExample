package com.bignerdranch.android.daggerexmaple;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {
    // We don't own this class so we can't annotate it with @Inejct
    private static final String TAG = "Wheels";

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        Log.d(TAG, "Wheels constructor called");
        this.rims = rims;
        this.tires = tires;
    }
}
