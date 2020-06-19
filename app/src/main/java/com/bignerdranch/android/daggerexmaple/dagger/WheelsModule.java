package com.bignerdranch.android.daggerexmaple.dagger;

import android.util.Log;

import com.bignerdranch.android.daggerexmaple.car.Rims;
import com.bignerdranch.android.daggerexmaple.car.Tires;
import com.bignerdranch.android.daggerexmaple.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {
    private static final String TAG = "WheelsModule";
    // Make the module abstract if all the provides methods are static
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
