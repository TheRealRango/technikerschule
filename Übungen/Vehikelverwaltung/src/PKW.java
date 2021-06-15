/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorenz
 */
public class PKW extends Fahrzeug {

    private int vmax;

    public PKW() {
        vmax = 0;
    }

    public void setVmax(int vmax) {
        this.vmax = vmax;
    }

    @Override
    public String getNachricht() {
        return super.getNachricht(); //To change body of generated methods, choose Tools | Templates.
    }

}
