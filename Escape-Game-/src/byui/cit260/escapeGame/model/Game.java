/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author samanthabrown
 */
public class Game implements Serializable{
    
    //class instance variables
    private String player;
    private int numberOfTurns;

    public Game() {
    }
    
    

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getNumberOfTurns() {
        return numberOfTurns;
    }

    public void setNumberOfTurns(int numberOfTurns) {
        this.numberOfTurns = numberOfTurns;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.player);
        hash = 97 * hash + this.numberOfTurns;
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", numberOfTurns=" + numberOfTurns + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.numberOfTurns != other.numberOfTurns) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }
    
    
    
}
