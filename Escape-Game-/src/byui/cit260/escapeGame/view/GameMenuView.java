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
public class GameMenuView extends View {

    //default constructor
    public GameMenuView() {
        super("\n"
                + "\n-----------------------------------"
                + "\n| Game Menu                       |"
                + "\n-----------------------------------"
                + "\nG - Go Back"
                + "\nM - View Map"
                + "\nI - View Items"
                + "\nH - View Health"
                + "\nQ - Quit"
                + "\n-----------------------------------");
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();//convert choice to upper case

        switch (choice) {
            case "G": //go back to previous location
                this.goBack();
                break;
            case "M": //view map
                this.viewMap();
                break;
            case "I"://view item
                this.viewItem();
                break;
            case "V"://view health of player
                this.viewHealth();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void goBack() {
        System.out.println("*** goBack function called ***");
    }

    private void viewMap() {
        System.out.println("*** viewMap function called");
    }

    private void viewItem() {
        System.out.println("*** viewItem function called");
    }

    private void viewHealth() {
        System.out.println("*** viewHealth funciton called");
    }
}
