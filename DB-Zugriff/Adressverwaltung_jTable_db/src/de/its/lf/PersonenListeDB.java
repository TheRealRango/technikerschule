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

    public PersonenListeDB() {
      readDB();
    }

    private void readDB()  {
        Connection con = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);

        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://10.201.9.202:3306/sakila", "lorenz", "lorenz123");
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }

        try {
            stat = con.createStatement(); //Statement erzeugen
            stat.executeQuery("SELECT customer_id, first_name, last_name, email, create_date from customer;");
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }

        try {
            rs = stat.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }

        try {
            while (rs.next()) { //DAten verarbeiten
                PersonFromDB person = new PersonFromDB();
                person.setCustomer_ID(rs.getInt("customer_ID"));
                person.setFirstName(rs.getString("first_name"));
                person.setLastName(rs.getString("last_name"));
                person.setEmail(rs.getString("email"));
                person.setCreate_date(rs.getString("create_date"));
                personen.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }
        try { // Resultset schließen
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }
        try { // Statement schließen
            stat.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }
        try { // Verbindung schließen
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }
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
