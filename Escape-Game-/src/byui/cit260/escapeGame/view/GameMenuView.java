/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

import byui.cit260.escapeGame.control.ActionControl;
import byui.cit260.escapeGame.model.Location;
import escape.game.EscapeGame;

//TODO ADD MOVEMENT OPTIONS AND MAKE MOVEMENT WORK

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
                + "\nM - View Map"
                + "\nI - View Items"
                + "\nH - View Health"
                + "\nQ - Quit"
                + "\n-----------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();//convert choice to upper case

        switch (choice) {
            case "M": //view map
                this.viewMap();
                break;
            case "I"://view item
                this.viewItem();
                break;
            case "V"://view health of player
                this.viewHealth();
                break;
            case "U":
                ActionControl ac = new ActionControl();
                if(ac.moveUp()) {
                    System.out.println("You moved up!");
                } else {
                    System.out.println("You cannot move up right now");
                }
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void viewMap() {
        
        //TODO iterate over the map and display locations
        
        Location playerLocation = EscapeGame.getPlayer().getLocation();
        System.out.println("You are at location (" + playerLocation.getRow() + ", " + playerLocation.getColumn() + ")");
        System.out.println(playerLocation.getDescription());
    }

    private void viewItem() {
        System.out.println("*** viewItem function called");
    }

    private void viewHealth() {
        System.out.println("*** viewHealth funciton called");
    }
}
