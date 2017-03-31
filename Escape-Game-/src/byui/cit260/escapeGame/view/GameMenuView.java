/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

import byui.cit260.escapeGame.control.ActionControl;
import byui.cit260.escapeGame.exceptions.ActionControlException;
import byui.cit260.escapeGame.model.Item;
import byui.cit260.escapeGame.model.Location;
import byui.cit260.escapeGame.model.Map;
import escape.game.EscapeGame;
import java.util.List;

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
            case "P"://view health of player
                this.pickUpItem();
                break;
            case "U":
                ActionControl mu = new ActionControl();
                try {
                    mu.moveUp();
                    this.console.println("You moved up!");
                } catch (ActionControlException ace) {
                    this.console.println(ace.getMessage());
                }
                break;
            case "D":
                ActionControl md = new ActionControl();
                try {
                    md.moveDown();
                    this.console.println("You moved down!");
                } catch (ActionControlException ace) {
                    this.console.println(ace.getMessage());
                }
                break;
            case "L":
                ActionControl ml = new ActionControl();
                try {
                    ml.moveLeft();
                    
                } catch (ActionControlException ace) {
                    this.console.println(ace.getMessage());
                }
                break;
            case "R":
                ActionControl mr = new ActionControl();
                try {
                    mr.moveRight();
                    
                } catch (ActionControlException ace) {
                    this.console.println(ace.getMessage());
                }

                break;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void viewMap() {

        Map map = EscapeGame.getCurrentGame().getMap();

        //TODO iterate over the map and display locations
        for (int row = 0; row < map.getNumRows(); row++) {
            for (int column = 0; column < map.getNumColumns(); column++) {
            }
        }

        Location playerLocation = EscapeGame.getPlayer().getLocation();
        this.console.println("You are at location (" + playerLocation.getRow() + ", " + playerLocation.getColumn() + ")");
        this.console.println(playerLocation.getDescription());
    }

    private void viewItem() {
        this.console.println("*** viewItem function called");
    }

    private void viewHealth() {
        this.console.println("*** viewHealth funciton called");
    }

    private void pickUpItem() {
        //Get the item from the current location
        Item item = EscapeGame.getPlayer().getLocation().getItem();

        if (item == null) {
            this.console.println("No item here");
        } else {
            this.console.println("You got a " + item.getItemType().toString());
            this.console.println(item.getDescription());
            EscapeGame.getPlayer().getItems().add(item);
            EscapeGame.getPlayer().getLocation().setItem(null);
        }
    }
}
