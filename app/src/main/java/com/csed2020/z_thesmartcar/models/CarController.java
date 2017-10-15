package com.csed2020.z_thesmartcar.models;

/**
 * Created by Mario on 10/15/2017.
 */


/**
 * Container of car states.
 */
public class CarController implements Machine {
    private DecisionMaker decisionMaker;

    private CarController(DecisionMaker decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public static CarController build(int type) {
        //Manual or automatic decision maker?
        return null;
    }

    @Override
    public void setState(int state) {

    }

    @Override
    public void setState(int state, String message) {

    }


}
