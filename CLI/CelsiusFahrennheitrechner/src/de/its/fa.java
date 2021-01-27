/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its;

import java.util.Scanner;
//import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author lorenz
 */
public class fa {

    /**
     * //* @param args the command line arguments
     */
    public static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        // TODO code application logic here

        double celsiuswert, fahrenheitwert;
        System.out.println("Bitte geben Sie den Wert in Celsius ein");
        Scanner eingabe = new Scanner(System.in);
        celsiuswert = eingabe.nextDouble();
        fahrenheitwert = celsiuswert * 1.8 + 32;
        System.out.println(celsiuswert + "℃ Celsius sind " + df2.format(fahrenheitwert) + "F Fahrenheit!");

    }

}
