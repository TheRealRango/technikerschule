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
        // TODO code application logic here
        double[] monatskosten = new double[12];
        double gesamtkosten = 0, avemonatkosten = 0, avetagkosten = 0;
        int auswahl, anzeigemonat;
        boolean stop = false;
        Scanner eingabe = new Scanner(System.in);
        while (stop==false) {
            System.out.println("  _______   _  _____      _      \n"
                    + " |__   __| | |/ ____|    | |     \n"
                    + "    | | ___| | |     __ _| | ___ \n"
                    + "    | |/ _ \\ | |    / _` | |/ __|\n"
                    + "    | |  __/ | |___| (_| | | (__ \n"
                    + "    |_|\\___|_|\\_____\\__,_|_|\\___|\n"
                    + "                                 \n"
                    + "                                 ");

            System.out.println("TelCalc Die Telefonkostensoftware");
            System.out.println("___________________________________________________________________");
            System.out.println("\n1) Eingabe der monatlichen Handykosten");
            System.out.println("2) Ausgabe der monatlichen Handykosten");
            System.out.println("3) Ausgabe der Jahreskosten");
            System.out.println("4) Ausgabe der durchschnittlichen Kosten pro Monat");
            System.out.println("5) Ausgabe der durchschnittlichen Kosten pro Tag");
            System.out.println("\n0) Programm beenden");
            System.out.println("\nBitte geben Sie die Nummer des gewuenschten Menuepunkts ein");

            auswahl = eingabe.nextInt();

            switch (auswahl) {
                case 0: {
                    System.out.println("Vielen Dank, dass Sie den TelCalc verwendet haben!");
                    stop = true;
                    break;
                }
                case 1: {

                    for (int i = 0; i < monatskosten.length; i++) {
                        anzeigemonat = i + 1;
                        System.out.print("Bitte geben Sie Ihre Handykosten fuer den " + anzeigemonat + ". Monat ein: ");
                        monatskosten[i] = eingabe.nextDouble();

                    }
                    System.out.println("Bitte drücken Sie zum Fortfahren eine Taste");
                    eingabe.next();
                    break;

                }
                case 2: {
                    for (int i = 0; i < monatskosten.length; i++) {
                        anzeigemonat = i + 1;
                        System.out.println("Die Kosten des " + anzeigemonat + ". Monat sind: " + monatskosten[i] + "€");
                    }
                    System.out.println("Bitte drücken Sie zum Fortfahren eine Taste");
                    eingabe.next();
                    break;
                }
                case 3: {
                    gesamtkosten = 0;
                    for (int i = 0; i < monatskosten.length; i++) {

                        gesamtkosten = gesamtkosten + monatskosten[i];

                    }
                    System.out.println("Die Jahreskosten sind " + gesamtkosten + "€");
                    System.out.println("Bitte drücken Sie zum Fortfahren eine Taste");
                    eingabe.next();
                    break;
                }
                case 4: {
                    gesamtkosten = 0;
                    for (int i = 0; i < monatskosten.length; i++) {
                        gesamtkosten = gesamtkosten + monatskosten[i];

                    }
                    avemonatkosten = gesamtkosten / 12;
                    System.out.print("Die Durchschnittskosten pro Monat sind:");
                    System.out.printf("%6.2f", avemonatkosten);
                    System.out.println("€");
                    System.out.println("Bitte drücken Sie zum Fortfahren eine Taste");
                    eingabe.next();
                    break;
                }
                case 5: {
                    gesamtkosten = 0;
                    for (int i = 0; i < monatskosten.length; i++) {
                        gesamtkosten = gesamtkosten + monatskosten[i];

                    }
                    avetagkosten = gesamtkosten / 360;
                    System.out.print("Die Durchschnittskosten pro Tag sind:");
                    System.out.printf("%6.2f", avetagkosten);
                    System.out.println("€");
                    System.out.println("Bitte drücken Sie zum Fortfahren eine Taste");
                    eingabe.next();
                    break;
                }
                default: {
                    System.out.println("Bitte geben sie eine Zahl zwischen 1 und 5 ein");
                    break;
                }

            }
        }

    }

}
