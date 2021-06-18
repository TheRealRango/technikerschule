/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.sw;

import java.util.Comparator;

/**
 *
 * @author lorenz.faber
 */
public class TimeComparator implements Comparator<Zeit> {

    @Override
    public int compare(Zeit t, Zeit t1) {
        if (t.getStunde() < t1.getStunde()) {
            return -1;
        } else if (t.getStunde() > t1.getStunde()) {
            return 1;
        } else {
            if (t.getMinute() < t1.getMinute()) {
                return -1;
            } else if (t.getMinute() > t1.getMinute()) {
                return 1;
            }
        }

        return 0;
    }

}
