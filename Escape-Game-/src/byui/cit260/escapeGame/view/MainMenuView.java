/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

/**
 *
 * @author samanthabrown
 */
public class MainMenuView {
    private String menu;
    
    public MainMenueView() {
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
public class MainMenuView
    
public void displayMainMenuView() {
    boolean done = false;
    do{
        String MenuOption = this.getMenuOption();
        if (menuOption.toUpperCase().equals("X"))// user want to save 
            return; // exit the game

            //do the requested action and display the next view
        done = this.doAction(menuOption);

}while (!done);

}

private String getMenuOption() {
    System.out.pringln("\n*** doAction() function called***)");
    return ""
}