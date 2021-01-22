/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.sw;

/**
 *
 * @author lorenz
 */
public class Ferienwohnung extends Unterkunft {

    private int anzahlWochen;
    private static double wochenPreis;
    private int maxPersonen;
    private static double endreinigung;

    public Ferienwohnung(int anzahlWochen, int maxPersonen, int nummer, boolean behindertengerecht) {
        super(nummer, behindertengerecht);
        this.maxPersonen = maxPersonen;
    }

    public int getAnzahlWochen() {
        return anzahlWochen;
    }

    public void setAnzahlWochen(int anzahlWochen) {
        this.anzahlWochen = anzahlWochen;
    }

    public static double getWochenPreis() {
        return wochenPreis;
    }

    public static void setWochenPreis(double wochenPreis) {
        Ferienwohnung.wochenPreis = wochenPreis;
    }

    public static double getEndreinigung() {
        return endreinigung;
    }

    public static void setEndreinigung(double endreinigung) {
        Ferienwohnung.endreinigung = endreinigung;
    }
    
    
    @Override
    public double uebernachtungspreisBerechnen() {
        return 0;
    }

}
