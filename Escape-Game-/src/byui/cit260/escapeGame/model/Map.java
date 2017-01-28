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
public class Map implements Serializable{
    
    //class imstance variables
    private int numRows;
    private int numColumns;
    private String location;

    public Map() {
    }
    
    

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numRows;
        hash = 89 * hash + this.numColumns;
        hash = 89 * hash + Objects.hashCode(this.location);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "numRows=" + numRows + ", numColumns=" + numColumns + ", location=" + location + '}';
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
        final Map other = (Map) obj;
        if (this.numRows != other.numRows) {
            return false;
        }
        if (this.numColumns != other.numColumns) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }
    
   
    
}
