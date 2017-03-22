package com.vitaliy.practice.module06.offline06.task061;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitaliy on 09.03.2017.
 */
public class UseShapes {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(new Rectangle(1,3));
        shapeList.add(new Rectangle(3,4));
        shapeList.add(new Rectangle(5,6));
        shapeList.add(new Square(3));
        shapeList.add(new Square(6));
        shapeList.add(new Circle(9));



    }
}
