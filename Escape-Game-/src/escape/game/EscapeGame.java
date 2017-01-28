/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.game;

import byui.cit260.escapeGame.model.Item;
import byui.cit260.escapeGame.model.Player;

/**
 *
 * @author mckenzietaggart
 */
public class EscapeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Player class
        Player playerOne = new Player();
        
        playerOne.setName("Jon");
        playerOne.setLocation("Hall");
        playerOne.setCluesFound("Look in the stairway.");
        playerOne.setHeathOfPlayer("9 lives remaining.");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Item class
        Item myItem = new Item();
        
        myItem.setBook("Bible");
        myItem.setBowl("Metal Bowl");
        myItem.setCoffin("Wooden Coffin");
        myItem.setKeys("Jail Keys");
        myItem.setStick("Long Stick");
        
        String itemInfo = myItem.toString();
        System.out.println(itemInfo);
                
        
    }
    
}
