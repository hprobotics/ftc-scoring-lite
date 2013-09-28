/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beastiebots.ftcScoringLite.blockParty;

import org.beastiebots.ftcScoringLite.blockParty.enums.*;
import java.io.Serializable;
import org.beastiebots.ftcScoringLite.entities.Score;

/**
 *
 * @author Jacob
 */
public class BlockPartyScore implements Score,Serializable{

    private AutoBlock IRgoal;
    private AutoBlock autoGoal1;
    private AutoBlock autoGoal2;
    private AutoPosition autoPos1;
    private AutoPosition autoPos2;
    private Pendulum pendulum;
    private boolean robot1Lifted;
    private boolean robot2Lifted;
    private FlagHeight flagState;
    private int minorPenalies;
    private int majorPenalties;

    public BlockPartyScore() {
        IRgoal=AutoBlock.PENDULUM_1;
        autoGoal1=AutoBlock.NONE;
        autoGoal2=AutoBlock.NONE;
        autoPos1=AutoPosition.NONE;
        autoPos2=AutoPosition.NONE;

        pendulum=new Pendulum();

        robot1Lifted=false;
        robot2Lifted=false;
        flagState = FlagHeight.NONE;
        
        minorPenalies=0;
        majorPenalties=0;
    }

    public AutoBlock getIRgoal() {
        return IRgoal;
    }

    public void setIRgoal(AutoBlock IRgoal) {
        this.IRgoal = IRgoal;
    }

    public AutoBlock getAutoGoal1() {
        return autoGoal1;
    }

    public void setAutoGoal1(AutoBlock autoGoal1) {
        this.autoGoal1 = autoGoal1;
    }

    public AutoBlock getAutoGoal2() {
        return autoGoal2;
    }

    public void setAutoGoal2(AutoBlock autoGoal2) {
        this.autoGoal2 = autoGoal2;
    }

    public AutoPosition getAutoPos1() {
        return autoPos1;
    }

    public void setAutoPos1(AutoPosition autoPos1) {
        this.autoPos1 = autoPos1;
    }

    public AutoPosition getAutoPos2() {
        return autoPos2;
    }

    public void setAutoPos2(AutoPosition autoPos2) {
        this.autoPos2 = autoPos2;
    }

    public Pendulum getPendulum() {
        return pendulum;
    }

    public void setPendulum(Pendulum pendulum) {
        this.pendulum = pendulum;
    }

    public boolean isRobot1Lifted() {
        return robot1Lifted;
    }

    public void setRobot1Lifted(boolean robot1Lifted) {
        this.robot1Lifted = robot1Lifted;
    }

    public boolean isRobot2Lifted() {
        return robot2Lifted;
    }

    public void setRobot2Lifted(boolean robot2Lifted) {
        this.robot2Lifted = robot2Lifted;
    }

    public FlagHeight getFlagState() {
        return flagState;
    }

    public void setFlagState(FlagHeight flagState) {
        this.flagState = flagState;
    }

    public int getMinorPenalies() {
        return minorPenalies;
    }

    public void setMinorPenalies(int minorPenalies) {
        this.minorPenalies = minorPenalies;
    }

    public int getMajorPenalties() {
        return majorPenalties;
    }

    public void setMajorPenalties(int majorPenalties) {
        this.majorPenalties = majorPenalties;
    }

    public int getAutoScore(){
        int score = 0;
        score += autoPos1.getScore();
        score += autoPos2.getScore();
        score += autoGoal1.getScore();
        score += autoGoal2.getScore();
        score += autoGoal1==IRgoal?20:0;
        score += autoGoal2==IRgoal?20:0;
        return score;
    }
    
    public int getEndGameScore(){
        int score = 0;
        score += flagState.getScore();
        score += robot1Lifted?50:0;
        score += robot2Lifted?50:0;
        return score;
    }
    
    public int getPenaltyScore(){
        int score = 0;
        score += minorPenalies*10;
        score += majorPenalties*50;
        return score;
    }

    public int getScore(){
        return getAutoScore()+pendulum.getScore()+getEndGameScore();
    }
}
