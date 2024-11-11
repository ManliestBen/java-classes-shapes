package org.example;

public class Shape {
    public double getCircumference() {
        return 0;
    }
    public double getArea() {
        return 0;
    }
    public static String getCircumferenceAndArea(Shape shape) {
        return "The area of the " + shape.getClass().getSimpleName() + " is " + shape.getArea() + " and it has a circumference of " + shape.getCircumference();
    }
}