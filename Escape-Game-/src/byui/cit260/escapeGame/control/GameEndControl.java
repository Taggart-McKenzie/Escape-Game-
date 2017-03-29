/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.control;

/**
 *
 * @author samanthabrown
 */
public class GameEndControl {

    public String winGame(int health, int location) {

        if (health >= 1 && location == 25) {
            return "YOU WIN";
        } else {
            return "YOU LOSE";
        }

    }

    public String loseGame(int health, int location) {

        if (health < 1 || location != 25) {
            return "YOU LOSE";
        } else if (health >= 1 && location == 25) {
            return "YOU WIN";
        }
//we are not quite sure we are getting this red flag on line 30.
        return null;
    }
}
