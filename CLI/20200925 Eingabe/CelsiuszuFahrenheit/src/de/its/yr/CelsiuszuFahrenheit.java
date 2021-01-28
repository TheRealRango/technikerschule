/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.yr;
import java.util.Scanner;
/**
 *
 * @author Rubi
 */
public class CelsiuszuFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celsius, celsiuszufahrenheit;
        System.out.println("Bitte geben sie die Temperatur ein:");
        Scanner eingabe = new Scanner(System.in);
        celsius=eingabe.nextInt();
        celsiuszufahrenheit = celsius * 1.8 + 32;
        System.out.println("Temperatur:" +celsiuszufahrenheit);
        
        
    }
    
}
