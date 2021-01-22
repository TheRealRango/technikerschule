package de.its.sw;

/**
 *
 * @author Sw
 */
public class AppController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Unterkunft.setFruehstueckspreis(8);
        Zimmer.setTagespreis(85);
        Ferienwohnung.setWochenPreis(685);
        Ferienwohnung.setEndreinigung(40);
        
        Zimmer zimmer1 = new Zimmer(true, 13, true);
        zimmer1.setAnzahlTage(7);
        zimmer1.setAlsEinzelzimmer(true);
        System.out.println("Gesamtpreis Zimmer" + zimmer1.uebernachtungspreisBerechnen());
        
        Ferienwohnung wohung1 = new Ferienwohnung(4, 4711, false);
        wohung1.setAnzahlWochen(2);
        System.out.println("Gesammtpreis: Ferienwohnung " + wohung1.uebernachtungspreisBerechnen() + " Euro");
    }
    
}
