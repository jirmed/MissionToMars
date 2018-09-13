/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jiri21
 */
public class SimulationTest {
    
    public SimulationTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of load method, of class Simulation.
     * @throws java.lang.Exception
     */
    @Test
    public void testLoadOneItem() throws Exception {
        System.out.println("load");
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Test item 1",1000));
        Simulation simulation = new Simulation(U1.class);
        simulation.load(items);
        ArrayList<Rocket> rockets = simulation.getRockets();
        
        
        assertThat("One rocket should be created",rockets.size(), is(1));
        assertThat("Rocket should have one cargo",rockets.get(0).getCargo().size(), is(1));
    }

    @Test
    public void testLoadTwoItems() throws Exception {
        System.out.println("load");
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Test item 1",1000));
        items.add(new Item("Test item 2",2000));
        Simulation simulation = new Simulation(U1.class);
        simulation.load(items);
        ArrayList<Rocket> rockets = simulation.getRockets();
        
        
        assertThat("One rocket should be created",rockets.size(), is(1));
        assertThat("Rocket should have one cargo",rockets.get(0).getCargo().size(), is(2));
    }

    @Test
    public void testLoadThreeItems() throws Exception {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Test item 1",1000));
        items.add(new Item("Test item 2",2000));
        items.add(new Item("Test item 3",6000));
        Simulation simulation = new Simulation(U1.class);
        
        simulation.load(items);
        ArrayList<Rocket> rockets = simulation.getRockets();
        
        
        assertThat("Two rockets should be created",rockets.size(), is(2));
        assertThat("Rocket 1 should have two pieces of cargo",rockets.get(0).getCargo().size(), is(2));
        assertThat("Rocket 2 should have one piece of cargo",rockets.get(1).getCargo().size(), is(1));
    }
    
}
