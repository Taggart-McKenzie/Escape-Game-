/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.exceptions;

/**
 *
 * @author bruce
 */
public class MainControlException extends Exception {

    public MainControlException() {
    }

    public MainControlException(String message) {
        super(message);
    }

    public MainControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MainControlException(Throwable cause) {
        super(cause);
    }

    public MainControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
