/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

import java.text.ParseException;
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

    public ArrayList<Item> loadCargo() throws InvalidInputException {
        ArrayList<Item> result = new ArrayList<>();
        int lineIndex = 0;
        while (input.hasNext()) {
            lineIndex++;
            String[] line = input.nextLine().split("=");
            if (line.length != 2) {
                throw new InvalidInputException(lineIndex, "Line must have exactly two parameters");
            }

            String name = line[0];
            try {
                int weight = Integer.parseInt(line[1]);
            } catch (NumberFormatException e) {
                throw new InvalidInputException(lineIndex, "Weight must be an integer", e);
            }

            Item item = new Item(line[0], Integer.parseInt(line[1]));
            result.add(item);
        }
        return result;
    }

}
