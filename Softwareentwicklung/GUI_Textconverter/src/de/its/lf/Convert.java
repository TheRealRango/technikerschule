package de.its.lf;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lorenz
 */
public class Convert {

    public String tolowercase(String eingabe) {         //Public String bedeutet öffentlich udn gibt einen String(ergebnis) zurück    
        String ergebnis;                                //eingabe ist hier der übergabeparameter
        ergebnis = eingabe.toLowerCase();               // neuer String zum zurückgeben
                                                        //schon fertige Mehtode to lowercase wird aufgerufen
        return ergebnis;                                //Ergebnis wird als String zurück gegeben

    }

    public String touppercase(String eingabe) {         //Public String bedeutet öffentlich udn gibt einen String(ergebnis) zurück 
                                                        //eingabe ist hier der übergabeparameter
        String ergebnis;                                // neuer String zum zurückgeben
        ergebnis = eingabe.toUpperCase();               //schon fertige Mehtode to Uppercase wird aufgerufen
        return ergebnis;                                //Ergebnis wird als String zurück gegeben

    }

    public String towin98(String eingabe) {
        String ergebnis = "";
        String[] splitstr = eingabe.split(" ");         //String eingabe wird beim Leerzeichen getrennt und in 
                                                        //einzelne teile in das neue Array splitstr gespeichert

        for (int i = 0; i < splitstr.length; i++) {     //schleife beginnt bei 0 und zählt so lange wie das Array splitstr lang ist
            String first = splitstr[i].substring(0, 1); //in first wird der Teil des Strings von Stelle 0 bis 1 reingeschrieben
            first = touppercase(first);                 //Dieser wird groß geschrieben 

            String rest = splitstr[i].substring(1);     //in rest wird der rest des Strings ab Stelle 1 reingeschrieben 
            rest = tolowercase(rest);                   // Dieser wird klein geschrieben
            splitstr[i] = first + rest;                 //first und rest wird zusammen in ergebnis geschrieben (welchem einem Wort entspricht)
            ergebnis = ergebnis + splitstr[i] + " ";    // die einzelnen Wörter werden mit einem leerzeichen dazwischen zusammengefügt
        }

        return ergebnis;                                //Ergebnis wird als String zurück gegeben

    }

}
