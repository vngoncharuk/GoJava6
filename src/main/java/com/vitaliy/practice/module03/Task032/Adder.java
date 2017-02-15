package com.vitaliy.practice.module03.Task032;

/**
 * Created by vitaliy on 15.02.2017.
 */
public class Adder extends Arithmetic {

    static boolean check(Integer a, Integer b) {
        boolean result = true;
        if (a>=b) {
            return result;
        } else result = false;
        return result;
    }
}