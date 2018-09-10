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
public class RocketTest {

    private Rocket rocket;
    
    public RocketTest() {
    }
    
    @Before
    public void setUp() {
        rocket = new Rocket() {
            @Override
            public boolean launch() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public double getMaxCargo() {
                return 1000;
            }
        };
    }

    @Test
    public void testCarryOneSmallItemShouldSuccess() {
        Item item = new Item ("Test item", 1);
        rocket.carry(item);
        ArrayList<Item> resultCargo = rocket.getCargo();
        int resultItemCount = resultCargo.size();
        assertThat("Item inserted",resultItemCount,is(1));
    }

    @Test
    public void testCarryTwoHugeItemsShouldFail() {
        Item item1 = new Item ("Test item1", 600);
        Item item2 = new Item ("Test item2", 600);
        try {
            rocket.carry(item1);
            rocket.carry(item2);
            fail("Adding second item should fail");
        } catch (Exception e) {
            assertThat(e.getMessage(),is("Item too big to carry"));
        }
    }
    
    
    @Test
    public void testCanCarryOneSmallItem() {
        Item item = new Item ("Test item", 1);
        boolean result = rocket.canCarry(item);
        assertThat("Item shoud fit",result,is(true));
    }

    @Test
    public void testCanCarryOneHugeItem() {
        Item item = new Item ("Test item", 10000);
        boolean result = rocket.canCarry(item);
        assertThat("Item should not fit",result,is(false));
    }

    @Test
    public void testCanCarryTwoHugeItems() {
        Item item1 = new Item ("Test item 1", 600);
        Item item2 = new Item ("Test item 2", 700);
        this.rocket.carry(item1);
        boolean result = rocket.canCarry(item2); //second item should not fit
        assertThat("Items should not fit",result,is(false));
    }

    @Test
    public void testCanCarryTwoSmallItems() {
        Item item1 = new Item ("Test item 1", 1);
        Item item2 = new Item ("Test item 2", 2);
        this.rocket.carry(item1);
        boolean result = rocket.canCarry(item2); //second item should fit
        assertThat("Items should fit",result,is(true));
    }
    
}
