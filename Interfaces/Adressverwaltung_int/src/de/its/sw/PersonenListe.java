package de.its.sw;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface PersonenListe {

    public void insert(Person person) throws FileNotFoundException, IOException;

    public void delete(Person person) throws FileNotFoundException, IOException;

    public void update(Person person) throws FileNotFoundException, IOException;

    public void sortLastname(int ascending);
    public void sortFirstname(int ascending);

    public Person[] get();
}
