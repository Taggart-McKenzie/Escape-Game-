/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.control;

/**
 *
 * @author mckenzietaggart
 */
public class MainControl {
    //Unsure how to code this with String and int.
    public String saveGame(int player, int location, String item,
            String clue, int healthOfPlayer){
        return "player + location + item + clue + healthOfPlayer";      
    }
    public String newGame (String name){
        return name;
    }
    public String loadSavedGame(int player, int location, String item,
            String clues, int healthOfPlayer){
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
