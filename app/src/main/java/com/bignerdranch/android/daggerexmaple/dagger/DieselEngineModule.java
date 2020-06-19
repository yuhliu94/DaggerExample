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

    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    };
}
