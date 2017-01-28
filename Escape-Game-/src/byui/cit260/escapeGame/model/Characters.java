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
public class Characters implements Serializable{
    
    //class instance variables
    private String warden;
    private String prisoner;

    public Characters() {
    }
    
    

    public String getWarden() {
        return warden;
    }

    public void setWarden(String warden) {
        this.warden = warden;
    }

    public String getPrisoner() {
        return prisoner;
    }

    public void setPrisoner(String prisoner) {
        this.prisoner = prisoner;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.warden);
        hash = 73 * hash + Objects.hashCode(this.prisoner);
        return hash;
    }

    @Override
    public String toString() {
        return "Characters{" + "warden=" + warden + ", prisoner=" + prisoner + '}';
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
        final Characters other = (Characters) obj;
        if (!Objects.equals(this.warden, other.warden)) {
            return false;
        }
        if (!Objects.equals(this.prisoner, other.prisoner)) {
            return false;
        }
        return true;
    }
    
    
    
}
