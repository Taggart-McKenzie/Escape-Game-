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
public class ActionControlTest {
    
    public ActionControlTest() {
    }

    /**
     * Test of moveUp method, of class ActionControl.
     */
    @Test
    public void testMoveUp() {
        System.out.println("moveUp");
        int location = 0;
        ActionControl instance = new ActionControl();
        int expResult = 0;
        int result = instance.moveUp(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveDown method, of class ActionControl.
     */
    @Test
    public void testMoveDown() {
        System.out.println("moveDown");
        int location = 0;
        ActionControl instance = new ActionControl();
        int expResult = 0;
        int result = instance.moveDown(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveLeft method, of class ActionControl.
     */
    @Test
    public void testMoveLeft() {
        System.out.println("moveLeft");
        int location = 0;
        ActionControl instance = new ActionControl();
        int expResult = 0;
        int result = instance.moveLeft(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveRight method, of class ActionControl.
     */
    @Test
    public void testMoveRight() {
        System.out.println("moveRight");
        int location = 0;
        ActionControl instance = new ActionControl();
        int expResult = 0;
        int result = instance.moveRight(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of goBack method, of class ActionControl.
     */
    @Test
    public void testGoBack() {
        System.out.println("goBack");
        int location = 0;
        ActionControl instance = new ActionControl();
        int expResult = 0;
        int result = instance.goBack(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickUpItem method, of class ActionControl.
     */
    @Test
    public void testPickUpItem() {
        System.out.println("pickUpItem");
        double problem = 0.0;
        int item = 0;
        ActionControl instance = new ActionControl();
        double expResult = 0.0;
        double result = instance.pickUpItem(problem, item);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useItem method, of class ActionControl.
     */
    @Test
    public void testUseItem() {
        System.out.println("useItem");
        int Item = 0;
        ActionControl instance = new ActionControl();
        String expResult = "";
        String result = instance.useItem(Item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solveTriangle method, of class ActionControl.
     */
    @Test
    public void testSolveTriangle() {
        System.out.println("solveTriangle");
        double base = 0.0;
        double height = 0.0;
        ActionControl instance = new ActionControl();
        double expResult = 0.0;
        double result = instance.solveTriangle(base, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solveForX method, of class ActionControl.
     */
    @Test
    public void testSolveForX() {
        System.out.println("solveForX");
        double x = 0.0;
        double y = 0.0;
        double z = 0.0;
        ActionControl instance = new ActionControl();
        double expResult = 0.0;
        double result = instance.solveForX(x, y, z);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quit method, of class ActionControl.
     */
    @Test
    public void testQuit() {
        System.out.println("quit");
        boolean answer = false;
        ActionControl instance = new ActionControl();
        boolean expResult = false;
        boolean result = instance.quit(answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}