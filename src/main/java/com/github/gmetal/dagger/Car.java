package com.github.gmetal.dagger;

import javax.inject.Inject;

public class Car {
    @Inject
    Wheels wheels;
    @Inject
    Engine engine;

    public Car() {
    }

    @Override
    public String toString() {
        return "[Car with wheels: " + wheels + ", and engine: " + engine + "]";
    }
}

class Wheels {
    Tires tires;

    @Inject
    public Wheels(Tires t) {
        tires = t;
    }

    @Override
    public String toString() {
        return "[Wheels with tires: " + tires + "]";
    }
}


class Engine {
}

class Tires {
}
