/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author mckenzietaggart
 */
public class Map implements Serializable{
    
    //class imstance variables
    private int numRows;
    private int numColumns;
    private Location[][] locations;

    public Map() {
    }
    
    public void init(int rows, int cols) {
        numRows = rows;
        numColumns = cols;
        
        locations = new Location[numRows][numColumns];
        
        Location prisonCell = new Location();
        prisonCell.setRow(0);
        prisonCell.setColumn(0);
        prisonCell.setDescription("You are in a dark prison cell.");
        prisonCell.setAbbreviation("C");
        
        locations[0][0] = prisonCell;
        
        
        Location hallway = new Location();
        hallway.setRow(1);
        hallway.setColumn(0);
        hallway.setDescription("Just a boring hallway");
        hallway.setAbbreviation("H");
        
        locations[1][0] = hallway;
        
        //TODO Add more locations to the map so all 25 map positions are filled
    }

    public Location getLocationAt(int row, int col) {
        return locations[row][col];
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

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.numRows;
        hash = 53 * hash + this.numColumns;
        hash = 53 * hash + Arrays.deepHashCode(this.locations);
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
        final Map other = (Map) obj;
        if (this.numRows != other.numRows) {
            return false;
        }
        if (this.numColumns != other.numColumns) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }
    
    
}
