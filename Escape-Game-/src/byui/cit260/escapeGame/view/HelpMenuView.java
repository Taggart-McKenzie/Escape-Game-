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
public class HelpMenuView {

    private String helpMenu;
    
    //default constructor
    public HelpMenuView() {
          this.helpMenu = "\n"
                     +"\n------------------------------------"
                     +"\n| Help Menu                        |"
                     +"\n------------------------------------"
                     +"\nC - Clue"
                     +"\nR - Rules"
                     +"\nM - Movement"
                     +"\nL - Look Around"
                     +"\nU - Useful Items"
                     +"\nQ - Quit"
                     +"\n------------------------------------";
    }
        
    
    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();//convert choice to upper case 
        
        switch(choice){
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
            case "U": //Usefule Items
                this.getItems();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
public void displayHelpMenuView() {
    boolean done = false; //set flag to not done
    do {
        //prompt for and get players name
        String helpOption = this.getHelpOption();
        if(helpOption.toUpperCase().equals("Q"))//use want to quit 
        return; //exit the game
        
        //do the requested action and display the next view
        done = this.doAction(helpOption);
        
    }while (!done);
}

    
private String getHelpOption() {
    
    Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {//loop while an invalid value is enter
            System.out.println("\n" + this.helpMenu);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1){ //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; //return the value entered
}
    
private void getRules() {
    System.out.println("*** getRules function called ***");
}

private void getClue() {
    System.out.println("*** getClue function called ***");
}

private void showMovement() {
   System.out.println("*** showMovement function called ***");
}

private void lookAround() {
    System.out.println("*** lookAround function called ***");
}

private void getItems() {
    System.out.println("*** getItems function called ***");
}
}



