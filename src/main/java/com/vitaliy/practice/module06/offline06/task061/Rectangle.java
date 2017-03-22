package com.vitaliy.practice.module06.offline06.task061;

/**
 * Created by vitaliy on 09.03.2017.
 */
public class Rectangle extends Shape {

    private final double a;
    private final double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    double getArea() {
        return a * b;
    }
}
