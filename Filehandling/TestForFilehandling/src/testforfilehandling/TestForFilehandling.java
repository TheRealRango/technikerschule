/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforfilehandling;

import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author lorenz
 */
public class TestForFilehandling {

    /**
     * @param args the command line arguments
     */
    public TestForFilehandling() {
    }

    void schreibeInDatei(String dateiname) {
        RandomAccessFile datei = null;

        try {
            datei = new RandomAccessFile(dateiname, "rw");
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
        try {
            datei.writeChars("Hallo das ist ein test");
            datei.close();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    void leseAusDatei(String dateiname) {
        RandomAccessFile datei = null;
        String zeile = null;
        try {
            datei = new RandomAccessFile(dateiname, "r");
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
        try {
            while ((zeile = datei.readLine()) != null) {
                System.out.println(zeile);
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
        try {
            datei.close();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        (new TestForFilehandling()).schreibeInDatei("c:\\users\\public\\test.txt");
        (new TestForFilehandling()).leseAusDatei("c:\\users\\public\\test.txt");
    }

}
