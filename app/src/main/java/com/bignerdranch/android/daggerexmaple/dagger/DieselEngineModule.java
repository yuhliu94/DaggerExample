package com.bignerdranch.android.daggerexmaple.dagger;

import com.bignerdranch.android.daggerexmaple.car.DieselEngine;
import com.bignerdranch.android.daggerexmaple.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
