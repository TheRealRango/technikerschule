package de.its.sw;

public class Person implements Comparable<Person> {

    protected String firstName;
    protected String lastName;
    protected int number;
    protected String street;
    protected String birthDate;
    protected int postalCode;
    protected String city;
    protected String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Vorname: " + String.valueOf(firstName) + ", Nachname: " + String.valueOf(lastName) + ", Geburtsdatum: " + String.valueOf(birthDate);
    }

    @Override
    public int compareTo(Person o) {
        if (this.lastName.compareTo(o.lastName) < 0) {
            return -1;
        } else if (this.lastName.compareTo(o.lastName) == 0) {
            if (this.firstName.compareTo(o.firstName) < 0) {
                return -1;
            } else if (this.firstName.compareTo(o.firstName) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

}
