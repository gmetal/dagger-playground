package com.github.gmetal.dagger;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = CarModule.class)
public interface CarComponent {
    void inject(Car car);
}
