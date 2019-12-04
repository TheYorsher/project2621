package com.company;

public class Circle extends Figure {
    private float radius;
    private float width;
    private float height;
    public Circle(float x, float y, float radius) {
        this.width = x;
        this.height = y;
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    float getPerimeter() {
        return 0;
    }
}
