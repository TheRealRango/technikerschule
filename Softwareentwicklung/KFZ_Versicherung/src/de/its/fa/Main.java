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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner erstellen
        Scanner eingabe = new Scanner(System.in);
        //Variablendeklaration
        double zuschlag, grundbetrag, zuzahlen;
        String kilometer, alter, garage;
        //Zuschlag auf 0 setzen
        zuschlag = 0;
        //eingabe Grundbetrag
        System.out.println("Wie hoch ist der Grundbetrag?");
        grundbetrag = eingabe.nextDouble();
        //eingabe Alter
        System.out.println("Ist der Fahrer <= 25? (ja/nein)");
        alter = eingabe.next();
        //eingabe Kilometer 
        System.out.println("Wird das Auto mehr als 15000km im Jahr gefahren?(ja/nein)");
        kilometer = eingabe.next();
        //eingabe Garage
        System.out.println("Ist das Fahrzeug ein Garagenfahrzeug? ja/nein");
        garage = eingabe.next();
        //Abfragen
        if (alter.equals("ja")) {
            zuschlag = zuschlag + grundbetrag * 0.10;
        } else {
            zuschlag = zuschlag - grundbetrag * 0.10;
        }
        System.out.println(zuschlag);
        if (kilometer.equals("ja")) {
            zuschlag = zuschlag + grundbetrag * 0.20;
        } else {
            zuschlag = zuschlag - grundbetrag * 0.10;
        }
        if (garage.equals("ja")) {
            zuschlag = zuschlag - grundbetrag * 0.05;
        } else {
            zuschlag = zuschlag + grundbetrag * 0.05;
        }
        System.out.println("Der grundbetrag ist " + grundbetrag + "€");
        System.out.println("Der Zuschlag ist " + zuschlag + "€");

        zuzahlen = grundbetrag + zuschlag;

        System.out.println("Also kostet es insgesamt " + zuzahlen + "€");

    }

}
