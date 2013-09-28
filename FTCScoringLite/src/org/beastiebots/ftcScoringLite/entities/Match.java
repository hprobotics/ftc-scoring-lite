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
public class Match implements Serializable {

    Score redScore;
    Score blueScore;
    String number;
    Alliance redAlliance;
    Alliance blueAlliance;

    public Match(String number, Alliance redAlliance, Alliance blueAlliance, Score redScore, Score blueScore) {
        this.redScore = redScore;
        this.blueScore = blueScore;
        this.number = number;
        this.redAlliance = redAlliance;
        this.blueAlliance = blueAlliance;
    }

    

    public Score getRedScore() {
        return redScore;
    }

    public void setRedScore(Score redScore) {
        this.redScore = redScore;
    }

    public Score getBlueScore() {
        return blueScore;
    }

    public void setBlueScore(Score blueScore) {
        this.blueScore = blueScore;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Alliance getRedAlliance() {
        return redAlliance;
    }

    public void setRedAlliance(Alliance redAlliance) {
        this.redAlliance = redAlliance;
    }

    public Alliance getBlueAlliance() {
        return blueAlliance;
    }

    public void setBlueAlliance(Alliance blueAlliance) {
        this.blueAlliance = blueAlliance;
    }

    public Alliance getWinningAlliance() {
        if (blueScore.getScore() + redScore.getPenaltyScore() > redScore.getScore() + blueScore.getPenaltyScore()) {
            return blueAlliance;
        } else if (blueScore.getScore() + redScore.getPenaltyScore() < redScore.getScore() + blueScore.getPenaltyScore()) {
            return redAlliance;
        } else {
            return null;
        }
    }

    public int getRP() {
        if (getWinningAlliance() == blueAlliance) {
            return redScore.getScore();
        } else if (getWinningAlliance() == redAlliance) {
            return blueScore.getScore();
        } else {
            return blueScore.getScore();
        }
    }

    public int getCalculatedRedScore() {
        return redScore.getScore() + blueScore.getPenaltyScore();
    }

    public int getCalculatedBlueScore() {
        return blueScore.getScore() + redScore.getPenaltyScore();
    }
}
