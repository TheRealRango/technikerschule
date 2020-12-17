/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

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
        double eiereingabe = 1;
        int counter = 0;
        Scanner eingabe = new Scanner(System.in);
        while (eiereingabe != 0) {
            System.out.println("Bitte geben Sie das Gewicht ein");
            eiereingabe = eingabe.nextDouble();
            if (eiereingabe > 0 & eiereingabe < 45) {
                System.out.println("Dieses Ei ist Klasse C");
                counter++;
            } else if (eiereingabe > 0 & eiereingabe < 55) {
                System.out.println("Dieses EI ist Klasse b");
                counter++;
            } else if (eiereingabe == 0) {
                System.out.println("Vielen DAnk für die VErwendung");

            } else {
                System.out.println("Dieses EI ist Klasse A");
                counter++;
            }

        }
        //counter = counter - 1;
        System.out.println("Es wurden insgesamt" + counter + "Eier gezählt");
    }

}
