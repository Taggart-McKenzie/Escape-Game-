/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.control;

import byui.cit260.escapeGame.exceptions.GameControlException;
import byui.cit260.escapeGame.model.Game;
import byui.cit260.escapeGame.model.Item;
import byui.cit260.escapeGame.model.ItemType;
import byui.cit260.escapeGame.model.Map;
import byui.cit260.escapeGame.model.Player;
import escape.game.EscapeGame;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mckenzietaggart
 */
public class GameControl {

    private static String filepath;
    private static Exception GameControlException;

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
        
        
    }
    public static void saveGame(Game game, String filepath)
            throws GameControlException, IOException {
        try  (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);//write the game object to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
            
                }
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

    public static void getSavedGame(String filePath) throws GameControlException {
        try {
            throw GameControlException;
        } catch (Exception ex) {
            Logger.getLogger(GameControl.class.getName()).log(Level.SEVERE, null, ex);
        }
{
        
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        EscapeGame.setCurrentGame(game);
    }
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
