package org.example;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle (double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getCircumference() {
        return (2 * height) + (2 * width);
    }

}
