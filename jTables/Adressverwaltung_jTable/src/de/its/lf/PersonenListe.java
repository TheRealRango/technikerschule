package de.its.lf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface PersonenListe {

    public void insert(Person person) throws FileNotFoundException, IOException;

    public void delete(Person person) throws FileNotFoundException, IOException;

    public void update(Person person) throws FileNotFoundException, IOException;

    public void sortLastname(SortDirection sortDirection);

    public void sortFirstname(SortDirection sortDirection);

    public Person[] get();
    public ArrayList<Person> getListe();
}
