package com.vitaliy.practice.myTest.test04;

/**
 * Created by vitaliy on 18.02.2017.
 */
public class Inheritant extends FatherInheritant{
    @Override
    void voice() {
        System.out.println("Voice new");
    }

    public static void main(String[] args) {
        Inheritant inheritantNew = new Inheritant();

        inheritantNew.voice();


    }


}
