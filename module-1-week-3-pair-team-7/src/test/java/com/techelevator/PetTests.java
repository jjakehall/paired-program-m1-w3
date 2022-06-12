package com.techelevator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PetTests {
//Pet cat = new Pet();
    Pet cat = new Pet("Betsy", "feline");
    List<String> betsyVaccinations = new ArrayList<>();
    @Test
    public void listVaccinations() {
        betsyVaccinations.add("Rabies");
        betsyVaccinations.add("Distemper");
        betsyVaccinations.add("Parvo");

        cat.setVaccinations(betsyVaccinations);
        assertEquals("Rabies, Distemper, Parvo", cat.listVaccinations());

    }

    @Test
    public void does_list_vaccinations_work_if_list_size_is_1(){
        betsyVaccinations.add("Rabies");
        cat.setVaccinations(betsyVaccinations);
        assertEquals("Rabies", cat.listVaccinations());
    }

    @Test
    public void does_empty_list_return_empty_string(){
        cat.setVaccinations(betsyVaccinations);
        assertEquals("", cat.listVaccinations());
    }

}
