package com.hanihashemi.example.dagger2simpleexample;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
    final Vehicle vehicle = component.provideVehicle();

    ((TextView) findViewById(R.id.result)).setText(String.format("Speed: %s", vehicle.getSpeed()));

    new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
        vehicle.increaseSpeed(60);
        ((TextView) findViewById(R.id.result)).setText(String.format("Speed: %s", vehicle.getSpeed()));
      }
    }, 2000);
  }
}