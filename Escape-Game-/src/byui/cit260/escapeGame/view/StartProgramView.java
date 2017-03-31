/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

import byui.cit260.escapeGame.control.GameControl;
import byui.cit260.escapeGame.model.Player;
import escape.game.EscapeGame;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brown and Groesbeck
 */
public class StartProgramView {
    
    protected final BufferedReader keyboard = EscapeGame.getInFile();

    private String promptMessage;

    public StartProgramView() {
        //promptMessage: "Please enter your name:"
        this.promptMessage = "\nPlease enter your name: ";
        //display banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {

        System.out.println(
                "\n********************************************************************"
                + "\n*                                                                  *"
                + "\n* Welcome to Escape from Chateau do la Miserie!                    *"
                + "\n*                                                                  *"
                + "\n* In 1825, you were sent to the Chateau de la Misererie (Prison).  *"
                + "\n* The warden knows you are innocent, but he is paid well to keep   *"
                + "\n* his prisoners regardless of guilt or innocence. You will likely  *"
                + "\n* die here unless you find a way to escape.                        *"
                + "\n*                                                                  *"
                + "\n* Your prison cell is small with a window high in the wall and a   *"
                + "\n* small opening at the base of the door where guards deposit food. *"
                + "\n* You must figure out a way to escape using whatever characters and*"
                + "\n* items you can find. If you are caught by the warden, you will be *"
                + "\n* sent back to your cell. You have ten lives before you die and the*"
                + "\n* game restarts. If you get outside the walls of prison, you win!  *"
                + "\n*                                                                  *"
                + "\n* Good Luck!                                                       *"
                + "\n*                                                                  *"
                + "\n********************************************************************"
        );
    }

    public void displayStartProgramView() {

        boolean done = false;
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
            {
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);
    }

    private String getPlayersName() {

        
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) {//loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            try {
                value = keyboard.readLine(); //get next line typed on keyboard
            } catch (IOException ex) {
                
            }
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }

            break; //end the loop
        }

        return value; //return the value entered
    }

    private boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name; "
                    + "The name must be greater than one character in length");
            return false;
        }

        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }

        //display next view
        this.displayNextView(player);

        return true; //success!
    }

    private void displayNextView(Player player) {

        //display a custom welcome message
        System.out.println("\n========================================="
                + "\n Welcome to the game " + player.getName()
                + "\n We hope you have a lot of fun!"
                + "\n=========================================="
        );

        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        //Display the main menu view
        mainMenuView.display();
    }
}
