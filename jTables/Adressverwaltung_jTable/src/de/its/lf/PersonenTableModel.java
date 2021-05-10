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

        return 2;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return personen.get(rowIndex).getFirstName();
            case 1:
                return personen.get(rowIndex).getLastName();
        }
        return "test";

    }
    @Override
    public String getColumnName (int index){
        String [] title = {"Vorname", "Nachname"};
        return title[index];
    }
}
