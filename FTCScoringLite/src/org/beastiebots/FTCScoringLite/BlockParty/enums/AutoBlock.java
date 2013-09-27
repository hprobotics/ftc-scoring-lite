/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beastiebots.FTCScoringLite.BlockParty.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jacob
 */
public enum AutoBlock {

    NONE(0),
    PENDULUM_1(20),
    PENDULUM_2(20),
    PENDULUM_3(20),
    PENDULUM_4(20),
    LOW(5);
    private int score;

    private AutoBlock(int score) {
        this.score = score;
    }

    public int getScore() {
        return (score);
    }

    @Override
    public String toString() {
        String[] splitNames = name().toLowerCase().split("_");
        StringBuffer fixedName = new StringBuffer();

        for (int i = 0; i < splitNames.length; i++) {
            String firstLetter = splitNames[i].substring(0, 1).toUpperCase(),
                    restOfWord = splitNames[i].substring(1),
                    spacer = i == splitNames.length ? "" : " ";

            fixedName.append(firstLetter).append(restOfWord).append(spacer);
        }

        return fixedName.toString();
    }
    
    public static AutoBlock[] valuesPendulum()
    {
        AutoBlock[] values = AutoBlock.values();
        ArrayList<AutoBlock> list = new ArrayList(Arrays.asList(values));
        list.remove(AutoBlock.NONE);
        list.remove(AutoBlock.LOW);
        return list.toArray(new AutoBlock[0]);
    }
}
