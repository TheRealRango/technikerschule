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
public class Sparkonto extends Konto {

    private double habenzins;

    public Sparkonto(double guthaben, int kontonummer, double habenzins) {
        super(guthaben, kontonummer);
        this.habenzins = habenzins;

    }

    public double getHabenzins() {
        return habenzins;
    }

    public void setHabenzins(double habenzins) {
        this.habenzins = habenzins;
    }

    @Override
    public void abrechnen() {

        addGuthaben(getGuthaben() * 0.02);

    }

    @Override
    public void ueberweise(double betrag, Konto konto) {
        if (konto.getClass().getName().equals("Girokonto") && betrag <= getGuthaben()) {
            removeGuthaben(betrag);
            konto.addGuthaben(betrag);
        }
    }

}
