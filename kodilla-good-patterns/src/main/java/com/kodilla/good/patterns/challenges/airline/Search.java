package com.kodilla.good.patterns.challenges.airline;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Search {
    public Search() {
    }

    public void searchTo(Set<Flight> theList, String nameAirPort) {
        Stream var10000 = theList.stream().filter((l) -> {
            return l.getNameAirPortTo().equals(nameAirPort);
        });
        PrintStream var10001 = System.out;
        var10000.forEach(var10001::println);
    }

    public void searchFrom(Set<Flight> theList, String nameAirPort) {
        Stream var10000 = theList.stream().filter((l) -> {
            return l.getNameAirPortFrom().equals(nameAirPort);
        });
        PrintStream var10001 = System.out;
        var10000.forEach(var10001::println);
    }

    public void searchThrough(Set<Flight> theList, String nameAirPort1, String nameAirPort2) {
        Set<Flight> list1 = (Set)theList.stream().filter((l) -> {
            return l.getNameAirPortFrom().equals(nameAirPort1);
        }).collect(Collectors.toSet());
        Set<Flight> list2 = (Set)theList.stream().filter((l) -> {
            return l.getNameAirPortTo().equals(nameAirPort2);
        }).collect(Collectors.toSet());
        Iterator var6 = list1.iterator();

        while(var6.hasNext()) {
            Flight flight1 = (Flight)var6.next();
            Iterator var8 = list2.iterator();

            while(var8.hasNext()) {
                Flight flight2 = (Flight)var8.next();
                if (flight1.getNameAirPortTo().equals(flight2.getNameAirPortFrom())) {
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }

    }
}