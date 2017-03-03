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
public class GameMenuView {
    
    void displayMenu() {
        System.out.println("\n***displayMenu stub function called ***");
    }
    
    private String gameMenu;
    
    //default constructor
    public GameMenuView() {
        this.gameMenu = "\n"
                +"\n-----------------------------------"
                +"\n| Game Menu                       |"
                +"\n-----------------------------------"
                +"\nG - Go Back"
                +"\nM - View Map"
                +"\nI - View Items"
                +"\nH - View Health"
                +"\nQ - Quit"
                +"\n-----------------------------------";
                }
    
   public void displayGameMenuView(){
   boolean done = false; //set flag to not done
   do {
       //prompt for and get players name
       String menuOption = this.getGameOption();
       if(menuOption.toUpperCase().equals("Q"))//user wants to quit 
           return; // exit the game

        //do the requested action and display the next view
        done = this.doAction(menuOption);

    } while (!done);

}

    private String getGameOption() {
   
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {//loop while an invalid value is enter
            System.out.println("\n" + this.gameMenu);
            
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

    private boolean doAction(String choice) {
           
    choice = choice.toUpperCase();//convert choice to upper case
    
    switch(choice) {
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

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
