package de.its.lf;

//public class Person implements Comparable<Person> {
public class Person {

    private String lastName;
    private String firstName;
    private int customer_ID;
    private int store_ID;
    private String email;
    private int address_ID;
    private int active;
    private String create_date;
    private String last_update;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

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
    
    
    

    @Override
    public String toString() {
        return "Vorname: " + String.valueOf(firstName) + ", Nachname: " + String.valueOf(lastName);
    }

//    @Override
//    public int compareTo(Person o) {
//        if (this.lastName.compareTo(o.lastName) < 0) {
//            return -1;
//        } else if (this.lastName.compareTo(o.lastName) == 0) {
//            if (this.firstName.compareTo(o.firstName) < 0) {
//                return -1;
//            } else if (this.firstName.compareTo(o.firstName) == 0) {
//                return 0;
//            } else {
//                return 1;
//            }
//        } else {
//            return 1;
//        }
//    }
}
