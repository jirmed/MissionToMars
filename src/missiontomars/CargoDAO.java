/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author jirka
 */
public class CargoDAO {
    private final Scanner input;

    public CargoDAO(Scanner input) {
        this.input = input;
    }
    
    public ArrayList<Item> loadCargo() {
        ArrayList<Item> result = new ArrayList<Item>();
        while (input.hasNext()){
            String[] line = input.nextLine().split("=");
            Item item = new Item(line[0], Integer.parseInt(line[1]));
            result.add(item);
                    }
        return result;
    }
    
}
