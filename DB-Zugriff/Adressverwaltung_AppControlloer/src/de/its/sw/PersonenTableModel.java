package de.its.sw;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PersonenTableModel extends AbstractTableModel {

    private List<Person> personen;

    public PersonenTableModel(List<Person> personen) {
        this.personen = personen;
    }

    public void setPersonen(List<Person> personen) {
        this.personen = personen;
    }

    @Override
    public int getRowCount() {
        return personen.size();
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Person person = getPerson(rowIndex);
        if (person != null) {
            switch (columnIndex) {
                case 2:
                    person.setFirstName((String) aValue);
                    break;
                case 3:
                    person.setLastName((String) aValue);
                    break;
                case 4:
                    person.setEmail((String) aValue);
                    break;
            }
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return personen.get(rowIndex).getCustomer_ID();
            case 1:
                return personen.get(rowIndex).getStore_ID();
            case 2:
                return personen.get(rowIndex).getFirstName();
            case 3:
                return personen.get(rowIndex).getLastName();
            case 4:
                return personen.get(rowIndex).getEmail();
            case 5:
                return personen.get(rowIndex).getAddress_ID();
            case 6:
                return personen.get(rowIndex).getActive();
            case 7:
                return personen.get(rowIndex).getCreate_date();
            case 8:
                return personen.get(rowIndex).getLast_update();
        }
        return "Fehler";
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public String getColumnName(int index) {
        String[] title = {"Customer_ID", "Store_ID", "First_name", "Last_Name", "Email", "address_id", "active", "create_date", "last_update"};
        return title[index];
    }

    public Person getPerson(int selectedRow) {
        return personen.get(selectedRow);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        boolean erlaubt = false;
        if (columnIndex > 1 && columnIndex < 5) {
            erlaubt = true;
        }
        return erlaubt;
    }

}
