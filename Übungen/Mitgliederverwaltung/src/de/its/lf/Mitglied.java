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
public class Mitglied {
    
    private int mnr;
    private String name;

    public Mitglied(int mnr, String name) {
        this.mnr = mnr;
        this.name = name;
    }

    
    
    public int getMnr() {
        return mnr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String showInfo(){
        return "Nummer: " + mnr + "name: " + name;
    }
    
    
}
