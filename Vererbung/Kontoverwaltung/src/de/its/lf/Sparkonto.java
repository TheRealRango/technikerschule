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
    private int habenzins;

    public int getHabenzins() {
        return habenzins;
    }

    public void setHabenzins(int habenzins) {
        this.habenzins = habenzins;
    }

    @Override
    public void abrechnen() {
        super.abrechnen(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
