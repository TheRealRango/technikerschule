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
        double messwert[] = new double[64];
        double eingang, toleranz;
        int counter;

        Scanner eingabe = new Scanner(System.in);
        eingang = -1;
        counter = 0;

        while (counter < 64 & eingang != 0) {
            System.out.println("Geben sie die" + counter + 1 + ".Zahl ein");
            eingang = eingabe.nextDouble();
            messwert[counter] = eingang;
            counter++;
        }
        counter = 0;
        while (counter < 64 & eingang != 0) {
            System.out.println(messwert[counter]);
            counter = counter + 1;
        }
        while (counter < 64 & messwert[counter]!=0){
            
        }

    }

}
