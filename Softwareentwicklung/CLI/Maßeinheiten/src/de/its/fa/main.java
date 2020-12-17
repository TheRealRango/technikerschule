/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.fa;

import java.util.*;

/**
 *
 * @author lorenz
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bitte geben Sie an, ob Sie von metrischen in englische Maßeinheiten oder umgekehrt umrechnen wollen");
        System.out.println("(m)etrisch in englisch");
        System.out.println("(e)nglisch in metrisch");
        System.out.print("Eingabe: ");
        double yard, inch, feet;
        String auswahl;
        double startmeter, endmeter;
        Scanner eingabe = new Scanner(System.in);
        auswahl = eingabe.next();

        System.out.println("Bitte geben Sie den Startmeter an:");
        startmeter = eingabe.nextInt();
        System.out.println("Bitte geben Sie den Endmeter an:");
        endmeter = eingabe.nextInt();
        if (auswahl.equals("m")) {
            System.out.println("Meter:  inch:   feet:   yard:");
            while (startmeter <= endmeter) {
                inch = startmeter * 100 / 2.54;
                feet = startmeter / 0.3048;
                yard = startmeter / 0.9144;
                System.out.printf("%6.2f %8.2f %8.2f %8.2f\n", startmeter, inch, feet, yard);
                startmeter++;
            }
        
        }
        else
            System.out.println("Diese Funktion steht noch nicht zur Verfügung");
    }

}
