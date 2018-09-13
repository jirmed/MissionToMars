/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author jiri21
 */
public class Simulation {

    private final Class rocketClass;
    private final ArrayList<Rocket> rockets;

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public Simulation(Class rocketClass) {
        this.rockets = new ArrayList<>();
        this.rocketClass = rocketClass;
    }

    public void load(ArrayList<Item> items) throws InstantiationException, IllegalAccessException {
        Rocket rocket = (Rocket) rocketClass.newInstance();
        for (Item item : items) {
            if (!rocket.canCarry(item)) {
                rockets.add(rocket);
                rocket = (Rocket) rocketClass.newInstance();
            }
            rocket.carry(item);
        }
        rockets.add(rocket);
    }
    
    public double runSimulation() {
        double totalCost = 0;
        for (Rocket rocket : rockets) {
            do {                
                totalCost += rocket.getCost();
            } while (!(rocket.launch() && rocket.land()));
        }
        return totalCost;
    }
}
