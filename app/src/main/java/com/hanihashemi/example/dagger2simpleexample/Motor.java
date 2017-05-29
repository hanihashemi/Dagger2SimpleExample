package com.hanihashemi.example.dagger2simpleexample;

/**
 * Created by hani on 5/29/17.
 */
class Motor {
  private int rpm;

  Motor() {
    this.rpm = 0;
  }

  int getRpm() {
    return rpm;
  }

  void accelerate(int value) {
    rpm += value;
  }

  void decelerate(int value) {
    rpm -= value;
  }

  void brake() {
    rpm = 0;
  }
}