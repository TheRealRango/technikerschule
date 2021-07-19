package de.its.sw;

import java.sql.*;

public abstract class DBConnector {

    protected String ip;
    protected int port;
    protected String user;
    protected String password;
    protected String dbName;

    protected Connection con;
    protected ResultSet res;
    protected Statement stat;

    public DBConnector(String ip, int port, String user, String password, String dbName) {
        this.ip = ip;
        this.port = port;
        this.user = user;
        this.password = password;
        this.dbName = dbName;
    }

    public abstract void connect() throws ClassNotFoundException, SQLException;

    public void disconnect() throws SQLException {
        res.close();
        stat.close();
        //con.close();
    }

    public ResultSet query(String sql) throws SQLException {
        if (sql != null) {
            stat = con.createStatement();
            stat.executeQuery(sql);
            res = stat.getResultSet();

            return res;
        } else {
            return null;
        }
    }

    public void querydml(String sql) throws SQLException {
        if (sql != null) {
            stat = con.createStatement();
            stat.executeUpdate(sql);
            
        } else {
            System.out.println("sql Statement is null");
        }
    }
}
