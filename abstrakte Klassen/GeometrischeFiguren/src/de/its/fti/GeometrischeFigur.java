package de.its.fti;

import java.awt.Color;

/**
 *
 * @author lorenz
 */
public abstract class GeometrischeFigur {

    private Color farbe;
    private Linienart linie;
    

    
    

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }

    public Linienart getLinie() {
        return linie;
    }

    public void setLinie(Linienart linie) {
        this.linie = linie;
    }

    public abstract double berechneFlaecheninhalt();

}
