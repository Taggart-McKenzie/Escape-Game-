/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.control;

import byui.cit260.escapeGame.exceptions.ActionControlException;
import byui.cit260.escapeGame.model.Location;
import escape.game.EscapeGame;

/**
 *
 * @author samanthabrown
 */
public class ActionControl {

    public boolean moveUp() throws ActionControlException {

        //Grab the player's current location
        Location current = EscapeGame.getPlayer().getLocation();
        //Check to see if the current row is 0, if it is, don't let the player move up (return "false")
        if (current.getRow() == 0) {
            throw new ActionControlException("You can't move up right now");
        }
        //Grab the location from the map that is one row less than player's current location row
        Location future = EscapeGame.getCurrentGame().getMap().getLocationAt(current.getRow() - 1, current.getColumn());
        //Set the player's current location to that new location
        EscapeGame.getPlayer().setLocation(future);
        //return "true"
        return true;
    }

    public boolean moveDown() {
        Location current = EscapeGame.getPlayer().getLocation();
        if (current.getRow() == 4) {
            return false;
        }
        Location future = EscapeGame.getCurrentGame().getMap().getLocationAt(current.getRow() + 1, current.getColumn());
        EscapeGame.getPlayer().setLocation(future);
        return false;

    }

    public int moveDown(int location) {
        int x = 0;
        int nextLocation;
        nextLocation = location + x;
        return nextLocation;
    }

    public boolean moveLeft() {
        //Grab the player's current location
        Location current = EscapeGame.getPlayer().getLocation();
        //Check to see if the current column is 0, if it is, don't let the player move left (return "false")
        if (current.getColumn() == 0) {
            return false;
        }
        //Grab the location from the map that is one row less than player's current location row
        Location future = EscapeGame.getCurrentGame().getMap().getLocationAt(current.getColumn() - 1, current.getColumn());
        //Set the player's current location to that new location
        EscapeGame.getPlayer().setLocation(future);
        //return "true"
        return true;
    }

    public boolean moveRight() {

        //Grab the player's current location
        Location current = EscapeGame.getPlayer().getLocation();
        //Check to see if the current column is 4, if it is, don't let the player move right (return "false")
        if (current.getColumn() == 4) {
            return false;
        }
        //Grab the location from the map that is one row less than player's current location row
        Location future = EscapeGame.getCurrentGame().getMap().getLocationAt(current.getColumn() + 1, current.getColumn());
        //Set the player's current location to that new location
        EscapeGame.getPlayer().setLocation(future);
        //return "true"
        return true;
    }

    public double pickUpItem(double problem, int item) {
        double solveProblem = 0;
        return item;
    }

    public String useItem(String item) {
        String clue = item;
        return clue;
    }

    public double solveTriangle(double base, double height) {
        base = 0;
        height = 0;
        double surfaceArea = 0;

        if (base < 0 || base > 10) {
            return -1;
        } else if (height < 0 || height > 10) {
            return -1;
        } else if ((base >= 0 && base < 11) && (height >= 0 && height < 11)) {
            surfaceArea = (base * height) / 2;
            return surfaceArea;
        }
        return surfaceArea;
    }

    public double solveForX(double y, double z) {
        double x = 0.0;

        if (y < 0) {
            return -1;
        } else if (z < 0) {
            return -1;
        } else if (z > y) {
            return -1;
        } else if (y > 0 && x > 0 && z < y) {

            y = 50;
            z = 10;
            x = (y - z) / 5;//x = (50-10)/5

            x = (y - z) / 5;

            return x;
        }
        return x;
    }

    public double solveCube(double base, double height, double length) {
        double volume = 0.0;

        if (base < 0 || base > 10) {
            return -1;
        } else if (height < 0 || height > 10) {
            return -1;
        } else if (length < 0 || length > 10) {
            return -1;
        } else if ((base >= 0 && base < 11) && (height >= 0 && height < 11)
                && (length >= 0 && length < 11)) {
            volume = base * height * length;
            return volume;
        }
        return volume;
    }

    public double solvePower(double x) {
        double power = 0;

        if (x < 1 || x > 10) {
            return -1;
        } else if (x >= 1 && x <= 10) {
            power = x * x;
            return power;
        }
        return power;
    }

    public boolean quit(boolean answer) {
        boolean location = true;
        boolean GameControl = false;

        if (answer == true) {
            return location;
        } else {
            return GameControl;
        }
    }
}
