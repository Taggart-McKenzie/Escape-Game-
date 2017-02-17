/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

/**
 *
 * @author mckenzietaggart
 */
public class MainMenuView {
   private String menu;
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
    
   System.out.println("\n*** doAction() function called***)");
   return "";
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

