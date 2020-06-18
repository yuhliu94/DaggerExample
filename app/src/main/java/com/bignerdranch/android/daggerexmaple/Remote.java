package com.bignerdranch.android.daggerexmaple;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {
        Log.d(TAG, "Remote: Remote constructor called");
    }

    public void setListener(Car car) {
        Log.d(TAG, "setListener: Remote connected");
    }
}
