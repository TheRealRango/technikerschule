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
            land.setiD(Integer.parseInt(rs.getString("country_id")));
            land.setBezeichnung(rs.getString("country"));
            laenderListe.add(land);
            
        }
        return laenderListe;
    }

}
