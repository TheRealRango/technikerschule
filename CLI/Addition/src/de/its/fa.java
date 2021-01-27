/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its;

import java.util.Scanner;

/**
 *
 * @author lorenz
 */
public class fa {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double summand1,summand2,ergebnis;
        System.out.println("Bitte geben Sie den ersten Summanden ein");
        Scanner eingabe = new Scanner(System.in);
        summand1 =eingabe.nextDouble();
        System.out.println("Bitte geben Sie den zweiten Summanden ein");
        summand2 =eingabe.nextDouble();
        ergebnis=summand1+summand2;
        System.out.println("das Ergebnis ist " + ergebnis);
        
    }
    
}
