package com.company;

public class Rectangle extends Figure {
    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
    return this.width*this.height;
    }

    @Override
    float getPerimeter() {
    return (this.height+this.width)*2;
    }
}
