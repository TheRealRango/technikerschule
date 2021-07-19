/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorenz
 */
public class StaedteListeDB implements StaedteListe {

    private DBConnector dBConnector;

    public StaedteListeDB(DBConnector dBConnector) {
        this.dBConnector = dBConnector;
    }

    @Override
    public List<Stadt> get(int country_ID) throws ClassNotFoundException, SQLException {
        dBConnector.connect();

        List<Stadt> staedteListe = new ArrayList<>();
        ResultSet rs = dBConnector.query("SELECT * from city  WHERE country_id =" + country_ID);
        

        while (rs.next()) {
            Stadt stadt = new Stadt();
            stadt.setCity_ID(Integer.parseInt(rs.getString("city_id")));
            stadt.setCity_Bezeichnung(rs.getString("city"));
            staedteListe.add(stadt);
        }
        
        
        dBConnector.disconnect();
        return staedteListe;
    }

    @Override
    public Stadt[] getArray(int country_ID) throws ClassNotFoundException, SQLException {
        List<Stadt> staedteliste = get(country_ID);
        Stadt[] array = new Stadt[staedteliste.size()];
        return staedteliste.toArray(array);
    }

    @Override
    public void insert(Stadt stadt)  {
        try {
            dBConnector.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StaedteListeDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StaedteListeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            dBConnector.querydml("INSERT INTO `sakila`.`city` (`city_id`, `city`, `country_id`, `last_update`) VALUES ('601', 'Ostrach', '38', '2021-02-14 04:45:23');");
        } catch (SQLException ex) {
            Logger.getLogger(StaedteListeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }

    @Override
    public void update(Stadt stadt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Stadt stadt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Stadt> get() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
