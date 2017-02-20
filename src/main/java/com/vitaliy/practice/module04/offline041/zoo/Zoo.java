package com.vitaliy.practice.module04.offline041.zoo;

import com.vitaliy.practice.module04.offline041.zoo.bird.Owl;
import com.vitaliy.practice.module04.offline041.zoo.mammal.Elephant;
import com.vitaliy.practice.module04.offline041.zoo.mammal.Monkey;

import java.util.Arrays;

/**
 * Created by vitaliy on 16.02.2017.
 */
public class Zoo {
    public static void main(String[] args) {
        Animal[] animalsArray = new Animal[2];

        animalsArray[0] = new Monkey();
        animalsArray[1] = new Elephant();

        Owl owlGalya = new Owl();
        animalsArray = addElementToArray(animalsArray, owlGalya);

        feedAllAnimals(animalsArray);
    }

    private static Animal[] addElementToArray(Animal[] animalsArray, Owl owlGalya) {
        Animal[] newAnimals = Arrays.copyOf(animalsArray, animalsArray.length +1);
        newAnimals[animalsArray.length-2]= owlGalya;
        return new Animal[0];
    }

    public static void feedAllAnimals(Animal[] animalsArray) {
        for (Animal animal : animalsArray){
            animal.feed();
        }
    }
}
