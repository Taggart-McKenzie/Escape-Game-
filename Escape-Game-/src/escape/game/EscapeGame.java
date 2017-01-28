/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.game;

import byui.cit260.escapeGame.model.Clues;
import byui.cit260.escapeGame.model.Item;
import byui.cit260.escapeGame.model.Location;
import byui.cit260.escapeGame.model.Map;
import byui.cit260.escapeGame.model.Player;
import byui.cit260.escapeGame.model.Problem;

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
                
        //Problem class
        Problem myProblem = new Problem();
        
        myProblem.setSolveCube(150);
        myProblem.setSolveForX(5);
        myProblem.setSolvePower(25);
        myProblem.setSolveTriangle(10);
        
        String problemInfo = myProblem.toString();
        System.out.println(problemInfo);
        
        //Location class
        Location myLocation = new Location();
        
        myLocation.setAttribute("What is an attribute?");
        myLocation.setColumn(3);
        myLocation.setRow(4);
        myLocation.setDescription("Bathroom");
        myLocation.setItem("Stick");
        myLocation.setProblem(25);
        
        String locationInfo = myLocation.toString();
        System.out.println(locationInfo);
        
        //Map class
        Map myMap = new Map();
        
        myMap.setLocation("Cell");
        myMap.setNumColumns(5);
        myMap.setNumRows(5);
        
        String mapInfo = myMap.toString();
        System.out.println(mapInfo);
        
        //Clues class
        Clues myClues = new Clues();
        
        myClues.setCluesFound("Ask for a clue.");
        
        String cluesInfo = myClues.toString();
        System.out.println(cluesInfo);
        
        
    }
    
}
