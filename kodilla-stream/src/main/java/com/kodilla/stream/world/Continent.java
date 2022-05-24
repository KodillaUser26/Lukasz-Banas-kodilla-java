package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final String continentName;
    private final List<Country> countries = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public BigDecimal getContinentPeopleQuantity() {
        BigDecimal continentPopulation = getCountries().stream()
                .map(country -> country.getPeopleQuantityOfCountry())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return continentPopulation;

    }

    public List<Country> getCountries() {
        return countries;
    }
}