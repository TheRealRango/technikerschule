package de.its.fti1;

import java.util.ArrayList;

/**
 *
 * @author Sw
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person(4711, "Meier", "Franz");
        Festgeldkonto festgeldkonto = new Festgeldkonto(4711, 6, 5000);
        person.addKonto(festgeldkonto);
        Sparkonto sparkonto = new Sparkonto(1.5, 4711);
        sparkonto.addGuthaben(100);
        person.addKonto(sparkonto);

        for (int i = 0; i < person.getKonten().size(); i++) {// über alle Konten iterieren
            Konto konto = person.getKonten().get(i);
            System.out.println(person.getName() + " "
                    + konto.getTyp() + " (Kontostand): "
                    + konto.getGuthaben());
            festgeldkonto.abrechnen();
            System.out.println(person.getName() + " "
                    + konto.getTyp() + " (Kontostand): "
                    + konto.getGuthaben());
        }

    }

}
