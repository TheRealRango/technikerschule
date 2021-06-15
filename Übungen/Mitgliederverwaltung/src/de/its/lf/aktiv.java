/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

/**
 *
 * @author lorenz
 */
public class aktiv extends Mitglied {

    private String sportart1;
    private String sportart2;

    public aktiv(String sportart1, String sportart2, int mnr, String name) {
        super(mnr, name);
        this.sportart1 = sportart1;
        this.sportart2 = sportart2;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + "Sportarten:" + sportart1 + "und" + sportart2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return showInfo(); //To change body of generated methods, choose Tools | Templates.
    }

}
