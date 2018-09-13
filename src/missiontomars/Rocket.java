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
public abstract class Rocket implements SpaceShip {
//     public abstract double getCost();
//     public abstract double getWeight();

    public abstract double getMaxCargo();
    public abstract double getCost();

    private final ArrayList<Item> cargo = new ArrayList<Item>();

    @Override
    public void carry(Item item) {
        if (!canCarry(item)) throw new RuntimeException("Item too big to carry");
        cargo.add(item);
    }

    public ArrayList<Item> getCargo() {
        return cargo;
    }

    @Override
    public boolean canCarry(Item item) {
        if (this.getCurrentCargoSize()+item.getWeight() <= this.getMaxCargo()) {
            return true;
        } else {
            return false;
        }
    }

    protected double getCurrentCargoSize() {
        double result = 0;
        for (Item item : cargo) {
            result += item.getWeight();
        }
 
                
        return result;
    }

}
