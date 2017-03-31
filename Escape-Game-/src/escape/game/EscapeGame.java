/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.game;

import byui.cit260.escapeGame.model.Game;
import byui.cit260.escapeGame.model.Player;
import byui.cit260.escapeGame.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    private static PrintWriter outFile = null;

    private static PrintWriter logFile = null;

    private static BufferedReader inFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        EscapeGame.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        EscapeGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        EscapeGame.inFile = inFile;
    }

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

        try {
            inFile = new BufferedReader(new InputStreamReader(System.in));

            outFile = new PrintWriter(System.out, true);
            //create StartProgramViewOrig and display the start program view
            //open log file
            String filePath = "log.txt";
            logFile = new PrintWriter(filePath);
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;
        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause:" + e.getCause()
                    + "\nMessage:" + e.getMessage());

            e.printStackTrace();;
        } finally {
            try {
                if (inFile != null) {
                    inFile.close();
                }

                if (outFile != null) {
                    outFile.close();
                }

                if (logFile != null) {
                    logFile.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(EscapeGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            outFile.close();
        }

    }

}
