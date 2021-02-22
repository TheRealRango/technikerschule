/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.awt.Color;

/**
 *
 * @author lorenz
 */
public abstract class GeometrischeFigur {
    
    private Color farbe;

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }
    
    public abstract double berechneFlaecheninhalt();
        
        
    
}
