package com.github.gmetal;

import com.github.gmetal.dagger.CarComponent;
import com.github.gmetal.dagger.DaggerCarComponent;
import com.github.gmetal.dagger.CarModule;
import com.github.gmetal.nodagger.Car;
import com.github.gmetal.nodagger.Engine;
import com.github.gmetal.nodagger.Tires;
import com.github.gmetal.nodagger.Wheels;

public class Main {

    public static void simple() {

        com.github.gmetal.simple.Car car = new com.github.gmetal.simple.Car();
        System.out.println(car);
    }

    public static void withoutDagger() {
        Engine engine = new Engine();
        Tires tires = new Tires();
        Wheels wheels = new Wheels(tires);

        Car car = new Car(wheels, engine);
        System.out.println(car);
    }

    public static void withDagger() {
        com.github.gmetal.dagger.Car car = new com.github.gmetal.dagger.Car();
        System.out.println(car);
        CarComponent carComponent = DaggerCarComponent.builder()
                .carModule(new CarModule())
                .build();
        carComponent.inject(car);
        System.out.println(car);
    }

    public static void main(String[] args) {
        simple();
        System.out.println("---------------");
        withoutDagger();
        System.out.println("---------------");
        withDagger();
    }
}
