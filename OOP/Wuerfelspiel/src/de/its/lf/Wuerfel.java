/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.lang.Math;

/**
 *
 * @author lorenz
 */
public class Wuerfel {
// Attribute

    private int zahl;
/*Constructor
    public Wuerfel() {
    }
*/
//getter 

    public int getZahl() {
        return zahl;
    }

    public void werfen() {
        zahl = (int) (Math.random() * 6+1);
        

    }
}
