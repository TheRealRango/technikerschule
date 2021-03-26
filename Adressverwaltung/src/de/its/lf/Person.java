/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

/**
 *
 * @author lorenz
 */
public class Person {

    private String firstName;
    private String lastName;
    private int number;
    private String street;
    private String birthDate;
    private int postalCode;
    private String city;
    private String phone;

    public Person(String lineIn) {
        String[] parts = lineIn.split(";");
        firstName = parts[0];
        lastName = parts[1];
        number = Integer.parseInt(parts[2]);
        street = parts[3];
        birthDate = parts[4];
        postalCode = Integer.parseInt(parts[5]);
        city = parts[6];
        phone = parts[7];

    }

    Person() {
        
    }

    @Override
    public String toString() {
        return "Vorname: " + String.valueOf(firstName) + ", Nachname: " + String.valueOf(lastName) + ", Geburtsdatum: " + String.valueOf(birthDate);
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

}
