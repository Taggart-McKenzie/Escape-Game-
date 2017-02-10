/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mckenzietaggart
 */
public class StartControlTest {
    
    public StartControlTest() {
    }

    /**
     * Test of openGame method, of class StartControl.
     */
    @Test
    public void testOpenGame() {
        System.out.println("openGame");
        String mainControl = "";
        StartControl instance = new StartControl();
        String expResult = "";
        String result = instance.openGame(mainControl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
