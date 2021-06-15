/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorenz
 */
public class LKW extends Fahrzeug{
    
    private float zuladung;

    public LKW() {
        zuladung =0;
    }

    public void setZuladung(float zuladung) {
        this.zuladung = zuladung;
    }

    @Override
    public String getNachricht() {
        return super.getNachricht(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
