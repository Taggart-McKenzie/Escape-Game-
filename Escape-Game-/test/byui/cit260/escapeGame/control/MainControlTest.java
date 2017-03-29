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
public class MainControlTest {

    public MainControlTest() {
    }

    /**
     * Test of saveGame method, of class MainControl.
     */
    @Test
    public void testSaveGame() {
        System.out.println("saveGame");
        String name = "";
        MainControl instance = new MainControl();
        String expResult = "player + location + item + clue + healthOfPlayer";
        String result = instance.saveGame(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of newGame method, of class MainControl.
     */
    @Test
    public void testNewGame() {
        System.out.println("newGame");
        String name = "";
        MainControl instance = new MainControl();
        String expResult = "";
        String result = instance.newGame(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of loadSavedGame method, of class MainControl.
     */
    @Test
    public void testLoadSavedGame() {
        System.out.println("loadSavedGame");
        String name = "";
        MainControl instance = new MainControl();
        String expResult = "player + location + item + clue + healthOfPlayer";
        String result = instance.loadSavedGame(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of help method, of class MainControl.
     */
    @Test
    public void testHelp() {
        System.out.println("help");
        String helpControl = "";
        MainControl instance = new MainControl();
        String expResult = "";
        String result = instance.help(helpControl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of quit method, of class MainControl.
     */
    @Test
    public void testQuit() {
        System.out.println("quit");
        boolean answer = false;
        MainControl instance = new MainControl();
        boolean expResult = false;
        boolean result = instance.quit(answer);
        assertEquals(expResult, result);

    }

}
