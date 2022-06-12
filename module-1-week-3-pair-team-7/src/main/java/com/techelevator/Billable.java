package com.techelevator;

import java.util.Map;
import java.util.Set;

public interface Billable {

    double getBalanceDue(Map<String, Double> servicesRendered);



}
