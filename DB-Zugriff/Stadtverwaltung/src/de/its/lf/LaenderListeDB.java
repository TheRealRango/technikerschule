/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lorenz
 */
public class LaenderListeDB implements LaenderListe {

    private DBConnector dBConnector;

    public LaenderListeDB(DBConnector dBConnector) {
        this.dBConnector = dBConnector;
    }

    @Override
    public List<Land> get() throws ClassNotFoundException, SQLException {
        dBConnector.connect();

        List<Land> laenderListe = new ArrayList();
        ResultSet rs = dBConnector.query("SELECT * from country");
        
        while (rs.next()){
            Land land = new Land();
            land.setCountry_ID(Integer.parseInt(rs.getString("country_id")));
            land.setCountry_Bezeichnung(rs.getString("country"));
            laenderListe.add(land);
            
        }
        dBConnector.disconnect();
        return laenderListe;
    }
    
    public Land[] getArray() throws ClassNotFoundException, SQLException {
        List<Land> laenderListe = get();
         Land[] array = new Land[laenderListe.size()];
        return laenderListe.toArray(array);
    }
    
    
    

    @Override
    public void insert(Land land) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Land land) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Land land) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
