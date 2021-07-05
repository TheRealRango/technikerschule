/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lorenz
 */
public class PersonenTableModel extends AbstractTableModel {

    private List<Person> personen;

    public PersonenTableModel(List<Person> personen) {
        this.personen = personen;
    }

    @Override
    public int getRowCount() {

        return personen.size();

    }

    @Override
    public int getColumnCount() {

        return 5;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:

                return ((Person) personen.get(rowIndex)).getCustomer_ID();
            case 1:
                return ((Person) personen.get(rowIndex)).getFirstName();

            case 2:
                return ((Person) personen.get(rowIndex)).getLastName();

            case 3:
                return ((Person) personen.get(rowIndex)).getEmail();
            case 4:
                return ((Person) personen.get(rowIndex)).getCreate_date();
        }
        return "test";

    }

    public void setPersonen(List<Person> personen) {
        this.personen = personen;
    }

    public Person getPerson(int selectedRow) {
        return personen.get(selectedRow);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        boolean erlaubt = false;
        if (columnIndex > 0 && columnIndex < 4) {
            erlaubt = true;
        }
        return erlaubt;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Person person = getPerson(rowIndex);
        if (person != null) {
            switch (columnIndex) {
                case 1:
                    person.setFirstName((String) aValue);
                    break;
                case 2:
                    person.setLastName((String) aValue);
                    break;
                case 3:
                    person.setEmail((String) aValue);
                    break;
            }
        }
    }

    @Override
    public String getColumnName(int index) {
        String[] title = {"ID", "Vorname", "Nachname", "EMail", "Date"};
        return title[index];
    }

}
