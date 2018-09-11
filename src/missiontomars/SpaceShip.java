package missiontomars;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiri21
 */
public interface SpaceShip {
    public boolean launch();
    public boolean land();
    public boolean canCarry(Item item);
    public void carry(Item item);
}
