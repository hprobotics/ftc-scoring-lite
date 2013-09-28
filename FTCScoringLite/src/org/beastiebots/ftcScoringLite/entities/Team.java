/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beastiebots.ftcScoringLite.entities;

import java.io.Serializable;

/**
 *
 * @author Jacob
 */
class Team implements Serializable{
    private int number;
    private String name;

    //private String location;
    public Team() {
        number = 0;
        name = "";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
/*
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
  */  

    @Override
    public String toString() {
        return number + " (" + name + ')';
    }
    
}
