package com.bignerdranch.android.daggerexmaple.dagger;

import com.bignerdranch.android.daggerexmaple.car.DieselEngine;
import com.bignerdranch.android.daggerexmaple.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    // Tell Dagger to get an int from this provide method whenever an integer is needed
    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    };
}
