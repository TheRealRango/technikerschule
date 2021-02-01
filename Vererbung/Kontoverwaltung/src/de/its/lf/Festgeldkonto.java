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

    public int getLaufzeit() {
        return laufzeit;
    }

    public void setLaufzeit(int laufzeit) {
        this.laufzeit = laufzeit;
    }

    @Override
    public void abrechnen() {
        super.abrechnen(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
