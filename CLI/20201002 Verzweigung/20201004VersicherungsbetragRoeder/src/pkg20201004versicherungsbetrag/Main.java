/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20201004versicherungsbetrag;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author troed
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variablen deklarieren
        double grundbetrag = 0;
        Scanner e_grundbetrag = new Scanner(System.in);
        double zuschlag = 0;
        //Brauch ich eigentlich nicht
        //Scanner e_zuschlag = new Scanner(System.in);
        int alter = 0;
        Scanner e_alter  = new Scanner(System.in);
        int fahrleistung = 0;
        Scanner e_fahrleistung  = new Scanner(System.in);
        boolean stellplatz = false;
        Scanner e_stellplatz = new Scanner(System.in);
        double gesamtbetrag = 0;
        //besser zu berechnen ist geburtsdatum bei Alter
        java.time.LocalDate geburtsdatum = LocalDate.of(1900, Month.JANUARY, 01);
        Scanner e_geburtsdatum = new Scanner(System.in);
        
        
        //Variablen befüllen
        System.out.println("Alter des Fahrers?");
        alter = e_alter.nextInt();
        /**
         * Muss noch richtigen Scanner finden
        System.out.println("Geburtsdatum des Fahrers");
        geburtsdatum = e_geburtsdatum.nextLine();
        **/
        System.out.println("Fahrleistung pro Jahr?");
        fahrleistung = e_fahrleistung.nextInt();
        System.out.println("Garagenstellplatz? (true/false)");
        stellplatz = e_stellplatz.nextBoolean();
        System.out.println("Grundbetrag d Kfz?");
        grundbetrag = e_grundbetrag.nextDouble();
        zuschlag = 0;
        //Zuschlag ist zwar schon 0, aber Aufgabenstellung
        //gibt das vor
        
        //Entscheidungen / Zuschlag berechnen
        if (alter<=25) {
            zuschlag = grundbetrag*0.4;
            System.out.println("Alter: Z um " + grundbetrag*0.4 + " erhöht");
            System.out.println("Z = " + zuschlag);
        }
        else {
            zuschlag = grundbetrag*(-0.1);
            System.out.println("Alter: Z um " + grundbetrag*0.1 + " verringert");
            System.out.println("Z = " + zuschlag);
        }
        
        if (fahrleistung>15000){
            zuschlag = zuschlag + grundbetrag*0.2;
            System.out.println("Fahrleistung: Z um " + grundbetrag*0.2 + " erhöht");
            System.out.println("Z = " + zuschlag);
        }
        else {
            zuschlag = zuschlag - grundbetrag*0.1;
            System.out.println("Fahrleistung: Z um " + grundbetrag*0.1 + " verringert");
            System.out.println("Z = " + zuschlag);
        }
        
        if (stellplatz == true) {
            zuschlag = zuschlag - grundbetrag*0.05;
            System.out.println("Stellplatz: Z um " + grundbetrag*0.05 + " verringert");
            System.out.println("Z = " + zuschlag);
        }
        else {
            zuschlag = zuschlag + grundbetrag*0.5;
            System.out.println("Stellplatz: Z um " + grundbetrag*0.05 + " erhöht");
            System.out.println("Z = " + zuschlag);
        }
        System.out.println("Grundbetrag: "+grundbetrag+", Zuschlag: "+zuschlag);
        gesamtbetrag = grundbetrag + zuschlag;
        System.out.println("Gesamtbeitrag: "+gesamtbetrag);
        
    }
    
}
