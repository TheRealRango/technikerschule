/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.util.Comparator;

/**
 *
 * @author lorenz
 */
public class NameComperator implements Comparator<Mitglied> {
    Sortdirection sortdirection;
    @Override
    
    
    public int compare(Mitglied o1, Mitglied o2) {
        int result;
        if (o1.getName().compareTo(o2.getName()) < 0) {
            result = -1;

        } else {
            result =  1;
        }
        
        if(sortdirection == Sortdirection.DESCEND){
            result = result * -1;
        }
        return result;
    }

    public NameComperator(Sortdirection sortdirection) {
        this.sortdirection = sortdirection;
    }

}
