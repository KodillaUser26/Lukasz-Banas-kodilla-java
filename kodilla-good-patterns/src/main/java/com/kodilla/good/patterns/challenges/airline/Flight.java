package com.kodilla.good.patterns.challenges.airline;

public class Flight {
    private String nameAirPortFrom;
    private String nameAirPortTo;

    public String getNameAirPortFrom() {
        return nameAirPortFrom;
    }

    public String getNameAirPortTo() {
        return nameAirPortTo;
    }

    public Flight(String nameAirPortFrom, String nameAirPortTo) {
        this.nameAirPortFrom = nameAirPortFrom;
        this.nameAirPortTo = nameAirPortTo;
    }
    @Override
    public String toString() {
        return "Flight{" +
                "nameAirPortFrom='" + nameAirPortFrom + '\'' +
                ", nameAirPortTo='" + nameAirPortTo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (nameAirPortFrom != null ? !nameAirPortFrom.equals(flight.nameAirPortFrom) : flight.nameAirPortFrom != null)
            return false;
        return nameAirPortTo != null ? nameAirPortTo.equals(flight.nameAirPortTo) : flight.nameAirPortTo == null;
    }

    @Override
    public int hashCode() {
        int result = nameAirPortFrom != null ? nameAirPortFrom.hashCode() : 0;
        result = 31 * result + (nameAirPortTo != null ? nameAirPortTo.hashCode() : 0);
        return result;
    }
}

