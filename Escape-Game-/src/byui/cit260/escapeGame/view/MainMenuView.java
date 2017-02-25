/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

import byui.cit260.escapeGame.model.Player;
import escape.game.EscapeGame;
import java.util.Scanner;

/**
 *
 * @author mckenzietaggart
 */
public class MainMenuView {

   private String menu;
   
    //default constructor
    public MainMenuView() {
          this.menu = "\n"
                     +"\n------------------------------------"
                     +"\n| Main Menu                        |"
                     +"\n------------------------------------"
                     +"\nS - Save"
                     +"\nB - Begin New Game"
                     +"\nL - Load Saved Game"
                     +"\nE - End Game"
                     +"\nH - Help"
                     +"\nQ - Quit"
                     +"\n------------------------------------";
   }  
   
   public void displayMainMenuView() {
       
   boolean done = false; //set flag to not done
   do {
       //prompt for and get players name
       String menuOption = this.getMenuOption();
       if(menuOption.toUpperCase().equals("Q"))//user wants to quit 
           return; // exit the game

        //do the requested action and display the next view
        done = this.doAction(menuOption);

    } while (!done);

}

private String getMenuOption() {
   
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {//loop while an invalid value is enter
            System.out.println("\n" + this.menu);
            
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
        case "S": //save
            this.saveGame();
            break;
        case "B": //begin new game
            this.newGame();
            break;
        case "L"://load saved game
            this.loadSavedGame();
            break;
        case "H"://Help
            this.help();
            break;
        case "E"://End Game
            this.gameEndContol();
            break;
        default:
            System.out.println("\n*** Invalid Selection *** Try Again");
            break;
    }
    return false;
}
private void saveGame(){
    System.out.println("*** saveGame function called***");
}

private void newGame() {
    //create a new game
    int value = GameControl.createNewGame(EscapeGame.getPlayer());
    if (value < 0) {
        System.out.println("ERROR - Failed to create new game");
    }
    //display the game menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();
    
}

private void loadSavedGame() {
    System.out.println("*** loadSavedGame function called ***");
}

private void gameEndControl() {
    System.out.println("***end function called ***");
}

private void help() {       
    System.out.println("*** help function called ***");
    }

    private static class GameControl {

        private static void createNewGame(Player player) {
 
            
}

        public GameControl() {
        }
    }

}


