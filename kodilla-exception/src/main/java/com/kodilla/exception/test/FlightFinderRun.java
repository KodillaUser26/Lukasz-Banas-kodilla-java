package com.kodilla.exception.test;

public class FlightFinderRun {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Moscow", "Paris"));
        } catch (RouteNotFoundException e) {

        } finally {
            System.out.println("Searching again");
        }
    }

}