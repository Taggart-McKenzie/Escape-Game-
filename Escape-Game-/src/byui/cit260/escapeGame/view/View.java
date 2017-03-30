/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

import escape.game.EscapeGame;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author mckenzietaggart
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferReader keyboard = EscapeGame.getInFile();
    protected final PrintWriter console = EscapeGame.getOutFile();

    public View() {

    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false;
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))//user wants to quit
            {
                return;//exit the view
            }
            //do the requested aciton and display the next view
            done = this.doAction(value);
        } while (!done);//exit the view when done == true
    }

    @Override
    public String getInput() {

        
        boolean valid = false;
        String value = null;

        //while a valid name has not been retrieved
        while (!valid) {

            //prompt for the player's name
            this.console.println("\n" + this.message);

            //get the value entered from the keyboard
            value = keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) {//blank value entered
                this.console.println("\n*** You must enter a value *** ");
                continue;
            }

            break;
        }

        return value; //return the name
    }
}