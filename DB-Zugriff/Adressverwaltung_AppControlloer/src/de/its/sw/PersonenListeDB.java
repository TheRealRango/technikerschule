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
        dBConnector.connect();
        dBConnector.querydml("INSERT INTO customer VALUES (NULL,"
                + "'1',"
                + "'" + person.getFirstName() + "',"
                + "'" + person.getLastName() + "',"
                + "'" + person.getEmail() + "',"
                + "'1','1',NOW(),NOW());");
        dBConnector.disconnect();
    }

    @Override
    public void update(Person person) throws ClassNotFoundException, SQLException {
        dBConnector.connect();
        dBConnector.querydml("UPDATE customer SET first_name=" + "'" + person.getFirstName() + "'"
                + ",last_name=" + "'" + person.getLastName() + "'"
                + ",email=" + "'" + person.getEmail() + "'"
                + " WHERE customer_id =" + person.getCustomer_ID());

        dBConnector.disconnect();
    }

    @Override
    public void delete(Person person) throws ClassNotFoundException, SQLException {
        dBConnector.connect();
        dBConnector.querydml("DELETE FROM customer WHERE customer_id =" + person.getCustomer_ID());
        dBConnector.disconnect();
    }
}
