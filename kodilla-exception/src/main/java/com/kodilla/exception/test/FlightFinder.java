package com.kodilla.exception.test;


import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("abc", true);
        flightMap.put("abcd", true);
        flightMap.put("ab", true);
        flightMap.put("abcde", true);
        flightMap.put("abcdef", false);

        Boolean departureAirport = flightMap.get(flight.getDepartureAirport());
        Boolean arrivalAirport = flightMap.get(flight.getArrivalAirport());
        if(arrivalAirport == null || !arrivalAirport){
            throw new RouteNotFoundException("No flight"  + flight);
        }
        if(departureAirport == null || !departureAirport){
            throw new RouteNotFoundException("No flight: " + flight);
        }
        System.out.println("Flight found: " + flight);
    }
}