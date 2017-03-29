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
public class GameControlTest {

    public GameControlTest() {
    }

    /**
     * Test of goBack method, of class GameControl.
     */
    @Test
    public void testGoBack() {
        System.out.println("goBack");
        int location = 0;
        GameControl instance = new GameControl();
        int expResult = 0;
        int result = instance.goBack(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of viewMap method, of class GameControl.
     */
    @Test
    public void testViewMap() {
        System.out.println("viewMap");
        String map = "";
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.viewMap(map);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of viewItem method, of class GameControl.
     */
    @Test
    public void testViewItem() {
        System.out.println("viewItem");
        String item = "";
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.viewItem(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of viewHealth method, of class GameControl.
     */
    @Test
    public void testViewHealth() {
        System.out.println("viewHealth");
        int player = 0;
        GameControl instance = new GameControl();
        int expResult = 0;
        int result = instance.viewHealth(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of quit method, of class GameControl.
     */
    @Test
    public void testQuit() {
        System.out.println("quit");
        boolean answer = false;
        GameControl instance = new GameControl();
        boolean expResult = false;
        boolean result = instance.quit(answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
