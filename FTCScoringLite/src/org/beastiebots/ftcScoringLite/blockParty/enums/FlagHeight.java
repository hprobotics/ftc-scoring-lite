/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beastiebots.ftcScoringLite.blockParty.enums;

/**
 *
 * @author Jacob
 */
public enum FlagHeight {

    NONE(0),
    LOW(20),
    HIGH(35);
    private int score;

    private FlagHeight(int score) {
        this.score = score;
    }
    
    public int getScore(){
        return(score);
    }
    
    @Override
    public String toString(){
        String[] splitNames = name().toLowerCase().split("_");
       StringBuffer fixedName = new StringBuffer();
        
      for(int i = 0; i < splitNames.length; i++) {
          String firstLetter = splitNames[i].substring(0, 1).toUpperCase(),
                 restOfWord = splitNames[i].substring(1),
                 spacer = i == splitNames.length ? "" : " ";
            
          fixedName.append(firstLetter).append(restOfWord).append(spacer);
        }
        
        return fixedName.toString();
    }
}
