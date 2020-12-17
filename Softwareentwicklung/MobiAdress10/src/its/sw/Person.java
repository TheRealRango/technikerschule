package its.sw;

public class Person {

    private String vorname;
    private String nachname;
    private String klasse;
    private int plz;
    private String ort;
    private String gebdatum;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String newVorname) {
        this.vorname = newVorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String newNachname) {
        this.nachname = newNachname;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String newKlasse) {
        this.klasse = newKlasse;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int newPlz) {
        this.plz = newPlz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String newOrt) {
        this.ort = newOrt;
    }

    public String getGebdatum() {
        return gebdatum;
    }

    public void setGebdatum(String newGebdatum) {
        this.gebdatum = newGebdatum;
    }
}
