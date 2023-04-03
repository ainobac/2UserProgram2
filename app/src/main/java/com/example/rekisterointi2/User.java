package com.example.rekisterointi2;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    protected String firstName;
    protected String lastName;
    protected String email;
    protected String degreeProgram;
    protected ArrayList degrees;

    public User(String firstName, String lastName, String email, String degreeProgram, ArrayList degrees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.degrees = degrees;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public ArrayList getDegrees() {
        return degrees;
    }

}
