package com.shape;

public class Square extends Shape {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float clacArea() {
        return side*side;
    }
}
