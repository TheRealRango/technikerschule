/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorenz
 */
public class Vehikel {

    private float gewicht;

    public Vehikel() {
        gewicht =0;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }
    
    public String getNachricht(){
       
        return String.valueOf(gewicht);
    }

    @Override
    public String toString() {
        return String.valueOf(gewicht); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
