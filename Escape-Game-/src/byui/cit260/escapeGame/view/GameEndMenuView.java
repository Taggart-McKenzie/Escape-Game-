/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

import java.util.Scanner;

/**
 *
 * @author mckenzietaggart
 */
public class GameEndMenuView {

    private String endMenu;

    //default constructor
    public GameEndMenuView() {
        this.endMenu = "\n"
                + "\n------------------------------------"
                + "\n| Game End Menu                    |"
                + "\n------------------------------------"
                + "\nW - Win Game"
                + "\nL - Lose Game"
                + "\nQ - Quit"
                + "\n------------------------------------";
    }

    public void displayGameEndMenuView() {

        boolean done = false;//set flag to not done
        do {
            //prompt for and get menu option
            String endMenuOption = this.getEndMenuOption();
            if (endMenuOption.toUpperCase().equals("Q"))//user wants to quit
            {
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(endMenuOption);

        } while (!done);
    }

    private String getEndMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) {//loop while an invalid value is entered
            System.out.println("\n" + this.endMenu);

            value = keyboard.nextLine(); //get next lin typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value; value cannot be blank");
                continue;
            }

            break; //end the loop
        }

        return value; //return the value entered
    }

    private boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "W": //Win Game
                this.winGame();
                break;
            case "L": //Lose Game
                this.loseGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void winGame() {
        System.out.println("*** winGame function called ***");
        //display the game end menu
        GameEndMenuView endMenu = new GameEndMenuView();
        endMenu.displayGameEndMenuView();
    }

    private void loseGame() {
        System.out.println("*** loseGame funciton called ***");
        GameEndMenuView endMenu = new GameEndMenuView();
        endMenu.displayGameEndMenuView();
    }

}
