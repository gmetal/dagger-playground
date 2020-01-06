package com.github.gmetal.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    public Tires providesTires() {
        return new Tires();
    }

    @Provides
    public Engine providesEngine() {
        return new Engine();
    }

    @Provides
    public Wheels providesWheels(Tires tires) {
        return new Wheels(tires);
    }
}