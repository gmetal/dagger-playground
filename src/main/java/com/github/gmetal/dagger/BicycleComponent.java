package com.github.gmetal.dagger;

import dagger.Component;

@Component
public interface BicycleComponent {

    void inject(BicycleRack main);

    @Component.Builder
    interface Builder {

        BicycleComponent build();
    }
}
