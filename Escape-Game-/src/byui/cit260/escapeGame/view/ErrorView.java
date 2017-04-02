/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.view;

import escape.game.EscapeGame;
import java.io.PrintWriter;

/**
 *
 * @author bruce
 */
public class ErrorView  {
  
    private static final PrintWriter errorFile = EscapeGame.getOutFile();
    private static final PrintWriter logFile = EscapeGame.getLogFile();
    
    static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "---------------------------------------------"
                   +"\n - ERROR - " + errorMessage
                   +"\n-------------------------------------------");
    //log error
    logFile.println(className + "_" + errorMessage);
    }

    static void display(String mainMenuView, Exception ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
