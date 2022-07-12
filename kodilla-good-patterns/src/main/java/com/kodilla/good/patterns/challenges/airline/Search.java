package com.kodilla.good.patterns.challenges.airline;

import java.io.PrintStream;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Search {


    public void searchTo(Set<Flight> theList, String nameAirPort) {
        Stream<Flight> flightListTo = theList.stream()
                .filter((l) -> l.getNameAirPortTo().equals(nameAirPort));
        PrintStream flightListAll = System.out;
        flightListTo.forEach(flightListAll::println);
    }

    public void searchFrom() {

    }

    public void searchThrough(Set<Flight> theList, String nameAirPort1, String nameAirPort2) {
        Set<Flight> list1 = theList.stream().filter((l) -> l.getNameAirPortFrom().equals(nameAirPort1)).collect(Collectors.toSet());
        Set<Flight> list2 = theList.stream().filter((l) -> l.getNameAirPortTo().equals(nameAirPort2)).collect(Collectors.toSet());

        for (Flight flight1 : list1) {

            for (Flight flight2 : list2) {
                if (flight1.getNameAirPortTo().equals(flight2.getNameAirPortFrom())) {
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }

    }
}