/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author lorenz
 */
public class PersonenListe {

    private ArrayList<Person> personen = new ArrayList<>();

    public void readFile(String fileName) throws FileNotFoundException, IOException {
        String zeile;
        int counter = 0;
        ArrayList<String> fileLine = new ArrayList<>();
        FileInputStream fis = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        while ((zeile = br.readLine()) != null) {
            if (counter++ != 0) {
                personen.add(new Person(zeile));
            }

        }

        fis.close();

    }

    public Person[] getPersonen() {
        Person[] tmp = new Person[personen.size()];

        return personen.toArray(tmp);
    }

}
