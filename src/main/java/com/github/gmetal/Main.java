package com.github.gmetal;

import com.github.gmetal.dagger.*;
import com.github.gmetal.nodagger.Car;
import com.github.gmetal.nodagger.Engine;
import com.github.gmetal.nodagger.Tires;
import com.github.gmetal.nodagger.Wheels;

import javax.inject.Inject;

public class Main {

    @Inject
    Bicycle bicycle;

    public static void carSimple() {

        com.github.gmetal.simple.Car car = new com.github.gmetal.simple.Car();
        System.out.println(car);
    }

    public static void carWithoutDagger() {
        Engine engine = new Engine();
        Tires tires = new Tires();
        Wheels wheels = new Wheels(tires);

        Car car = new Car(wheels, engine);
        System.out.println(car);
    }

    public static void carWithDagger() {
        com.github.gmetal.dagger.Car car = new com.github.gmetal.dagger.Car();
        com.github.gmetal.dagger.Car car2 = new com.github.gmetal.dagger.Car();
        com.github.gmetal.dagger.Car car3 = new com.github.gmetal.dagger.Car();

        System.out.println(car);

        CarComponent carComponent = DaggerCarComponent.builder()
                .carModule(new CarModule())
                .build();
        carComponent.inject(car);
        carComponent.inject(car2);
        carComponent.inject(car3);

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);

        carComponent = DaggerCarComponent.builder()
                .carModule(new CarModule())
                .build();

        carComponent.inject(car);
        carComponent.inject(car2);
        carComponent.inject(car3);

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
    }

    public static void bicycleWithDagger() {

        BicycleRack bicycleRack = new BicycleRack();
        BicycleRack bicycleRack2 = new BicycleRack();

        BicycleComponent bicycleComponent = DaggerBicycleComponent.builder()
                .build();

        bicycleComponent.inject(bicycleRack);
        bicycleComponent.inject(bicycleRack2);
        System.out.println(bicycleRack.bicycle);
        System.out.println(bicycleRack2.bicycle);
    }

    public static void main(String[] args) {
        carSimple();
        System.out.println("---------------");
        carWithoutDagger();
        System.out.println("---------------");
        carWithDagger();
        System.out.println("---------------");
        bicycleWithDagger();
    }
}
