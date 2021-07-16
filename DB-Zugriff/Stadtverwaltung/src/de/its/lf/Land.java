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
public class Land {
    
    protected int iD;
    protected String bezeichnung;

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    
    @Override
    public String toString() {
        return "ID: " + String.valueOf(iD) + "Bezeichnung: " + String.valueOf(bezeichnung);
    }
    
    
    
}
