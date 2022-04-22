package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    public final static String name = "Square";
    private double obSguare;

    public Square(double obSguare) {
        this.obSguare = obSguare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.obSguare, obSguare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(obSguare);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(obSguare, 2);
    }

}