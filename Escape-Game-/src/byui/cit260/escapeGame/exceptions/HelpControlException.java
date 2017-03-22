/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.exceptions;

/**
 *
 * @author samanthabrown
 */
public class HelpControlException extends Exception{

    public HelpControlException() {
    }

    public HelpControlException(String message) {
        super(message);
    }

    public HelpControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public HelpControlException(Throwable cause) {
        super(cause);
    }

    public HelpControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
