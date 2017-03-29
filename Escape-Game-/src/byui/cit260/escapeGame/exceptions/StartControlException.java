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
public class StartControlException extends Exception {

    public StartControlException() {
    }

    public StartControlException(String message) {
        super(message);
    }

    public StartControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public StartControlException(Throwable cause) {
        super(cause);
    }

    public StartControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
