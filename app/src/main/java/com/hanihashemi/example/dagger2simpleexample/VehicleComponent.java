package com.hanihashemi.example.dagger2simpleexample;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by hani on 5/29/17.
 */
@Singleton
@Component(modules = {VehicleModule.class})
interface VehicleComponent {
  Vehicle provideVehicle();
}
