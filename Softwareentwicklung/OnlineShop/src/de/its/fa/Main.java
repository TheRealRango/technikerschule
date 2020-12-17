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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bitte geben Sie den Benutzernamen ein");
        String benutzername;
        Scanner eingabe=new Scanner(System.in);
        benutzername=eingabe.next();
        System.out.println("Hallo "+benutzername+"!");
        
    }
    
}
