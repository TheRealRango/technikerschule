/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

/**
 *
 * @author lorenz
 */
public class passiv extends Mitglied{
    
    private double spendenbetrag;

    public passiv(double spendenbetrag, int mnr, String name) {
        super(mnr, name);
        this.spendenbetrag = spendenbetrag;
    }

    public double getSpendenbetrag() {
        return spendenbetrag;
    }

    public void setSpendenbetrag(double spendenbetrag) {
        this.spendenbetrag = spendenbetrag;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + "Spendenbetrag" + spendenbetrag + spendenHoehe(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String spendenHoehe(){
        
        if(spendenbetrag <=100){
            return "--> gut";
        }
        else if((spendenbetrag >100) && (spendenbetrag<=1000)){
            return "--> prima";
        }
        else return "--> hervorragend";
    }

    @Override
    public String toString() {
        return showInfo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
