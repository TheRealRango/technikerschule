/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorenz
 */
public class Fahrzeug extends Vehikel {

    private int sitzanzahl;

    public Fahrzeug() {
        sitzanzahl = 0;
    }

    public void setSitzanzahl(int sitzanzahl) {
        this.sitzanzahl = sitzanzahl;
    }

    @Override
    public String getNachricht() {
        return "sitzanzahl:" + sitzanzahl + "GEwicht" + super.getNachricht();
        //return super.getNachricht(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
      return getNachricht();//To change body of generated methods, choose Tools | Templates.
    }

}
