/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beastiebots.ftcScoringLite.entities.tournamentManager.tableModels;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import org.beastiebots.ftcScoringLite.entities.Team;

/**
 *
 * @author Jacob
 */
public class TeamTableModel extends AbstractTableModel {

    private ArrayList<Team> teams = new ArrayList();

    @Override
    public String getColumnName(int col)
    {
        switch (col) {
            case 0:
                return "Number";
            case 1:
                return "Name";
            //case 2:
            //    return "Location";
        }
        return "";
    }
    
    public TeamTableModel(ArrayList<Team> list) {
        teams = list;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
    
    @Override
    public int getColumnCount() {
        //return 3;
        return 2;
    }

    @Override
    public int getRowCount() {
        return teams.size();//l is the arraylist that contains the 3 elements
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return teams.get(row).getNumber();
            case 1:
                return teams.get(row).getName();
            //case 2:
            //    return teams.get(row).getLocation();
        }
        return null;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        switch (col) {
            case 0:
                teams.get(row).setNumber(Integer.parseInt((String)value));
                break;
            case 1:
                teams.get(row).setName((String)value);
                break;
            //case 2:
            //    teams.get(row).setLocation((String)value);
            //    break;
        }
        fireTableCellUpdated(row, col);
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return true;
    }
}
