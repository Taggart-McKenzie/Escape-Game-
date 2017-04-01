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
public class Map implements Serializable {

    //class imstance variables
    private int numRows;
    private int numColumns;
    private Location[][] locations;

    public Map() {
    }

    public Map(int numRows, int numColumns) {
        if (numRows < 1 || numColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }

        this.numRows = numRows;
        this.numColumns = numColumns;

        //create 2-D array for Location objects
        this.locations = new Location[numRows][numColumns];

        for (int row = 0; row < numRows; row++) {
            for (int column = 0; column < numColumns; column++) {
                //create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                //assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
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

        locations[0][1] = hallway;
        locations[0][2] = hallway;
        locations[0][3] = hallway;
        locations[1][0] = hallway;
        locations[1][1] = hallway;
        locations[1][2] = hallway;
        locations[1][3] = hallway;
        locations[1][4] = hallway;
        locations[2][0] = hallway;
        locations[2][1] = hallway;
        locations[2][3] = hallway;
        locations[2][4] = hallway;
        locations[3][0] = hallway;
        locations[3][1] = hallway;
        locations[3][2] = hallway;
        locations[3][3] = hallway;
        locations[3][4] = hallway;
        locations[4][1] = hallway;
        locations[4][2] = hallway;
        locations[4][3] = hallway;

        Location kitchen = new Location();
        kitchen.setRow(0);
        kitchen.setColumn(4);
        kitchen.setDescription("You are Standing in the Kitchen");
        kitchen.setAbbreviation("K");

        locations[0][4] = kitchen;

        Location morgue = new Location();
        morgue.setRow(4);
        morgue.setColumn(4);
        morgue.setDescription("You are standing in the Morgue");
        morgue.setAbbreviation("M");

        locations[4][4] = morgue;

        Location office = new Location();
        office.setRow(4);
        office.setColumn(0);
        office.setDescription("You are standing in the Wardens Office");
        office.setDescription("O");

        locations[4][0] = office;

        Location bathroom = new Location();
        bathroom.setRow(2);
        bathroom.setColumn(2);
        bathroom.setDescription("You are standing in the Bathroom");
        bathroom.setAbbreviation("B");

        locations[2][2] = bathroom;
        //TODO Add more locations to the map so all 25 map positions are filled
    }

    public Location getLocationAt(int rows, int cols) {
        return locations[rows][cols];
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
