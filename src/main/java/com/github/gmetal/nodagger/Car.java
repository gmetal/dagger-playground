package com.github.gmetal.nodagger;


public class Car {
    Wheels wheels;
    Engine engine;

    public Car(Wheels w, Engine e) {
        wheels = w;
        engine = e;
    }


    @Override
    public String toString() {
        return "[Car with wheels: " + wheels + ", and engine: " + engine + "]";
    }
}


