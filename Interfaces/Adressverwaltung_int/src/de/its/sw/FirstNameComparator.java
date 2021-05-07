/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.sw;

import java.util.Comparator;

/**
 *
 * @author lorenz
 */
public class FirstNameComparator implements Comparator<Person> {

    public static final FirstNameComparator ASC = new FirstNameComparator(true);
    public static final FirstNameComparator DESC = new FirstNameComparator(false);
    private final boolean ascending;

    private FirstNameComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int result;
        if (o1.firstName.compareTo(o2.firstName) < 0) {
            result = -1;

        } else {
            result = 1;
        }

        if (ascending) {
            return result;
        } else {
            return result * -1;
        }
    }

}
