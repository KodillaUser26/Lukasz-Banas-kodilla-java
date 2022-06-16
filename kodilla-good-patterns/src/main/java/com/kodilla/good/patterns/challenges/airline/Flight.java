package com.kodilla.good.patterns.challenges.airline;

public class Flight {
    private String nameAirPortFrom;
    private String nameAirPortTo;

    public Flight(String nameAirPortFrom, String nameAirPortTo) {
        this.nameAirPortFrom = nameAirPortFrom;
        this.nameAirPortTo = nameAirPortTo;
    }

    public String getNameAirPortFrom() {
        return this.nameAirPortFrom;
    }

    public String getNameAirPortTo() {
        return this.nameAirPortTo;
    }

    public String toString() {
        return "AirPortFrom='" + this.nameAirPortFrom + '\'' + ", AirPortTo='" + this.nameAirPortTo + '\'';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Flight flight = (Flight)o;
            if (this.nameAirPortFrom != null) {
                if (this.nameAirPortFrom.equals(flight.nameAirPortFrom)) {
                    return this.nameAirPortTo != null ? this.nameAirPortTo.equals(flight.nameAirPortTo) : flight.nameAirPortTo == null;
                }
            } else if (flight.nameAirPortFrom == null) {
                return this.nameAirPortTo != null ? this.nameAirPortTo.equals(flight.nameAirPortTo) : flight.nameAirPortTo == null;
            }

            return false;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.nameAirPortFrom != null ? this.nameAirPortFrom.hashCode() : 0;
        result = 31 * result + (this.nameAirPortTo != null ? this.nameAirPortTo.hashCode() : 0);
        return result;
    }
}
