/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.util.Scanner;

/**
 *
 * @author lorenz.faber
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner eingabe = new Scanner(System.in);
        double umsatz[] = new double[100];
        int auswahl, artikelnummer, menge, zwischenumsatz;
        double gesamtumsatz = 0, tmp, groessterumsatz = 0, groessterartikel = 0;

        do {
            System.out.println("Was möchten Sie tun?");
            System.out.println("1) Artikel erfassen");
            System.out.println("2)Artikel mit dem größten Umsatz anzeigen");
            System.out.println("0) Programm beenden");
            System.out.println("----------------------------------------------");
            auswahl = eingabe.nextInt();
            if (auswahl == 1) {
                //Artikel erfassen
                System.out.println("Bitte geben Sie die Artikelnummer ein:");
                artikelnummer = eingabe.nextInt();
                System.out.println("Bitte geben Sie die Menge ein:");
                menge = eingabe.nextInt();

                while (artikelnummer < 1 || artikelnummer > 100) {
                    System.out.println("Diese Eingabe ist nicht gültig, bitte Wiederholen");
                    System.out.println("Bitte geben Sie die Artikelnummer ein:");
                    artikelnummer = eingabe.nextInt();
                    System.out.println("Bitte geben Sie den Preis ein:");
                    menge = eingabe.nextInt();
                }

                if (artikelnummer >= 1 && artikelnummer <= 40) {
                    //kosten 5 euro
                    zwischenumsatz = menge * 5;
                    umsatz[artikelnummer] = umsatz[artikelnummer] + zwischenumsatz;

                } else if (artikelnummer > 40) {
                    //kosten 10 euro
                    zwischenumsatz = menge * 10;
                    umsatz[artikelnummer] = umsatz[artikelnummer] + zwischenumsatz;

                }

            } else if (auswahl == 2) {
                //Größter Umsatz
                for (int i = 0; i < umsatz.length; i++) {
                    tmp = umsatz[i] + 1;

                    while (tmp > umsatz[i]) {
                        groessterartikel = i + 1;
                        groessterumsatz = tmp;
                        
                    }
                }

                System.out.println("Der Größte Umsatz hat Artikel " + groessterartikel + "mit dem Umsatz" + groessterumsatz + "€");
            } else if (auswahl == 0) {
                for (int i = 0; i < umsatz.length; i++) {
                    gesamtumsatz = gesamtumsatz + umsatz[i];

                }
                System.out.println("Der Gesamtumsatz ist:" + gesamtumsatz + "€");
                System.out.println("Programm Ende");

            }
        } while (auswahl != 0);

    }

}
