/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.sw;

/**
 *
 * @author lorenz.faber
 */
public abstract class Uhr {

    private boolean sommerzeit;
    Zeit zeit = new Zeit(0, 0);

    public Uhr(Zeit zeit) {
        this.zeit = zeit;
    }

    public boolean isSommerzeit() {
        return sommerzeit;
    }

    public void setSommerzeit(boolean sommerzeit) {
        this.sommerzeit = sommerzeit;
    }

    public String getAusgabe() {
        if (sommerzeit == true) {

            return "Uhrzeit: " + zeit.getStunde() + 1 + ":" + zeit.getMinute();
        } else {
            return "Uhrzeit: " + zeit.getStunde() + ":" + zeit.getMinute();
        }
    }

}
