package com.kodilla.good.patterns.challenges.airline;

import java.util.HashSet;
import java.util.Set;

public class ListOfFight {
    private Set<Flight> theList = new HashSet();

    public ListOfFight() {
        this.theList.add(new Flight("Gdansk", "Warszawa"));
        this.theList.add(new Flight("Krakow", "Poznan"));
        this.theList.add(new Flight("Gdansk", "Wroclaw"));
        this.theList.add(new Flight("Poznan", "Warszawa"));
        this.theList.add(new Flight("Wroclaw", "Poznan"));
        this.theList.add(new Flight("Gdansk", "Warszawa"));
        this.theList.add(new Flight("Wroclaw", "Gdansk"));
    }

    public Set<Flight> getTheList() {
        return new HashSet(this.theList);
    }
}
