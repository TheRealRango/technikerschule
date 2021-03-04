/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.fti;

import java.util.ArrayList;

/**
 *
 * @author lorenz
 */
public class ListeGeometrischeFiguren {

    private ArrayList<GeometrischeFigur> geometrischeFiguren = new ArrayList<>();

    public void add(GeometrischeFigur geometrischeFigur) {
        this.geometrischeFiguren.add(geometrischeFigur);
    }

    public void remove(int i) {
        this.geometrischeFiguren.remove(i);
    }

    public GeometrischeFigur[] getGeometrischeFigur() {
        GeometrischeFigur[] array = new GeometrischeFigur[geometrischeFiguren.size()];

        return geometrischeFiguren.toArray(array);
    }

    public double getFlaecheninhalte() {
        double ergebnis = 0;

        for (int i = 0; i < geometrischeFiguren.size(); i++) {
            ergebnis = ergebnis + geometrischeFiguren.get(i).berechneFlaecheninhalt();
        }
        //runden
        ergebnis = ergebnis * 100;
        ergebnis = Math.round(ergebnis); // returns 200.35
        ergebnis = ergebnis / 100;

        return ergebnis;
    }

}
