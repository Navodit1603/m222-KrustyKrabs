package com.example.sping_portfolio.controllers;

public class Contact {
//created private methods in Contact class
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Contact()
    {

    }

    public Contact(String firstName, String lastName, String phoneNumber, String email) {
    //create an attribute
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ",phoneNumber" + phoneNumber + ",email" + email + "]";
    }

}
