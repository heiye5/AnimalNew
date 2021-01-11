package com.shape;

public class ShapeTest {
    public static void main(String[] args) {
//        Shape shape = new Square(3.2f);
        Shape shape = new Triangle(3.2f,3.2f);

        System.out.println(shape.clacArea());
    }
}
