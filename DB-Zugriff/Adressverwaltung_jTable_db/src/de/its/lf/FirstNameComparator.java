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
public class FirstNameComparator implements Comparator<Person> {

    private SortDirection sortDirection;

    public FirstNameComparator(SortDirection sortDirection) {
        this.sortDirection = sortDirection;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int result;
        if (o1.getFirstName().compareTo(o2.getFirstName()) < 0) {
            result = -1;
            

        } else {
            result = 1;
        }

        if (this.sortDirection == SortDirection.ASCEND) {
            return result;
        } else {
            return result * -1;
        }
    }

}
