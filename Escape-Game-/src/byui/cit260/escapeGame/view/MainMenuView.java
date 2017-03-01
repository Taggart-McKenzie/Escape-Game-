/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

import java.util.Scanner;

/**
 *
 * @author samantha
 */
public class MainMenuView {

    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                + "\n------------------------------------------------------"
                + "\n| Welcome to the Main Menu Choose from the following  |"
                + "\n -----------------------------------------------------"
                + "\nS - Save"
                + "\nB - Begin New Game"
                + "\nL - Load Saved Game"
                + "\nH - Help"
                + "\nQ - Quit"
                + "\n -----------------------------------------------------";
    }

    public void displayMainMenuView() {

        boolean done = false;// set flag to not done 
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {// user want to quit 
                return; // exit the game
            }

            //do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);

    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;

            }
            break; // end the loop
        }

        return value; // return the value entered
    }

    private boolean doAction(String menuOption) {

        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "S":
                this.saveGame();
                break;
            case "B":
                this.beginNewGame();
                break;
            case "L":
                this.loadSavedGame();
                break;
            case "H":
                this.help();
                break;
            case "Q":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalit selection Please Try Again.***");
                break;
        }
        return false;
    }

    private void saveGame() {
        System.out.println("*** startSaveGame funtion called***");
    }

    private void beginNewGame() {
        System.out.println("*** startBeginNewGame function called***");
    }

    private void loadSavedGame() {
        System.out.println("*** startLoadSavedGame function called*** ");
    }

    private void help() {
        System.out.println("*** startHelp function called***");
    }

    private void quit() {
        System.out.println("*** startQuit function called***");
    }
}
