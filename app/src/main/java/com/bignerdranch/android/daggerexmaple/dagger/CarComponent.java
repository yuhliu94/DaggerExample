package com.bignerdranch.android.daggerexmaple.dagger;

import com.bignerdranch.android.daggerexmaple.MainActivity;
import com.bignerdranch.android.daggerexmaple.car.Car;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
