package com.epam.task;

public class Main {
    public static void main(String[] args) {
        Shape[] figures = {
                new Rectangle(11, 18, "red "),
                new Rectangle(10, 9, "blue "),
                new Rectangle(13, 15, "white "),
                new Rectangle(10, 16, "green "),
                new Circle(16, "brown "),
                new Circle(7, "pink "),
                new Circle(11, "orange "),
                new Triangle(15, 8, 10, "yellow "),
                new Triangle(18, 16, 14, "gray ")};
        System.out.println("Figures:");
        printArr(figures);
        System.out.println("Total area = " + sumArea(figures));
    }
    public static void printArr(Shape[] elements) {
        for (Shape element: elements) {
            System.out.println(element.toString() + ", area=" + element.calcArea());
        }
    }
    public static double sumArea(Shape[] elements) {
        double result = 0.0;
        for (Shape element : elements) {
            result += element.calcArea();
        }
        return result;
    }
}


