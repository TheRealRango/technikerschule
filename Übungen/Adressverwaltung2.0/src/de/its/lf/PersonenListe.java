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
public interface PersonenListe {
    
    public Person[] get();
    public void insert(Person person);
    public void update(Person person);
    public void delete(Person person);
    
}
