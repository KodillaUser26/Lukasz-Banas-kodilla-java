package com.kodilla.good.patterns.challenges.airline;

import java.util.Set;

public class Application {
    public Application() {
    }

    public static void main(String[] args) {
        ListOfFight listOfFight = new ListOfFight();
        Set<Flight> lista = listOfFight.getTheList();
        Search search1 = new Search();
        search1.searchFrom();
        System.out.println();
        Search search2 = new Search();
        search2.searchTo(lista, "Gdansk");
        System.out.println();
        Search search3 = new Search();
        search3.searchThrough(lista, "Wroclaw", "Warszawa");
        System.out.println();
    }
}