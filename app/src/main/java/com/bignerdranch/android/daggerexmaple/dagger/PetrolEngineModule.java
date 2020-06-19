package com.bignerdranch.android.daggerexmaple.dagger;

import com.bignerdranch.android.daggerexmaple.car.Engine;
import com.bignerdranch.android.daggerexmaple.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

// @Module
// public class PetrolEngineModule {
//     private static final String TAG = "PetrolEngineModule";
//
//     @Provides
//     Engine provideEngine(PetrolEngine engine) {
//         Log.d(TAG, "provideEngine called");
//         return engine;
//     }
// }

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
