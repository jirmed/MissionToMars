/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jirka
 */
public class CargoDAOTest {
    
    public CargoDAOTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of loadCargo method, of class CargoDAO.
     */
    @Test
    public void testLoadCargo() throws FileNotFoundException {
        System.out.println("loadCargo");
        File file = new File("test/data/testdata.txt");
        CargoDAO cargoDAO = new CargoDAO(new Scanner(file));
        ArrayList<Item> result = cargoDAO.loadCargo();
        assertThat("Should not be empty",result, is(notNullValue()));
        assertThat("Should have 15 items",result.size(), is(15));
        assertThat("First item weight",result.get(0).getWeight(),is(2000));
        assertThat("First item weight",result.get(0).getName(),is("building tools"));
    }
    
}
