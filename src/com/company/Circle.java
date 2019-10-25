package com.company;

public class Circle {
    private double radius;

    public Circle(int r) {
        radius = r;
    }
    public double Area() {
        double A = Math.PI*(radius*radius);
        return A;
    }
    public double Circumference() {
        double C = Math.PI*2*radius;
        return C;
    }
}