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
public class Wecker extends Uhr {
   private Zeit weckzeit = new Zeit(0, 0);

    public Wecker(Zeit zeit, Zeit weckzeit) {
        super(zeit);
        this.weckzeit = weckzeit;
    }

    @Override
    public String getAusgabe() {
        if(super.isSommerzeit() == true){
            return super.getAusgabe() + "Weckzeit:" + weckzeit.getStunde() +1 + ":" + weckzeit.getMinute() ;
        }
        return super.getAusgabe() + "Weckzeit:" + weckzeit.getStunde() + ":" + weckzeit.getMinute() ;  //To change body of generated methods, choose Tools | Templates.
    }
    
       
        
    

    

    
 
    
}
