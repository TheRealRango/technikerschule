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

    private String ip;
    private int port;
    private String user;
    private String password;
    private String host;

    private Connection con = null;
    private Statement stat = null;
    private ResultSet rs = null;

    public DBConnector(String ip, int port, String user, String password, String host) {
        this.ip = ip;
        this.port = port;
        this.user = user;
        this.password = password;
        this.host = host;
    }

    private void connect() {

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

    }

    public ResultSet query(String sql) {
        return null;
    }

    private void disconnect() {
        try { // Verbindung schließen
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }
    }
}
