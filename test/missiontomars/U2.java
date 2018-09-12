/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

import java.util.Random;

/**
 *
 * @author jirka
 */
public class U2 extends Rocket {

    private static final double MAX_CARGO = 11000;
    private static final double COST = 120000000;
    private static final double LAUNCH_CRASH_PROBABILITY = 0.04;
    private static final double LAND_CRASH_PROBABILITY = 0.08;
    private final Random random = new Random();

    @Override
    public double getCost() {
        return COST;
    }

    @Override
    public double getMaxCargo() {
        return MAX_CARGO;
    }

    @Override
    public boolean land() {
        return (LAND_CRASH_PROBABILITY * this.getCurrentCargoSize() / this.getMaxCargo() > random.nextDouble());
    }

    @Override
    public boolean launch() {
        return (LAND_CRASH_PROBABILITY * this.getCurrentCargoSize() / this.getMaxCargo() > random.nextDouble());
    }

}
