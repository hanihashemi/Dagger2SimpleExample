package com.hanihashemi.example.dagger2simpleexample;

import javax.inject.Inject;

/**
 * Created by hani on 5/29/17.
 */
class Vehicle {
  private Motor motor;

  @Inject
  Vehicle(Motor motor) {
    this.motor = motor;
  }

  void increaseSpeed(int value) {
    motor.accelerate(value);
  }

  void decreaseSpeed(int value) {
    motor.decelerate(value);
  }

  void stop() {
    motor.brake();
  }

  int getSpeed() {
    return motor.getRpm();
  }
}