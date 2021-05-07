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
public class LastNameComparator implements Comparator<Person> {

    public static final LastNameComparator ASC = new LastNameComparator(true);
    public static final LastNameComparator DESC = new LastNameComparator(false);
    private final boolean ascending;

    private LastNameComparator(boolean ascending) {
        this.ascending = ascending;
    }



    @Override
    public int compare(Person o1, Person o2) {
        int result;
        if (o1.lastName.compareTo(o2.lastName) < 0) {
            result = -1;
        } else if (o1.lastName.compareTo(o2.lastName) == 0) {
            result = o1.firstName.compareTo(o2.firstName);
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
