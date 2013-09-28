/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beastiebots.ftcScoringLite.entities.tournamentManager.tableModels;
import org.beastiebots.ftcScoringLite.entities.Match;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jacob
 */
public class ScoreTableModel extends AbstractTableModel {

    private ArrayList<Match> matches = new ArrayList();

    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "Number";
            case 1:
                return "Score";
        }
        return "";
    }

    public ScoreTableModel(ArrayList<Match> list) {
        matches = list;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

    @Override
    public int getColumnCount() {
        return 2;
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
                return matches.get(row).getCalculatedRedScore() + " - " + matches.get(row).getCalculatedBlueScore();
        }
        return null;
    }
}
