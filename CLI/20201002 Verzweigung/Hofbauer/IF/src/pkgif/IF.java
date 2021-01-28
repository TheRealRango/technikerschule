/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;

/**
 *
 * @author kai.hofbauer
 */
public class IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ist das Wetter schön?");
        //Der boolean beautiful_weather ist auf "false" gestellt, das Wetter ist also NICHT schön.
        boolean beautiful_weather = false;

        if (beautiful_weather) {
            System.out.println("ja");
            System.out.println("dann gehen wir schwimmen");
        } else {
            System.out.println("nein");
            System.out.println("sonst gehen wir ins Kino");
        }
        
        System.out.println("um 19:00 Uhr treffen wir uns mit Susanne");
    }

}
