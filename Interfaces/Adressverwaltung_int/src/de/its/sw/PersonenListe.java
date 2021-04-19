package de.its.sw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public interface PersonenListe {

    public void insert(Person person) throws FileNotFoundException, IOException;

    public void delete(Person person)  throws FileNotFoundException, IOException;

    public void update(Person person) throws FileNotFoundException, IOException;

    public Person[] get();
//    private final ArrayList<Person> personen = new ArrayList<>();
//
//    public void readFile(String fileName) throws FileNotFoundException, IOException {
//        String zeile;
//        int counter = 0;
//        ArrayList<String> fileLine = new ArrayList<>();
//        FileInputStream fis;
//
//        fis = new FileInputStream(fileName);
//        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//        while ((zeile = br.readLine()) != null) {
//            if (counter++ != 0) {
//                personen.add(new PersonFromFile(zeile));
//            }
//        }
//        fis.close();
//    }
//
//    public Person[] getPersonen() {
//        Person[] tmp = new Person[personen.size()];
//        return personen.toArray(tmp);
//    }
//
//    public void writeFile(String fileName) throws FileNotFoundException, IOException {
//        FileOutputStream fos = new FileOutputStream("output.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        BufferedWriter output = new BufferedWriter(osw);
//
//        // Writes the string to the file
//        output.write("1.Zeile\r\n");
//        output.write("2.Zeile\r\n");
//        output.write("3.Zeile");
//
//        // Closes the writer
//        output.close();
//        osw.close();
//        fos.close();
//    }
//
//    public void remove(int i) {
//        this.personen.remove(i);
//    }
//
//    public void add(Person person) {
//        this.personen.add(person);
//    }
}
