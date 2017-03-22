/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.control;
import location.Location;
/**
 *
 * @author mckenzietaggart
 */
public class MainControl {
    //Unsure how to code this with String and int.
    public String saveGame(String name){
        int player = 0;
        int location = 0;
        int healthOfPlayer = 0;
        String clue = "";
        String item = "";
        name = "player + location + item + clue + healthOfPlayer";   
        return name;
    }
    public String newGame (String name){
        name = "";
        return name;
    }
    public String loadSavedGame(String name){
        name = "";
        return "player + location + item + clue + healthOfPlayer";        
    }
    public String help(String helpControl){
        return helpControl;
    }
    public boolean quit(boolean answer){
        boolean location = true;
        boolean GameControl = false;
        
        if (answer==true){
            return location;
        }
        else {
            return GameControl;
        }
    }
}
