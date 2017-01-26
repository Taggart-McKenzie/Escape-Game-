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
 * @author mckenzietaggart
 */
public class Player implements Serializable{
    
    //classes instance variables
    private String name;
    private String location;
    private String cluesFound;
    private String heathOfPlayer;

    public Player() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCluesFound() {
        return cluesFound;
    }

    public void setCluesFound(String cluesFound) {
        this.cluesFound = cluesFound;
    }

    public String getHeathOfPlayer() {
        return heathOfPlayer;
    }

    public void setHeathOfPlayer(String heathOfPlayer) {
        this.heathOfPlayer = heathOfPlayer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.location);
        hash = 13 * hash + Objects.hashCode(this.cluesFound);
        hash = 13 * hash + Objects.hashCode(this.heathOfPlayer);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", location=" + location + ", cluesFound=" + cluesFound + ", heathOfPlayer=" + heathOfPlayer + '}';
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.cluesFound, other.cluesFound)) {
            return false;
        }
        if (!Objects.equals(this.heathOfPlayer, other.heathOfPlayer)) {
            return false;
        }
        return true;
    }
    
    
}
