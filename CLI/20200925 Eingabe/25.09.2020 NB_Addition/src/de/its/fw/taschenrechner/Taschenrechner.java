package de.its.fw.taschenrechner;

import java.util.Scanner;

public class Taschenrechner {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double erstezahl;
        double zweitezahl;
        double ergebnis;

        System.out.println("Taschenrechner: ");
        System.out.println("Erste Zahl");
        erstezahl = eingabe.nextDouble();
        System.out.println("Eingabe ZweiteZahl: ");
        zweitezahl = eingabe.nextDouble();
        ergebnis = erstezahl + zweitezahl;
//        System.out.println("Ergebnis: " + ergebnis);
        System.out.println("Ergebnis: " + (erstezahl + zweitezahl));
    }

}
