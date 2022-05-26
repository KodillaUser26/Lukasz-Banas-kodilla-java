package com.kodilla.exception.test;

public class FlightFinderRun {

    public static void main(String[] args) {
        Flight flight1 = new Flight("abcde", "abcd");
        Flight flight2 = new Flight("abc", "ab");
        Flight flight3 = new Flight("ab", "ba");
        Flight flight4 = new Flight("abcd", "abcdef");

        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            flightFinder.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            flightFinder.findFlight(flight4);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}