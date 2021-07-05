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
    private int customer_ID;
    private int store_ID;
    private String email;
    private int address_ID;
    private int active;
    private String create_date;
    private String last_update;

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    public int getStore_ID() {
        return store_ID;
    }

    public void setStore_ID(int store_ID) {
        this.store_ID = store_ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAddress_ID() {
        return address_ID;
    }

    public void setAddress_ID(int address_ID) {
        this.address_ID = address_ID;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    
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
    public int compareTo(Person p) {

        if (this.lastName.compareTo(p.lastName) < 0) {
            return -1;
        } else if (this.lastName.compareTo(p.lastName) == 0) {
            if (this.firstName.compareTo(p.firstName) < 0) {
                return -1;
            } else if (this.firstName.compareTo(p.firstName) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }

    }
}
