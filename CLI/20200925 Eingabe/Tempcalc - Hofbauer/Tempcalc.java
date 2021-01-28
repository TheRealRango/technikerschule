/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempcalc;

import java.util.Scanner;

/**
 *
 * @author kai.hofbauer
 */
public class Tempcalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double celsius;
        String friedolf;

        System.out.println("Bitte geben sie grad Clesius ein:");
        celsius = eingabe.nextDouble();
        friedolf = ((((double) Math.round(celsius * 100) / 100)) + " Grad Celsius sind umgerechnet " + (((double) Math.round(((celsius * 9 / 5) + 32) * 100) / 100)) + " Fahrenheit");
        System.out.println(friedolf);
        //
    }

}
