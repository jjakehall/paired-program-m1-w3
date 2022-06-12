package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomerTests {
    Map<String, Double> servicesRendered = new HashMap<>();
    Customer name = new Customer("Frank", "Burns", "9899899898");

    @Test
    public void doesGetBalanceDueReturnService() {
        servicesRendered.put("Grooming", 50.00);
        servicesRendered.put("Walking", 20.00);
        servicesRendered.put("Sitting", 30.00);

        double expected = 100.00;
        double actual = name.getBalanceDue(servicesRendered);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void does_method_return_0_given_empty_map(){
        assertEquals(name.getBalanceDue(servicesRendered), 0.0, 0.01);
    }

    @Test
    public void does_method_return_correctly_given_one_service(){
        servicesRendered.put("Sitting", 30.00);
        assertEquals(name.getBalanceDue(servicesRendered), 30.0, 0.01);
    }




}
