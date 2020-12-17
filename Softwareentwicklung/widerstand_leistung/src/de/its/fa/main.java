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
        //VAriablen deklaration
        double p = 0, r = 0, u = 0, i = 0;
        String entscheidung;
        Scanner eingabe = new Scanner(System.in);

        //entscheidung
        System.out.println("Wollen sie Widerstand oder Leistung berechnen?");

        entscheidung = eingabe.next();
        if (!entscheidung.equals("Widerstand") && !entscheidung.equals("Leistung")) {
            System.out.println("Die eingabe ist ungültig! ");
            System.exit(0);
        };
        System.out.println("Bitte geben sie den wert für U ein");
        u = eingabe.nextInt();
        System.out.println("Bitte geben sie den wert für i ein");
        i = eingabe.nextInt();

        if (entscheidung.equals("Widerstand")) {
            r = u / i;
            System.out.println("Der Widerstand beträgt" + r);
        } else if (entscheidung.equals("Leistung")) {
            p = u * i;
            System.out.println("Die Leistung beträgt" + p);
        }
    }

}
