/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20201009elektorechnerroeder;

/**
 *
 * @author troed
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variablendeklaration
        Scanner nutzereingabe = new Scanner(System.in);
        char roderp = 0;
        double rohm = 0;
        double pwatt = 0;
        double uvolt = 0;
        double iampere = 0;
        
        
        //Abfragen
        System.out.println("Suchen Sie R oder P?");
        System.out.println("Eingabe R/P");
        roderp = nutzereingabe.nextLine().charAt(0);
        System.out.println("Geben sie die Volt ein");
        uvolt = nutzereingabe.nextDouble();
        System.out.println("Geben Sie die Ampere ein");
        iampere = nutzereingabe.nextDouble();
        
        if ('P' == roderp) {
          rohm = uvolt / iampere;
            System.out.println("Der Widerstand beträgt " + rohm + "Ohm");
        }
        if ('R' == roderp){
            pwatt = uvolt * iampere;
            System.out.println("Die Leistung beträgt " + pwatt + "Watt");
        }
        
        if (('R' != roderp) && ('P' != roderp) && ('p' != roderp)) {
            System.out.println("Bitte überprüfen Sie Ihre Eingabe");
        }
    }
    
}
