/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.model;

import java.io.Serializable;

/**
 *
 * @author mckenzietaggart
 */
public class Problem implements Serializable {

    //class instance variables
    private int solveForX;
    private int solveTriangle;
    private int solveCube;
    private int solvePower;

    public Problem() {
    }

    public int getSolveForX() {
        return solveForX;
    }

    public void setSolveForX(int solveForX) {
        this.solveForX = solveForX;
    }

    public int getSolveTriangle() {
        return solveTriangle;
    }

    public void setSolveTriangle(int solveTriangle) {
        this.solveTriangle = solveTriangle;
    }

    public int getSolveCube() {
        return solveCube;
    }

    public void setSolveCube(int solveCube) {
        this.solveCube = solveCube;
    }

    public int getSolvePower() {
        return solvePower;
    }

    public void setSolvePower(int solvePower) {
        this.solvePower = solvePower;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.solveForX;
        hash = 97 * hash + this.solveTriangle;
        hash = 97 * hash + this.solveCube;
        hash = 97 * hash + this.solvePower;
        return hash;
    }

    @Override
    public String toString() {
        return "Problem{" + "solveForX=" + solveForX + ", solveTriangle=" + solveTriangle + ", solveCube=" + solveCube + ", solvePower=" + solvePower + '}';
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
        final Problem other = (Problem) obj;
        if (this.solveForX != other.solveForX) {
            return false;
        }
        if (this.solveTriangle != other.solveTriangle) {
            return false;
        }
        if (this.solveCube != other.solveCube) {
            return false;
        }
        if (this.solvePower != other.solvePower) {
            return false;
        }
        return true;
    }

}
