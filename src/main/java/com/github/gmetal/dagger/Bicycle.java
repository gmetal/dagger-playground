package com.github.gmetal.dagger;


import javax.inject.Inject;

public class Bicycle {
    private Wheels wheels;

    @Inject
    public Bicycle(final Wheels w) {
        this.wheels = w;
    }

    @Override
    public String toString() {
        return "[Bicycle with wheels: " + wheels + "]";
    }
}
