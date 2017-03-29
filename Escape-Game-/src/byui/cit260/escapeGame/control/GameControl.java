/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.control;

import byui.cit260.escapeGame.model.Game;
import byui.cit260.escapeGame.model.Item;
import byui.cit260.escapeGame.model.ItemType;
import byui.cit260.escapeGame.model.Map;
import byui.cit260.escapeGame.model.Player;
import escape.game.EscapeGame;

/**
 *
 * @author mckenzietaggart
 */
public class GameControl {

    public static void createNewGame(Player player) {

        Game game = new Game();

        game.setPlayer(player);

        Map map = new Map();
        map.init(5, 5);

        game.setMap(map);

        //TODO initialize items for the game and add them to the locations in the map
        
        //Create a new item
        Item sti = new Item();
        //Set it's properties
        sti.setItemType(ItemType.Stick);
        sti.setDescription("It's just a boring stick");
        //Get a location in the map and set the item to the new item we created
        map.getLocationAt(3, 5).setItem(sti);
        
        Item bow = new Item();
        bow.setItemType(ItemType.Bowl);
        bow.setDescription("Here is a small bowl");
        map.getLocationAt(2, 2).setItem(bow);
        
        Item cof= new Item();
        cof.setItemType(ItemType.Coffin);
        cof.setDescription("It appears to be a coffin");
        map.getLocationAt(4, 5).setItem(cof);
        
        Item key= new Item();
        key.setItemType(ItemType.Keys);
        key.setDescription("It appears to be a set of keys");
        map.getLocationAt(2, 5).setItem(key);
        
        Item boo= new Item();
        boo.setItemType(ItemType.Book);
        boo.setDescription("It appears to be a book");
        map.getLocationAt(4, 3).setItem(boo);
        
        
        

        //TODO initialize the puzzles for the game and add them to the locations in the map
        //set the player starting location
        player.setLocation(map.getLocationAt(1, 0));

        EscapeGame.setCurrentGame(game);
    }

    public static Player createPlayer(String playersName) {

        if (playersName == null) {
            return null;
        }

        Player player = new Player();
        player.setName(playersName);

        EscapeGame.setPlayer(player); //save the player

        return player;
    }

    public int goBack(int location) {
        int prevLocation = location--;
        return prevLocation;
    }

    public String viewMap(String map) {
        return map;
    }

    public String viewItem(String item) {
        return item;
    }

    public int viewHealth(int player) {
        int healthOfPlayer = 0;
        return healthOfPlayer;
    }

    public boolean quit(boolean answer) {
        boolean location = true;
        boolean GameControl = false;

        if (answer == true) {
            return location;
        } else {
            return GameControl;
        }
    }
}
