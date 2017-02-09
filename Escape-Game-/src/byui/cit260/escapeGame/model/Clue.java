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
public class Clue implements Serializable{
    
    //class instace variables
    private String cluesFound;

    public Clue() {
    }
    
    

    public String getCluesFound() {
        return cluesFound;
    }

    public void setCluesFound(String cluesFound) {
        this.cluesFound = cluesFound;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.cluesFound);
        return hash;
    }

    @Override
    public String toString() {
        return "Clues{" + "cluesFound=" + cluesFound + '}';
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
        final Clue other = (Clue) obj;
        if (!Objects.equals(this.cluesFound, other.cluesFound)) {
            return false;
        }
        return true;
    }
    
    
}
