package com.vitaliy.practice.module04.offline041.Practise01.mypackage;

import com.vitaliy.practice.module04.offline041.zoo.Animal;
import com.vitaliy.practice.module04.offline041.zoo.Zoo;


/**
 * Created by vitaliy on 16.02.2017.
 */
public class UseZooFramework {
    public static void main(String[] args) {
        Animal[] myAnimals = new Animal[1];
        myAnimals[0] = new Snake();

        Zoo.feedAllAnimals(myAnimals);
    }
}
