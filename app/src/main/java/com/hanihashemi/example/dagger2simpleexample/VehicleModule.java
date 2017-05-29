package com.hanihashemi.example.dagger2simpleexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hani on 5/29/17.
 */
@Module
class VehicleModule {

  @Provides
  @Singleton
  Motor provideMotor() {
    return new Motor();
  }

  @Provides
  @Singleton
  Vehicle provideVehicle() {
    return new Vehicle(new Motor());
  }
}