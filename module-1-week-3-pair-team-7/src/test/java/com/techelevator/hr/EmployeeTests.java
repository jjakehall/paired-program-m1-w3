package com.techelevator.hr;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {
    private Map<String, Double> servicesRendered = new HashMap<>();
    Employee employee = new Employee("Frank", "Frankerson");


    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }

    @Test
    public void does_discount_correctly_apply_to_employee_get_balance_given_multiple_inputs(){
        servicesRendered.put("Grooming", 50.00);
        servicesRendered.put("Walking", 20.00);
        servicesRendered.put("Sitting", 30.00);

        double expected = 90.00;
        double actual = employee.getBalanceDue(servicesRendered);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void does_method_return_0_given_empty_map(){
        assertEquals(employee.getBalanceDue(servicesRendered), 0.0, 0.01);
    }

    @Test
    public void does_method_return_correctly_given_no_discountable_service(){
        servicesRendered.put("Grooming", 50.00);
        servicesRendered.put("Sitting", 30.00);
        assertEquals(employee.getBalanceDue(servicesRendered), 80.00, 0.01);
    }
}
