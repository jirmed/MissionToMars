/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

import java.util.ArrayList;

/**
 *
 * @author jiri21
 */
public class Simulation {
   private final Class rocket;
   private ArrayList<Rocket> rockets;
   private double totalCost;

    public Simulation(Class rocket) {
        this.totalCost = 0;
        this.rockets = new ArrayList<>();
        this.rocket = rocket;
    }
    
}
