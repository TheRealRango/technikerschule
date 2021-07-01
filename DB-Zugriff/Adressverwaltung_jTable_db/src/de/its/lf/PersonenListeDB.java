/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lorenz
 */
public class PersonenListeDB implements PersonenListe {

    private ArrayList<Person> personen = new ArrayList<>();
    private final DBConnector dbCon;

    public PersonenListeDB(DBConnector dbCon) throws SQLException {
        this.dbCon = dbCon;

        readDB();

    }

    private void readDB() throws SQLException {

        
        dbCon.connect();
        
        ResultSet rs = dbCon.query("SELECT customer_id, first_name, last_name, email, create_date from customer;");
        //ResultSet rs = dbCon.stat.getResultSet();
        
       while (rs.next()) { //DAten verarbeiten
                PersonFromDB person = new PersonFromDB();
                person.setCustomer_ID(rs.getInt("customer_ID"));
                person.setFirstName(rs.getString("first_name"));
                person.setLastName(rs.getString("last_name"));
                person.setEmail(rs.getString("email"));
                person.setCreate_date(rs.getString("create_date"));
                personen.add(person);
            }

        
            rs.close();
            dbCon.disconnect();
    }

    @Override
    public void insert(Person person) throws FileNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Person person) throws FileNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Person person) throws FileNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortLastname(SortDirection sortDirection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortFirstname(SortDirection sortDirection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person[] get() {

        Person[] array = new Person[personen.size()];

        return personen.toArray(array);
    }

    @Override
    public ArrayList<Person> getListe() {
        return personen;
    }

}
