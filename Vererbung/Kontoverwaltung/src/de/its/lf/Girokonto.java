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
public class Girokonto extends Sparkonto {

    private double dispohoehe;

    public Girokonto(double guthaben, int kontonummer, double habenzins, double dispohoehe) {
        super(guthaben, kontonummer, habenzins);

        this.dispohoehe = dispohoehe;

    }

    public double getDispohoehe() {
        return dispohoehe;
    }

    public void setDispohoehe(double dispohoehe) {
        this.dispohoehe = dispohoehe;
        
    }

    @Override
    public void ueberweise(double betrag, Konto konto) {
        if (getGuthaben() - betrag > dispohoehe) {
            if (konto.getClass().getName().equals("Festgeldkonto")) {
                if (betrag >= 5000) {
                    removeGuthaben(betrag);
                    konto.addGuthaben(betrag);
                }

            } else {
                removeGuthaben(betrag);
                konto.addGuthaben(betrag);
            }
        }
        super.ueberweise(betrag, konto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abrechnen() {

        if (getGuthaben() > 0) {
            addGuthaben(getGuthaben() * 0.25);
        } else if (getGuthaben() < 0) {

            removeGuthaben(getGuthaben() * 0.1199);

        }
        super.abrechnen(); //To change body of generated methods, choose Tools | Templates.
    }

}
