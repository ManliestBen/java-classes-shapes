package org.example;


public class Main {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(3, 4, 5);
//        System.out.println(myTriangle.getCircumference());
        Circle myCircle = new Circle(5);
//        System.out.println(myCircle.getArea());
//        System.out.println(myCircle.getCircumference());
        Rectangle myRectangle = new Rectangle(3, 5);
//        System.out.println(myRectangle.getArea());
//        System.out.println(myRectangle.getCircumference());
        Square mySquare = new Square(4);
//        System.out.println(mySquare.getArea());
//        System.out.println(mySquare.getCircumference());
        System.out.println(myTriangle.getCircumferenceAndArea(myTriangle));
        System.out.println(myCircle.getCircumferenceAndArea(myCircle));
        System.out.println(myRectangle.getCircumferenceAndArea(myRectangle));
        System.out.println(mySquare.getCircumferenceAndArea(mySquare));
    }
}
