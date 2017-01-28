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
public class Item implements Serializable{
    
    //class instance variables
    private String stick;
    private String bowl;
    private String coffin;
    private String keys;
    private String book;

    public Item() {
    }
    
    

    public String getStick() {
        return stick;
    }

    public void setStick(String stick) {
        this.stick = stick;
    }

    public String getBowl() {
        return bowl;
    }

    public void setBowl(String bowl) {
        this.bowl = bowl;
    }

    public String getCoffin() {
        return coffin;
    }

    public void setCoffin(String coffin) {
        this.coffin = coffin;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.stick);
        hash = 71 * hash + Objects.hashCode(this.bowl);
        hash = 71 * hash + Objects.hashCode(this.coffin);
        hash = 71 * hash + Objects.hashCode(this.keys);
        hash = 71 * hash + Objects.hashCode(this.book);
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "stick=" + stick + ", bowl=" + bowl + ", coffin=" + coffin + ", keys=" + keys + ", book=" + book + '}';
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.stick, other.stick)) {
            return false;
        }
        if (!Objects.equals(this.bowl, other.bowl)) {
            return false;
        }
        if (!Objects.equals(this.coffin, other.coffin)) {
            return false;
        }
        if (!Objects.equals(this.keys, other.keys)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        return true;
    }
    
    
}
