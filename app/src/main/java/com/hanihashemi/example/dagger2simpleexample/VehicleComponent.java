package com.hanihashemi.example.dagger2simpleexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hani on 5/29/17.
 */
@Singleton
@Component(modules = {MyModule.class})
interface VehicleComponent {
  Vehicle provideVehicle();

  void inject(MainActivity main);
}