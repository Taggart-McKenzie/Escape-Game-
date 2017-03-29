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
public class Location implements Serializable {

    //class instance variables
    private int row;
    private int column;
    private String description;
    private String abbreviation;
    private Item item;
    private Problem problem;
    private boolean visited;
    private Location[][] location;
    public Location() {
        
    }

    public Location(int row, int column, String description, String abbreviation, Item item, Problem problem, boolean visited) {
        this.row = row;
        this.column = column;
        this.description = description;
        this.abbreviation = abbreviation;
        this.item = item;
        this.problem = problem;
        this.visited = visited;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.row;
        hash = 89 * hash + this.column;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.item);
        hash = 89 * hash + Objects.hashCode(this.problem);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.problem, other.problem)) {
            return false;
        }
        return true;
    }

}
