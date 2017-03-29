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
public class GameEndControlException extends Exception {

    public GameEndControlException() {
    }

    public GameEndControlException(String message) {
        super(message);
    }

    public GameEndControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameEndControlException(Throwable cause) {
        super(cause);
    }

    public GameEndControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
