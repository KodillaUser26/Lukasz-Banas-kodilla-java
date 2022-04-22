package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private final static String name = "Triangle";
    private double base = 20;
    private double height = 110.5;
    private double area = (base * height) / 2;

    public Triangle(double base, double height, double area) {
        this.base = base;
        this.height = height;
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.base, base) == 0 && Double.compare(triangle.height, height) == 0 && Double.compare(triangle.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height, area);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return area;
    }
}