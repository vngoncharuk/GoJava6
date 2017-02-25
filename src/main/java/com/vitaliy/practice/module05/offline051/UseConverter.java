package com.vitaliy.practice.module05.offline051;

/**
 * Created by vitaliy on 23.02.2017.
 */
public class UseConverter {
    public static void main(String[] args) {

        Converter converter = new Converter(27.1);
        System.out.println("USD: " + converter.convert( 3000));
        System.out.println("USD: " + converter.convert(10000));
        System.out.println("USD: " + converter.convert(100000));

    }
}
