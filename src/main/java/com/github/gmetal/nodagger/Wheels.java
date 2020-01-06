package com.github.gmetal.nodagger;

public class Wheels {
    Tires tires;

    public Wheels(Tires t) {
        tires = t;
    }

    @Override
    public String toString() {
        return "[Wheels with tires: " + tires + "]";
    }
}
