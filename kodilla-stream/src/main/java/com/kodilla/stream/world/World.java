package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> continentList = new ArrayList<>();

    public void addContinents (Continent continent){
        continentList.add(continent);
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public BigDecimal getTotalWorldPopulation (){
        BigDecimal totalWorldPopulation = getContinentList().stream()
                .map(continent -> continent.getContinentPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalWorldPopulation;

    }
}