package de.its.sstadt;

import java.util.Scanner;

/**
 *
 * @author simon.stadtmueller
 */
public class Rechner_R_P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Rechnung;
        double R;
        double P;
        double U;
        double I;
        
        Scanner userinput = new Scanner(System.in);
        
        System.out.println("Was möchten Sie berechnen? Widerstand oder Leistung (R/P)");
        Rechnung = userinput.next();
        
        System.out.println("Geben Sie die Spannung (U) ein: ");
        U = userinput.nextDouble();
        
        System.out.println("Geben Sie die Stromstärke (I) ein: ");
        I = userinput.nextDouble();
        
        
        if (("Widerstand".equalsIgnoreCase(Rechnung)) || ("R".equalsIgnoreCase(Rechnung))){
            R = U / I;
            System.out.println("Der Widerstand ist: " + R);
        }else if("Leistung".equalsIgnoreCase(Rechnung) || "P".equalsIgnoreCase(Rechnung)){
            P = U * I;
            System.out.println("Die Leistung ist: " + P);
        }else{
            System.out.println("Falsche eingabe");
        }
        
        
    }
    
}
