package com.epam.task;

public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calcArea() {
        return (Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (c + b - a))) / 4.0;
    }

    @Override
    public String toString() {
        return super.toString() + "a=" + a + "b=" + b + "c=" + c;
    }
}
