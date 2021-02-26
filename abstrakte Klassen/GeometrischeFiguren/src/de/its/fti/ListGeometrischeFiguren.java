/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.fti;

import java.util.ArrayList;

/**
 *
 * @author lorenz
 */
public class ListGeometrischeFiguren {

    private ArrayList<GeometrischeFigur> geometrischeFiguren = new ArrayList<>();

    

    public void add(GeometrischeFigur geometrischeFigur) {
        this.geometrischeFiguren.add(geometrischeFigur);
    }

    public GeometrischeFigur[] getGeometrischeFigur() {
        GeometrischeFigur[] array = new GeometrischeFigur[geometrischeFiguren.size()];
        return geometrischeFiguren.toArray(array);
    }

}
