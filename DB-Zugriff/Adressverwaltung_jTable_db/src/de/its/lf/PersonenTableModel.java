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

    @Override
    public String getColumnName(int index) {
        String[] title = {"ID", "Vorname", "Nachname", "EMail", "Date"};
        return title[index];
    }

}
