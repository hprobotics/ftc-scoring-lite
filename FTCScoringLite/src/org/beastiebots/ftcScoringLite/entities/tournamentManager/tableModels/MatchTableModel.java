/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beastiebots.ftcScoringLite.entities.tournamentManager.tableModels;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import org.beastiebots.ftcScoringLite.entities.Match;

/**
 *
 * @author Jacob
 */
public class MatchTableModel extends AbstractTableModel {

    private ArrayList<Match> matches = new ArrayList();

    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "Number";
            case 1:
                return "Red Team 1";
            case 2:
                return "Red Team 2";
            case 3:
                return "Blue Team 1";
            case 4:
                return "Blue Team 2";
        }
        return "";
    }

    public MatchTableModel(ArrayList<Match> list) {
        matches = list;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return matches.size();//l is the arraylist that contains the 3 elements
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return matches.get(row).getNumber();
            case 1:
                return matches.get(row).getRedAlliance().getTeam1().toString()+(matches.get(row).getRedAlliance().isTeam1Surrogate()?"":"*");
            case 2:
                return matches.get(row).getRedAlliance().getTeam2().toString()+(matches.get(row).getRedAlliance().isTeam2Surrogate()?"":"*");
            case 3:
                return matches.get(row).getBlueAlliance().getTeam1().toString()+(matches.get(row).getBlueAlliance().isTeam1Surrogate()?"":"*");
            case 4:
                return matches.get(row).getBlueAlliance().getTeam2().toString()+(matches.get(row).getBlueAlliance().isTeam2Surrogate()?"":"*");
        }
        return null;
    }
}
