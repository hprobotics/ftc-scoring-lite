/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beastiebots.ftcScoringLite.entities;

/**
 *
 * @author Jacob
 */
public class Alliance {
    private Team team1;
    private boolean team1Surrogate;
    private Team team2;
    private boolean team2Surrogate;

    public Alliance(Team team1, boolean team1Surrogate, Team team2, boolean team2Surrogate) {
        this.team1 = team1;
        this.team1Surrogate = team1Surrogate;
        this.team2 = team2;
        this.team2Surrogate = team2Surrogate;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public boolean isTeam1Surrogate() {
        return team1Surrogate;
    }

    public void setTeam1Surrogate(boolean team1Surrogate) {
        this.team1Surrogate = team1Surrogate;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public boolean isTeam2Surrogate() {
        return team2Surrogate;
    }

    public void setTeam2Surrogate(boolean team2Surrogate) {
        this.team2Surrogate = team2Surrogate;
    }
    
    
}
