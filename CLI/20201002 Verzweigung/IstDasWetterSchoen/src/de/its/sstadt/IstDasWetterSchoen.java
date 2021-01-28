package de.its.sstadt;

import java.util.Scanner;

/**
 *
 * @author simon.stadtmueller
 */
public class IstDasWetterSchoen {

    /**"Ja".equals(eingabe) | "ja".equals(eingabe)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner eingabe1 = new Scanner(System.in);
        String eingabe = "Ja";
        
        /**System.out.println("Gib ein, ob das Wetter schön ist (Ja/Nein):");
        eingabe = eingabe1.next();
        */
//        if(eingabe.equalsIgnoreCase("Ja")==true){
        if(eingabe=="Ja"){
            System.out.println("Dann gehen wir schwimmen.");            
        }else{
            System.out.println("(sonst) gehen wir ins Kino.");
        }
        System.out.println("Um 19:00 Uhr treffen wir uns mit Susanne.");
    }
    
}
