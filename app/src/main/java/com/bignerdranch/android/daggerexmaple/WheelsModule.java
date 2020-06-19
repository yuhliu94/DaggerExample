package com.bignerdranch.android.daggerexmaple;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    private static final String TAG = "WheelsModule";

    @Provides
    static Rims provideRims() {
        Log.d(TAG, "provideRims called");
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Log.d(TAG, "provideTires called");
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        Log.d(TAG, "provideWheels called");
        return new Wheels(rims, tires);
    }
}
