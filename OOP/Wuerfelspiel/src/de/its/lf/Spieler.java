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
public class Spieler {
//Attribute
    private String name;
    private int punkte;
/*constructor wird nicht benötigt
    public Spieler() {
    }
*/
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }
    //getter
    public String getName() {
        return name;
    }

    public int getPunkte() {
        return punkte;
    }

}
