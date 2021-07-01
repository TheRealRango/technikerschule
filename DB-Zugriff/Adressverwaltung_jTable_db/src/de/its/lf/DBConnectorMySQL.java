/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author lorenz
 */
public class DBConnectorMySQL extends DBConnector {

    public DBConnectorMySQL(String ip, int port, String user, String password, String host) {
        super(ip, port, user, password, host);
    }

    @Override
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);

        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://10.201.9.202:3306/sakila", "lorenz", "lorenz123");
            //con = DriverManager.getConnection("jdbc:mysql://" + this.ip + ":" + this.port + "/" + this.host, this.user, this.password);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fehler" + ex.getMessage(), "test", JOptionPane.ERROR_MESSAGE);
        }

    }

}
