package com.vitaliy.practice.module06.offline06.task061;

/**
 * Created by vitaliy on 09.03.2017.
 */
public class Circle extends Shape {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
