/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.sstadt;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sstadtmueller
 */
public class PersonenListeFile implements PersonenListe{
    private final ArrayList<Person> personen = new ArrayList<>();
    private File file;
    
    

    public PersonenListeFile(File file) {
        this.file = file;
    }
    
    public void readFile(){
        
        
    }
    
    public void writeFile() throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream("C:\\Users\\loren\\downloads\\se\\Adressen.csv");
        DataOutputStream dos = new DataOutputStream(fos);
        
        for (Person person : personen) {
            dos.writeBytes(person.toFile());
            
        }
        
        fos.close();
    }
    
    
    @Override
    public Person[] get() {
        Person[] tmp = new Person[personen.size()];
        return personen.toArray(tmp);
    }

    @Override
    public void insert(Person person) {
        personen.add(person);
    }

    @Override
    public void update() {
        try {
            writeFile();
        } catch (IOException ex) {
            Logger.getLogger(PersonenListeFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void delete(Person person) {
        personen.remove(person);
    }

    @Override
    public void sort() {
        ComparatorLastName comparatorLastName = new ComparatorLastName();
        personen.sort(comparatorLastName);
    }
    
    
    
}
