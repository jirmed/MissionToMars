/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

import java.util.Random;
import missiontomars.Rocket;

/**
 *
 * @author jirka
 */
public class U1 extends Rocket {
    private static final double MAX_CARGO = 8000;
    private static final double COST = 100000000;
    private static final double LAUNCH_CRASH_PROBABILITY = 0.05;
    private static final double LAND_CRASH_PROBABILITY = 0.01;
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
        return (LAND_CRASH_PROBABILITY*this.getCurrentCargoSize()/this.getMaxCargo() > random.nextDouble());
    }

    @Override
    public boolean launch() {
        return (LAND_CRASH_PROBABILITY*this.getCurrentCargoSize()/this.getMaxCargo() > random.nextDouble());
    }
    
}
