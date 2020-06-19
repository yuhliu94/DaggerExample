package com.bignerdranch.android.daggerexmaple.dagger;

import com.bignerdranch.android.daggerexmaple.MainActivity;
import com.bignerdranch.android.daggerexmaple.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int horsePower);

        CarComponent build();
    }
}
