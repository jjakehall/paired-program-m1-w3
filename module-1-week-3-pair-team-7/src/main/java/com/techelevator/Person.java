package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Person {

    private String firstName;
    private String lastName;
    private String email;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalanceDue(Map<String, Double> servicesRendered) {

        double sumOfServices = 0.0;
        Set<String> services = servicesRendered.keySet();
        for (String service : services){
            sumOfServices += servicesRendered.get(service);
        }
        return sumOfServices;
    }

}

