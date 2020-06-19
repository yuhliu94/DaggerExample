package com.bignerdranch.android.daggerexmaple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bignerdranch.android.daggerexmaple.car.Car;
import com.bignerdranch.android.daggerexmaple.dagger.CarComponent;
import com.bignerdranch.android.daggerexmaple.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
        // car = component.getCar();
        car.drive();
    }
}
