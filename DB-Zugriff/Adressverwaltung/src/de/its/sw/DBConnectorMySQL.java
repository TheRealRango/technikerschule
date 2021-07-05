package de.its.sw;

import java.sql.*;

public class DBConnectorMySQL extends DBConnector {

    public DBConnectorMySQL(String ip, int port, String user, String password, String dbName) throws ClassNotFoundException, SQLException {
        super(ip, port, user, password, dbName);
    }

    @Override
    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + dbName, user, password);
    }
}
