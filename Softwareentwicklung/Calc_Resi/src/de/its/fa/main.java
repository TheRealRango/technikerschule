/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.fa;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author lorenz
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variablen deklaration
        int farbcode1, farbcode2, farbcode3, farbcode4;
        double r, toleranz =0;
        //Scanner erstellen
        Scanner eingabe = new Scanner(System.in);
        System.out.println("CaclResi - das Programm zur Dekodierung des IEC-Farbcodes");
        System.out.println("Farben des 1. und 2. Rings:");
        System.out.println("0)Schwarz 1)braun 2)rot 3)orange 4)gelb 5)grün 6)blau 7)violett 8)grau 9) weiß");
        farbcode1 = eingabe.nextInt();
        farbcode2 = eingabe.nextInt();
        System.out.println("Farben des 3. Rings:");
        System.out.println("1)silber 2)gold 3)schwarz 4)braun 5)rot 6)orange 7)gelb 8)grün 9)blau 10)violett 11)grau 12)weiß");
        farbcode3 = eingabe.nextInt();
        System.out.println("Farben des 4. Rings:");
        System.out.println("1)keine 2)silber 3)gold 4)braun 5)rot 6)grün");
        farbcode4 = eingabe.nextInt();
        r = (farbcode1 * 10) + farbcode2;

        switch (farbcode3) {
            case 1:
                r = r * 0.01;
                break;
            case 2:
                r = r * 0.1;
                break;
            case 3:
                r = r * 1;
                break;
            case 4:
                r = r * 10;
                break;
            case 5:
                r = r * 100;
                break;
            case 6:
                r = r * 1000;
                break;
            case 7:
                r = r * Math.pow(10, 4);
                break;
            case 8:
                r = r * Math.pow(10, 5);
                break;
            case 9:
                r = r * Math.pow(10, 6);
                break;
            case 10:
                r = r * Math.pow(10, 7);
                break;
            case 11:
                r = r * Math.pow(10, 8);
                break;
            case 12:
                r = r * Math.pow(10, 9);
                break;
            default:
                System.out.println("Dies ist eine ungültige Eingabe");

        }
        switch (farbcode4) {
            case 1:
                toleranz = 20;
                break;
            case 2:
                toleranz = 10;
                break;
            case 3:
                toleranz = 5;
                break;
            case 4:
                toleranz = 1;
                break;
            case 5:
                toleranz = 2;
                break;
            case 6:
                toleranz = 0.5;
                break;
            default:
                System.out.println("Dies ist eine ungültige Eingabe");
        }
        System.out.println("der Widerstand beträgt " + r + " Ohm und die Toleranz ist " + toleranz + "%");
        
    }

}
