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
public class GameEndControlTest {
    
    public GameEndControlTest() {
    }

    /**
     * Test of winGame method, of class GameEndControl.
     */
    @Test
    public void testWinGame() {
        System.out.println("winGame");
        int health = 5;
        int location = 25;
        int player = 1;
        GameEndControl instance = new GameEndControl();
        String expResult = "YOU WIN";
        String result = instance.winGame(health, location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of loseGame method, of class GameEndControl.
     */
    @Test
    public void testLoseGame() {
        System.out.println("loseGame");
        int health = 0;
        int location = 1;
        int player = 4;
        GameEndControl instance = new GameEndControl();
        String expResult = "YOU LOSE";
        String result = instance.loseGame(health, location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
