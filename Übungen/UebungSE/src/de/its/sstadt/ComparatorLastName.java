/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.sstadt;

import java.util.Comparator;

/**
 *
 * @author lorenz
 */
public class ComparatorLastName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getLastName().compareTo(o2.getLastName()) < 0) {
            return -1;
        } else if (o1.getLastName().compareTo(o2.getLastName()) > 0) {
            return 1;
        } else {
            return 0;
        }

    }

}
