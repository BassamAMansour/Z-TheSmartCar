package com.csed2020.z_thesmartcar.controllers;

/**
 * Created by Mario on 10/15/2017.
 */

public interface ManualDrivingController {
    void moveForward(float powerPercentage);

    void moveBackward(float powerPercentage);
    void steerRight();
    void steerLeft();
}
