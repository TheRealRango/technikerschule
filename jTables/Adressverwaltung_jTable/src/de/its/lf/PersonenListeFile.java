package de.its.lf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class PersonenListeFile implements PersonenListe {

    private final ArrayList<Person> personen = new ArrayList<>();
    private File file;

    public PersonenListeFile(File file) throws IOException {
        this.file = file;
        readFile();

    }

    private void readFile() throws FileNotFoundException, IOException {
        String zeile;
        int counter = 0;
        FileInputStream fis;

        PersonFromFile.setSeparator(";");
        fis = new FileInputStream(file.getAbsolutePath());
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        while ((zeile = br.readLine()) != null) {
            if (counter++ != 0) {
                personen.add(new PersonFromFile(zeile));
            }
        }
        fis.close();
    }

    private void writeFile() throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter output = new BufferedWriter(osw);

        // Writes the string to the file
        output.write("first_name;last_name;number;street;birthdate;postalcode;city;phone");
        for (int i = 0; i < personen.size(); i++) {
            output.newLine();
            output.append(((PersonFromFile) personen.get(i)).toFile());
        }
        // Closes the writer
        output.close();
        osw.close();
        fos.close();
    }

//    public void remove(int i) {
//        this.personen.remove(i);
//    }
//    public void add(Person person) {
//        this.personen.add(person);
//    }
    @Override
    public Person[] get() {
        Person[] tmp = new Person[personen.size()];
        return personen.toArray(tmp);
    }

    @Override
    public void insert(Person person) throws FileNotFoundException, IOException {
        Person tmp = new PersonFromFile(person);
        this.personen.add(tmp);

        writeFile();

    }

    @Override
    public void update(Person person) throws FileNotFoundException, IOException {
        writeFile();
//        this.delete(person);
//        this.insert(person);
    }

    @Override
    public void delete(Person person) throws FileNotFoundException, IOException {
        this.personen.remove(person);

        writeFile();

    }

    @Override
    public void sortLastname(SortDirection sortDirection) {
        LastNameComparator lastNameComperator = new LastNameComparator(sortDirection);
        personen.sort(lastNameComperator);

    }

    @Override
    public void sortFirstname(SortDirection sortDirection) {
        FirstNameComparator firstNameComparator = new FirstNameComparator(sortDirection);
        personen.sort(firstNameComparator);
    }

    @Override
    public ArrayList<Person> getListe() {
        return personen;
    }

}
