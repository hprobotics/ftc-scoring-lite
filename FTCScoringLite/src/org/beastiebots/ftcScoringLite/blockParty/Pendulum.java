/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beastiebots.ftcScoringLite.blockParty;

import java.io.Serializable;

/**
 *
 * @author Jacob
 */
public class Pendulum implements Serializable{

    private int basket1;
    private int basket2;
    private int basket3;
    private int basket4;
    private int low;
    private boolean balanced;

    public Pendulum() {
        basket1 = 0;
        basket2 = 0;
        basket3 = 0;
        basket4 = 0;
        balanced = false;
    }

    public void setBasket1(int basket1) {
        this.basket1 = basket1;
    }

    public void setBasket2(int basket2) {
        this.basket2 = basket2;
    }

    public void setBasket3(int basket3) {
        this.basket3 = basket3;
    }

    public void setBasket4(int basket4) {
        this.basket4 = basket4;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public void setBalanced(boolean balanced) {
        this.balanced = balanced;
    }

    public int getBasket1() {
        return basket1;
    }

    public int getBasket2() {
        return basket2;
    }

    public int getBasket3() {
        return basket3;
    }

    public int getBasket4() {
        return basket4;
    }

    public int getLow() {
        return low;
    }

    public boolean isBalanced() {
        return balanced;
    }

    public int getScore() {
        int score = 3 * (basket1 + basket4) + 2 * (basket2 + basket3) + 1 * low;
        if (balanced) {
            return (int) (score * 1.5);
        } else {
            return score;
        }
    }
}