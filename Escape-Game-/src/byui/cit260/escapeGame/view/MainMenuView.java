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
public class MainMenuView {
   private String menu;
   private String promptMessage;
   public void displayMainMenuView() {
   boolean done = false;
   do{
       String menuOption = this.getMenuOption();
       if(menuOption.toUpperCase().equals("Q"))// user want to save 
           return; // exit the game

           //do the requested action and display the next view
       done = this.doAction(menuOption);

}while (!done);

}

private String getMenuOption() {
    
   Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {//loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1){ //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
} return value;
}
private boolean doAction(String menuOption) {
    System.out.println("\n*** doAction() function called ***)");
    return true;
}
   
    public MainMenuView() {
           this.menu = "\n"
                     +"\n------------------------------------"
                     +"\n| Main Menue                        |"
                     +"\n------------------------------------"
                     +"\nS - Save"
                     +"\nB - Begin New Game"
                     +"\nL - Load Saved Game"
                     +"\nH - Help"
                     +"\nQ - Quit"
                     +"\n------------------------------------";
     
   
   
        
        }
        
    
}
