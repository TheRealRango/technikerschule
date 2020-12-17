/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.fa;

import java.util.Scanner;

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
        double[] preisliste = new double[5];
        double mittelwert, gesamtkosten = 0;
        int anzeigestelle;
        Scanner eingabe = new Scanner(System.in);
        for (int i = 0; i < preisliste.length; i++) {
            anzeigestelle = i + 1;
            System.out.println("Bitte geben Sie den " + anzeigestelle + ". Preis ein.");
            preisliste[i] = eingabe.nextDouble();
        }
        System.out.println("---------------------------------");
        anzeigestelle = 0;
        for (int i = 0; i < preisliste.length; i++) {
            anzeigestelle = i + 1;
            System.out.println("Der " + anzeigestelle + ". Preist ist " + preisliste[i] + "€");
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < preisliste.length; i++) {
            gesamtkosten = gesamtkosten + preisliste[i];
        }
        mittelwert = gesamtkosten / preisliste.length;

        System.out.println("Der Mittelwert ist:" + mittelwert);

    }

}
