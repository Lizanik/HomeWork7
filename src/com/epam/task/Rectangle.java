package com.epam.task;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return super.toString() + "width=" + width + "height=" + height;
    }
}