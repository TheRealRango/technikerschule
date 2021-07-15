/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.util.List;
import java.sql.SQLException;
/**
 *
 * @author lorenz
 */
public interface LaenderListe {
    
    public List<Land> get() throws ClassNotFoundException, SQLException;
    
}
