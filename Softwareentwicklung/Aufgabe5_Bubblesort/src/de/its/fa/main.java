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
        int[] zufallszahlen = new int[10];
        int[] zufallszahlensortiert = new int[10];
        int anzeigestelle, temp;

        Scanner eingabe = new Scanner(System.in);

        for (int i = 0; i < zufallszahlen.length; i++) {
            anzeigestelle = i + 1;
            System.out.print("Geben Sie die " + anzeigestelle + ". Zahl ein:");
            zufallszahlen[i] = eingabe.nextInt();
        }
        System.out.println("---------------------------------------------------------------");
        anzeigestelle = 0;
        for (int i = 0; i < zufallszahlen.length; i++) {
            anzeigestelle = i + 1;
            System.out.println("Die " + anzeigestelle + ". Zahl ist " + zufallszahlen[i]);
        }
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < zufallszahlen.length - 1; i++) {
            for (int j = 0; j < (zufallszahlen.length - i - 1); j++) {

                if (zufallszahlen[j] > zufallszahlen[j + 1]) {
                    temp = zufallszahlen[j];
                    zufallszahlen[j] = zufallszahlen[j + 1];
                    zufallszahlen[j + 1] = temp;

                }

            }
        }
        anzeigestelle = 0;
        System.out.println("Array wurde sortiert");
        for (int i = 0; i < zufallszahlen.length; i++) {
            anzeigestelle = i + 1;

            System.out.println("Die " + anzeigestelle + ". Zahl ist " + zufallszahlen[i]);

        }
    }

}
