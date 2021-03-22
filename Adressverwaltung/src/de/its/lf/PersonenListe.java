/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.util.ArrayList;

/**
 *
 * @author lorenz
 */
public class PersonenListe {
    
    private ArrayList<Person> personen  = new ArrayList<>();
    
    
    public void add(Person person){
        this.personen.add(person);
    }
    
    
    public void readFile(String fileName){
        
    }

    public Person getPerson(){
        
        //????
        return null;
    }
    
}
