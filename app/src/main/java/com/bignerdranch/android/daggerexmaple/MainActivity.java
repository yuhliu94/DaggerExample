package com.bignerdranch.android.daggerexmaple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bignerdranch.android.daggerexmaple.car.Car;
import com.bignerdranch.android.daggerexmaple.dagger.CarComponent;
import com.bignerdranch.android.daggerexmaple.dagger.DaggerCarComponent;
import com.bignerdranch.android.daggerexmaple.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CarComponent component = DaggerCarComponent.create();
        // component.inject(this);
        // car = component.getCar();

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
