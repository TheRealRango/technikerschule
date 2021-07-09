package de.its.sw;

import java.sql.SQLException;
import java.util.List;

public interface PersonenListe {

    public List<Person> get() throws ClassNotFoundException, SQLException;

    public void insert(Person person) throws ClassNotFoundException, SQLException;

    public void update(Person person) throws ClassNotFoundException, SQLException;

    public void delete(Person person) throws ClassNotFoundException, SQLException;
}
