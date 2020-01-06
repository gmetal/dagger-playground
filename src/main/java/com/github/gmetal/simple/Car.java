package com.github.gmetal.simple;

public class Car {
    Wheels wheels;
    Engine engine;

    public Car() {
        wheels = new Wheels();
        engine = new Engine();
    }

    @Override
    public String toString() {
        return "Using wheels: " + wheels + ", and engine: " + engine;
    }
}

class Wheels {
    Tires tires;

    public Wheels() {
        tires = new Tires();
    }

    @Override
    public String toString() {
        return "[Wheels with tires: " + tires + "]";
    }
}

class Tires {
}


class Engine {
}


