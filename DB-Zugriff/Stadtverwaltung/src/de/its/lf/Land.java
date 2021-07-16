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
    
    protected int country_ID;
    protected String country_Bezeichnung;

    public int getCountry_ID() {
        return country_ID;
    }

    public void setCountry_ID(int country_ID) {
        this.country_ID = country_ID;
    }

    public String getCountry_Bezeichnung() {
        return country_Bezeichnung;
    }

    public void setCountry_Bezeichnung(String country_Bezeichnung) {
        this.country_Bezeichnung = country_Bezeichnung;
    }
    
    @Override
    public String toString() {
        return " " + String.valueOf(country_ID) + ":   " + String.valueOf(country_Bezeichnung);
    }
    
    
    
}
