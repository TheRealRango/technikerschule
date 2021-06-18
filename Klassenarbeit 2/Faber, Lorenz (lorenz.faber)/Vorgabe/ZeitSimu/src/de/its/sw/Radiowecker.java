/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.sw;

/**
 *
 * @author lorenz.faber
 */
public class Radiowecker extends Wecker{
    
    int senderFreq;
    public Radiowecker(Zeit zeit, Zeit weckzeit,int senderFreq) {
        super(zeit, weckzeit);
    }

    public void setSenderFreq(int senderFreq) {
        this.senderFreq = senderFreq;
    }

    @Override
    public String getAusgabe() {
        return super.getAusgabe() + "khz: "+ senderFreq; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
