/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

import byui.cit260.escapeGame.control.GameControl;
import byui.cit260.escapeGame.model.Player;
import escape.game.EscapeGame;
import java.util.Scanner;


/**
 *
 * @author Brown and Groesbeck
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Main Menu                        |"
                + "\n------------------------------------"
                + "\nS - Save"
                + "\nB - Begin New Game"
                + "\nL - Load Saved Game"
                + "\nE - End Game"
                + "\nH - Help"
                + "\nQ - Quit"
                + "\n------------------------------------") ;
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert to all upper case

        switch (value) {
            case "S": //save
                this.saveGame();
                break;
            case "B": //begin new game
                this.newGame();
                break;
            case "L"://load saved game
                this.loadSavedGame();
                break;
            case "H"://Help
                this.help();
                break;
            case "E"://End Game
                this.gameEndControl();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void saveGame() {
        System.out.println("*** saveGame function called***");
    }

    private void newGame() {
        //create a new game
        GameControl.createNewGame(EscapeGame.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadSavedGame() {
        System.out.println("*** loadSavedGame function called ***");
    }

    private void gameEndControl() {
        System.out.println("***end function called ***");
    }

    private void help() {
        HelpMenuView hmv = new HelpMenuView();
        hmv.display();
    }
   
    }

    
