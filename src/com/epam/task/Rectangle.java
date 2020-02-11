package com.epam.task;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
        public double getWidth() { 
        return width; 
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeigth() {
        return height; 
    }
    public void setHeigth(double heigth) {
        this.height = heigth; 
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
