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
public class MainControl extends Exception{

    public MainControl() {
    }

    public MainControl(String message) {
        super(message);
    }

    public MainControl(String message, Throwable cause) {
        super(message, cause);
    }

    public MainControl(Throwable cause) {
        super(cause);
    }

    public MainControl(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
