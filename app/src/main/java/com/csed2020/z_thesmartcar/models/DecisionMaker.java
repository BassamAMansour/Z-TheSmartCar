package com.csed2020.z_thesmartcar.models;

import com.csed2020.z_thesmartcar.models.bluetooth.Observer;

/**
 * Created by Mario on 10/15/2017.
 */

public abstract class DecisionMaker implements Observer {
    private Machine machine;

    public abstract void makeDecision();
}
