package de.its.sw;

/**
 *
 * @author Sw
 */
public class Zimmer extends Unterkunft {

    private int anzahlTage;
    private boolean meerblick;
    private static double tagespreis;
    private boolean alsEinzelzimmer;

    public Zimmer(boolean meerblick, int nummer, boolean behindertengerecht) {
        super(nummer, behindertengerecht);
        this.meerblick = meerblick;
    }

    public int getAnzahlTage() {
        return anzahlTage;
    }

    public void setAnzahlTage(int anzahlTage) {
        this.anzahlTage = anzahlTage;
    }

    public boolean isMeerblick() {
        return meerblick;
    }

    public void setMeerblick(boolean meerblick) {
        this.meerblick = meerblick;
    }

    public static double getTagespreis() {
        return tagespreis;
    }

    public static void setTagespreis(double tagespreis) {
        Zimmer.tagespreis = tagespreis;
    }

    public boolean isAlsEinzelzimmer() {
        return alsEinzelzimmer;
    }

    public void setAlsEinzelzimmer(boolean alsEinzelzimmer) {
        this.alsEinzelzimmer = alsEinzelzimmer;
    }

    @Override
    public double uebernachtungspreisBerechnen() {
        double ergebnis = getTagespreis();

        if (isMeerblick()) {
            ergebnis = ergebnis+ 10;
        }
        if (!isAlsEinzelzimmer() && isFruehstueck()) {
            ergebnis = ergebnis + (getFruehstueckspreis() * 2);
        }
        if (isAlsEinzelzimmer() && isFruehstueck()) {
            ergebnis = ergebnis - 30;
            ergebnis = ergebnis + getFruehstueckspreis();
        }
        if (isAlsEinzelzimmer() && !isFruehstueck()) {
            ergebnis = ergebnis - 30;

        }

        ergebnis = ergebnis * getAnzahlTage();

        return ergebnis;
    }

}
