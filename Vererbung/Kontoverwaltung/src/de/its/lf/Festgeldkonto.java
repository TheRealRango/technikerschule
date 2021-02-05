/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

/**
 *
 * @author lorenz
 */
public class Festgeldkonto extends Konto {

    private int laufzeit;

    public Festgeldkonto(int kontonummer, double guthaben, int laufzeit) {
        super(kontonummer, guthaben);
        if (laufzeit == 6 || laufzeit == 12 || laufzeit == 24) {
            setLaufzeit(laufzeit);
        }
    }

    public int getLaufzeit() {
        return laufzeit;
    }

    public void setLaufzeit(int laufzeit) {
        if (laufzeit == 6 || laufzeit == 12 || laufzeit == 24) {
            this.laufzeit = laufzeit;
        } else {
            this.laufzeit = 6;
        }
    }

    @Override
    public void abrechnen() {

        if (laufzeit == 6) {

            addGuthaben(getGuthaben() * 0.04 / 365);
        } else if (laufzeit == 12) {

            addGuthaben(getGuthaben() * 0.045 / 365);
        } else if (laufzeit == 24) {

            addGuthaben(getGuthaben() * 0.05 / 365);
        }

    }

    @Override
    public void ueberweise(double betrag, Konto konto) {
        if (konto.getClass().getName().equals("Girokonto") && laufzeit <= 0 && betrag <= getGuthaben()) {
            removeGuthaben(betrag);
            konto.addGuthaben(betrag);
        }
    }

}
