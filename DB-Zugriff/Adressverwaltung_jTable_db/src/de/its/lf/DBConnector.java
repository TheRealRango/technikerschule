/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lorenz
 */
public abstract class DBConnector {

    protected String ip;
    protected int port;
    protected String user;
    protected String password;
    protected String host;

    protected Connection con = null;
    protected Statement stat = null;
    protected ResultSet rs = null;

    public DBConnector(String ip, int port, String user, String password, String host) {
        this.ip = ip;
        this.port = port;
        this.user = user;
        this.password = password;
        this.host = host;
    }

    public abstract void connect();

    public ResultSet query(String sql) throws SQLException {
        try {
            stat = con.createStatement(); //Statement erzeugen
            stat.executeQuery("SELECT customer_id, first_name, last_name, email, create_date from customer;");
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }

        return stat.getResultSet();
    }

    public void disconnect() throws SQLException {
        stat.close();
        con.close();

    }
}
