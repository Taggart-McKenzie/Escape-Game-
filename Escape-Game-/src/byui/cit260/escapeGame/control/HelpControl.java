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
public class HelpControl {
    public String clue(String clue){
        return clue;
    }
    public String rules(String rules){
        return rules;
    }
    public int movement(int actionControl){  
        return actionControl;
    }
    public String lookAround(String map){
        return map;
    }
    public String usefulItems(String item){
        return item;
    }
    public boolean quit(boolean answer){
        boolean location = true;
        boolean HelpControl = false;
        
        if (answer==true){
            return location;
        }
        else {
            return HelpControl;
        }
    }
}
