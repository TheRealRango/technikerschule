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
public class LastNameComparator implements Comparator<Person> {

    private SortDirection sortDirection;

    LastNameComparator(SortDirection sortDirection) {
        this.sortDirection = sortDirection;
    }



    @Override
    public int compare(Person o1, Person o2) {
        int result;
        if (o1.getLastName().compareTo(o2.getLastName()) < 0) {
            result = -1;
        } else if (o1.getLastName().compareTo(o2.getLastName()) == 0) {
            result = o1.getFirstName().compareTo(o2.getFirstName());
        } else {
            result = 1;
        }
        if (sortDirection==SortDirection.ASCEND) {
            return result;
        } else {
            return result * -1;
        }

    }

}
