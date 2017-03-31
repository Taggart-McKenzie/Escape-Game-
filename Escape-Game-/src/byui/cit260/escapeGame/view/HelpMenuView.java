/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

import java.awt.Graphics;
import java.awt.Shape;
import java.util.Scanner;


/**
 *
 * @author Brown and Groesbeck
 */
public class HelpMenuView extends View {

    //default constructor
    public HelpMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Help Menu                        |"
                + "\n------------------------------------"
                + "\nC - Clue"
                + "\nR - Rules"
                + "\nM - Movement"
                + "\nL - Look Around"
                + "\nU - Useful Items"
                + "\nQ - Quit"
                + "\n------------------------------------");
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();//convert choice to upper case 

        switch (choice) {
            case "C": //clue
                this.getClue();
                break;
            case "R": //Rules
                this.getRules();
                break;
            case "M": //Movement
                this.showMovement();
                break;
            case "L": //Look Around
                this.lookAround();
                break;
            case "U": //Useful Items
                this.getItems();
                break;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void getRules() {
       this.console.println("*** getRules function called ***");
    }

    private void getClue() {
        this.console.println("*** getClue function called ***");
    }

    private void showMovement() {
        this.console.println("*** showMovement function called ***");
    }

    private void lookAround() {
        this.console.println("*** lookAround function called ***");
    }

    private void getItems() {
        this.console.println("*** getItems function called ***");
    }

    
    }

    
