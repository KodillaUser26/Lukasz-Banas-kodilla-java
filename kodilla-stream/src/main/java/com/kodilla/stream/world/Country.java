package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final String countryName;
    private final BigDecimal peopleQuantityOfCountry;

    public Country(String countryName, BigDecimal peopleQuantityOfCountry) {
        this.countryName = countryName;
        this.peopleQuantityOfCountry = peopleQuantityOfCountry;
    }

    public BigDecimal getPeopleQuantityOfCountry() {
        return peopleQuantityOfCountry;
    }
}
