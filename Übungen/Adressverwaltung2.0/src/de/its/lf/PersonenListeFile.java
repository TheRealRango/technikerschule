/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author lorenz
 */
public class PersonenListeFile implements PersonenListe {

    private final ArrayList<Person> personen = new ArrayList<>();

    private File file;

    public PersonenListeFile(File file) {
        this.file = file;
        readFile();
    }

    private void readFile() {
        
    }

    private void writeFile() {

    }

    @Override
    public void insert(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person[] get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
