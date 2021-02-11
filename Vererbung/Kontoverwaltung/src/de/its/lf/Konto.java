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
public abstract class Konto {

    private double guthaben;
    private int kontonummer;
    private int personID;

    public Konto(int kontonummer, double guthaben) {
        this.guthaben = guthaben;
        this.kontonummer = kontonummer;
        //this.personID = personID;

    }

    /*
    public boolean isOwner(int personID) {
        if (personID == this.personID) {
            return true;

        }
        return false;
    }
     */
    
    
    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }
    
    public double getGuthaben() {
        return guthaben;
    }

    public void addGuthaben(double betrag) {
        guthaben = guthaben + betrag;
    }

    public void removeGuthaben(double betrag) {
        guthaben = guthaben - betrag;
    }

    public abstract void ueberweise(double betrag, Konto konto);


    public abstract void abrechnen();
    
    public abstract String getTyp();

}
