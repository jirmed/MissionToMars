/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jiri21
 */
public class ItemTest {
    
    public ItemTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testConstructor() {
        final int WEIGHT = 1000;
        final String NAME = "Test item";
        Item item = new Item(NAME, WEIGHT);
        assertThat("Should create item", item, is(notNullValue()));
        assertThat(item.getName(),is(NAME));
        
    }
    
}
