/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.game;

import byui.cit260.escapeGame.model.Characters;
import byui.cit260.escapeGame.model.Clue;
import byui.cit260.escapeGame.model.Game;
import byui.cit260.escapeGame.model.Item;
import byui.cit260.escapeGame.model.Location;
import byui.cit260.escapeGame.model.Map;
import byui.cit260.escapeGame.model.Player;
import byui.cit260.escapeGame.model.Problem;
import byui.cit260.escapeGame.view.StartProgramView;

/**
 *
 * @author mckenzietaggart
 */
public class EscapeGame {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        EscapeGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        EscapeGame.player = player;
    }

    public static void main(String[] args) {

        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();

    }

}
