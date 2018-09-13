/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author jiri21
 */
public class MissionToMars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException {
        Simulation simulation = new Simulation(U1.class);
        File file = new File("data/phase-1.txt");
        Scanner scanner = new Scanner(file);
        simulation.load(new CargoDAO(scanner).loadCargo());
        System.out.println(simulation.getRockets().size());
        System.out.println(simulation.runSimulation());
    }
    
}
