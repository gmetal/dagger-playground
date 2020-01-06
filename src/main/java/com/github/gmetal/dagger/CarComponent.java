package com.github.gmetal.dagger;

import dagger.Component;


@Component(modules = CarModule.class)
public interface CarComponent {
    void inject(Car car);
}
