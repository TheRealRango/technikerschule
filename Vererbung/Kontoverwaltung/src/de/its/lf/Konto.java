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
public class Konto {

    double guthaben;
    int kontonummer;

    public double getGuthaben() {
        return guthaben;
    }

    public void addGuthaben(double betrag) {
        guthaben = guthaben + betrag;
    }

    public void removeGuthaben(double betrag) {
        guthaben = guthaben - betrag;
    }
    
    public void ueberweise(double betrag){
        
    }
    public void abrechnen(){
        
    }
}
