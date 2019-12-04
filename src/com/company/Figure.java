package com.company;

public abstract class Figure {
    float x;
    float y;

    protected Figure() {
    }

    abstract double getArea();
    abstract float getPerimeter();
    Figure (float x, float y){
        this.x = x;
        this.y = y;
    }
}
