package com.csed2020.z_thesmartcar.controllers;

/**
 * Created by Mario on 10/15/2017.
 */

public interface ManualDrivingController {
    void moveForward();
    void moveBackward();
    void steerRight();
    void steerLeft();
    void setPower(float powerLevel);
}
