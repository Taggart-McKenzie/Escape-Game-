/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author mckenzietaggart
 */
public class Player implements Serializable{
    
    //classes instance variables
    private String name;
    private Location location;
    private List<Clue> cluesFound;
    private int healthOfPlayer;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Clue> getCluesFound() {
        return cluesFound;
    }

    public void setCluesFound(List<Clue> cluesFound) {
        this.cluesFound = cluesFound;
    }

    public int getHealthOfPlayer() {
        return healthOfPlayer;
    }

    public void setHealthOfPlayer(int healthOfPlayer) {
        this.healthOfPlayer = healthOfPlayer;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.location);
        hash = 67 * hash + Objects.hashCode(this.cluesFound);
        hash = 67 * hash + this.healthOfPlayer;
        return hash;
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
        final Player other = (Player) obj;
        if (this.healthOfPlayer != other.healthOfPlayer) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.cluesFound, other.cluesFound)) {
            return false;
        }
        return true;
    }

    
    
}
