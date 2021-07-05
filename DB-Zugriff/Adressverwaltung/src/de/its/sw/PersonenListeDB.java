package de.its.sw;

import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class PersonenListeDB implements PersonenListe {

    private DBConnector dBConnector;

    public PersonenListeDB(DBConnector dBConnector) {
        this.dBConnector = dBConnector;
    }

    @Override
    public List<Person> get() throws ClassNotFoundException, SQLException {
        dBConnector.connect();

        List<Person> personen = new ArrayList<>();
        ResultSet rs = dBConnector.query("Select * from customer");

        while (rs.next()) {
            Person person = new Person();
            person.setFirstName(rs.getString("first_name"));
            person.setCustomer_ID(Integer.parseInt(rs.getString("customer_id")));
            person.setStore_ID(Integer.parseInt(rs.getString("store_id")));
            person.setLastName(rs.getString("last_name"));
            person.setEmail(rs.getString("email"));
            person.setAddress_ID(Integer.parseInt(rs.getString("address_id")));
            person.setActive(Integer.parseInt(rs.getString("active")));
            person.setCreate_date(rs.getString("create_date"));
            person.setLast_update(rs.getString("last_update"));

            personen.add(person);

        }
        return personen;
    }

    @Override
    public void insert(Person person) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Person person) throws ClassNotFoundException, SQLException {
         
        
        
    }

    @Override
    public void delete(Person person) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
