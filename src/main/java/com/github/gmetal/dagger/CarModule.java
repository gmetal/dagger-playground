package com.github.gmetal.dagger;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;


@Module
public class CarModule {

    @Singleton
    @Provides
    public Tires providesTires() {
        return new Tires();
    }

    @Singleton
    @Provides
    public Engine providesEngine() {
        return new Engine();
    }

    @Provides
    public Wheels providesWheels(Tires tires) {
        return new Wheels(tires);
    }
}