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
public class Girokonto extends Sparkonto{
    private double dispohoehe;

    public double getDispohoehe() {
        return dispohoehe;
    }

    public void setDispohoehe(double dispohoehe) {
        this.dispohoehe = dispohoehe;
    }

    @Override
    public void abrechnen() {
        super.abrechnen(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
