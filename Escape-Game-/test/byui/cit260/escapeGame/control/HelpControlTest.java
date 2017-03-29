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
public class HelpControlTest {

    public HelpControlTest() {
    }

    /**
     * Test of clue method, of class HelpControl.
     */
    @Test
    public void testClue() {
        System.out.println("clue");
        String clue = "";
        HelpControl instance = new HelpControl();
        String expResult = "";
        String result = instance.clue(clue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of rules method, of class HelpControl.
     */
    @Test
    public void testRules() {
        System.out.println("rules");
        String rules = "";
        HelpControl instance = new HelpControl();
        String expResult = "";
        String result = instance.rules(rules);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of movement method, of class HelpControl.
     */
    @Test
    public void testMovement() {
        System.out.println("movement");
        int actionControl = 0;
        HelpControl instance = new HelpControl();
        int expResult = 0;
        int result = instance.movement(actionControl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of lookAround method, of class HelpControl.
     */
    @Test
    public void testLookAround() {
        System.out.println("lookAround");
        String map = "";
        HelpControl instance = new HelpControl();
        String expResult = "";
        String result = instance.lookAround(map);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of usefulItems method, of class HelpControl.
     */
    @Test
    public void testUsefulItems() {
        System.out.println("usefulItems");
        String item = "";
        HelpControl instance = new HelpControl();
        String expResult = "";
        String result = instance.usefulItems(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of quit method, of class HelpControl.
     */
    @Test
    public void testQuit() {
        System.out.println("quit");
        boolean answer = false;
        HelpControl instance = new HelpControl();
        boolean expResult = false;
        boolean result = instance.quit(answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
