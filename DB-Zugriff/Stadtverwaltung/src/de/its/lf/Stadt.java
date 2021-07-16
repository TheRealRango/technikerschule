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
public class Stadt {
    protected int city_ID;
    protected String city_Bezeichnung;

    public int getCity_ID() {
        return city_ID;
    }

    public void setCity_ID(int city_ID) {
        this.city_ID = city_ID;
    }

    public String getCity_Bezeichnung() {
        return city_Bezeichnung;
    }

    public void setCity_Bezeichnung(String city_Bezeichnung) {
        this.city_Bezeichnung = city_Bezeichnung;
    }
   
    @Override
    public String toString() {
        return " " + String.valueOf(city_ID) + ":   " + String.valueOf(city_Bezeichnung);
    }
}
