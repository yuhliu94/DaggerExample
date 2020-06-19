package com.bignerdranch.android.daggerexmaple.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {
        Log.d(TAG, "Remote constructor called");
    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
