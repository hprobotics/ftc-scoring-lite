/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beastiebots.ftcScoringLite.entities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jacob
 */
public class Tournament implements Serializable {

    private ArrayList<Team> teams;
    private ArrayList<Match> matches;
    
    public Tournament()
    {
        teams = new ArrayList<Team>();
        matches = new ArrayList<Match>();
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }
    
    
}
