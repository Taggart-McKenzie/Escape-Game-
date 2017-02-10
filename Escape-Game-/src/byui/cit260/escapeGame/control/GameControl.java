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
public class GameControl {
    
    public int goBack(int location){
        return location;
    }
    
    public String viewMap(String map){
        return map;
    } 
    
    public String viewItem(String item){
        return item;
    }
    
    public int viewHealth(int player){
        int healthOfPlayer = 10;
        return healthOfPlayer;
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
