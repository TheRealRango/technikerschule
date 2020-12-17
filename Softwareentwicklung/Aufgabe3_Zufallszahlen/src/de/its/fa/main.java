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
        //int[] zufallszahlen2 = new int[10];
        int anzeigestelle = 0;

        Scanner eingabe = new Scanner(System.in);

        for (int i = 0; i < zufallszahlen.length; i++) {
            anzeigestelle = i + 1;
            System.out.print("Geben Sie die " + anzeigestelle + ". Zahl ein:");
            zufallszahlen[i] = eingabe.nextInt();
        }
        anzeigestelle = 0;
        for (int i = 0; i < zufallszahlen.length; i++) {
            anzeigestelle = i + 1;
            System.out.println("Die " + anzeigestelle + ". Zahl ist " + zufallszahlen[i]);
        }

        for (int i = 0; i < zufallszahlen.length / 2; i++) {
            int temp = 0;
            temp = zufallszahlen[i];
            zufallszahlen[i] = zufallszahlen[zufallszahlen.length - 1 - i];
            zufallszahlen[zufallszahlen.length - 1 - i] = temp;

        }
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < zufallszahlen.length; i++) {
            anzeigestelle = i + 1;
            System.out.println("Die " + anzeigestelle + ". Zahl ist " + zufallszahlen[i]);
        }

    }

}
