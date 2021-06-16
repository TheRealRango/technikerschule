/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.sstadt;

/**
 *
 * @author sstadtmueller
 */
public class PersonFromFile extends Person{
    
    private static String separator;
    
    public PersonFromFile(String lineIn){
        
    }
    
    public String toFile(){
        return "weiß noch nicht was hier passiert";
    }

    public static String getSeparator() {
        return separator;
    }

    public static void setSeparator(String separator) {
        PersonFromFile.separator = separator;
    }
    
    
    
    
    
}
