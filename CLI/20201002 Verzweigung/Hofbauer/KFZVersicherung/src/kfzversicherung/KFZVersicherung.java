/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kfzversicherung;

import java.util.Scanner;

/**
 *
 * @author kai.hofbauer
 */
public class KFZVersicherung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        byte age;
        short kilometer_year;
        double basic_amount;
        double bonus;
        double full_amount;
        
        Scanner user_input = new Scanner(System.in);

        System.out.println("Befindet sich das KFZ in einer Garage? Ja/Nein");
        String in_garage = user_input.next();
        System.out.println("Bitte geben Sie Ihr Alter an.");
        age = user_input.nextByte();
        System.out.println("Bitte die Jährliche Kilometerleistung angeben.");
        kilometer_year = user_input.nextShort();
        System.out.println("Bitte geben Sie den Grundbetrag ein.");
        basic_amount = user_input.nextDouble();
        bonus = 0;

        if (age <= 25) {
            bonus = basic_amount * 40 / 100;
        } else {
            bonus = bonus - (basic_amount * 10 / 100);
        }

        if (Math.round(kilometer_year) > 15000) {
            full_amount = basic_amount + bonus + (basic_amount * 20 / 100);
        } else {
            full_amount = basic_amount + bonus - (basic_amount * 10 / 100);
        }

        if (in_garage.equals("Ja")) {
            full_amount = full_amount - (basic_amount * 5 / 100);
        } else {
            full_amount = full_amount + (basic_amount * 5 / 100);
        }
        System.out.println("Der Grundbetrag addiert mit dem Zuschlag beträgt: " + (double)Math.round((basic_amount + bonus) * 100)/100);
        System.out.println("Der Gesamtbetrag beträgt: " + (double)Math.round((full_amount) * 100)/100);
    }

}
