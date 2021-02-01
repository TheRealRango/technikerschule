/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.util.*;

/**
 *
 * @author lorenz
 */
public class Person {

    private int personID;
    private String name;
    private String vorname;
    private double gehalt;

    private List<Konto> konten;

    public Person(int personID, String name, String vorname, double Gehalt) {
        this.personID = personID;
        this.name = name;
        this.vorname = vorname;
        this.gehalt = gehalt;
        konten = new ArrayList<Konto>();

    }

    public void addKonto(Konto k) {
        
        konten.add(k);

    }

    public List getKonto() {
        return konten;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

}
