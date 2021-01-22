package de.its.sw;

/**
 *
 * @author Sw
 */
public class Unterkunft {

    private int nummer;
    private boolean behindertengerecht;
    private boolean fruehstueck;
    private static double fruehstueckspreis;

    public Unterkunft(int nummer, boolean behindertengerecht) {
        this.nummer = nummer;
        this.behindertengerecht = behindertengerecht;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public boolean isBehindertengerecht() {
        return behindertengerecht;
    }

    public void setBehindertengerecht(boolean behindertengerecht) {
        this.behindertengerecht = behindertengerecht;
    }

    public boolean isFruehstueck() {
        return fruehstueck;
    }

    public void setFruehstueck(boolean fruehstueck) {
        this.fruehstueck = fruehstueck;
    }

    public static double getFruehstueckspreis() {
        return fruehstueckspreis;
    }

    public static void setFruehstueckspreis(double pFruehstueckspreis) {
        fruehstueckspreis = pFruehstueckspreis;
    }
    
    public double uebernachtungspreisBerechnen(){
        return 0;
    }
}
