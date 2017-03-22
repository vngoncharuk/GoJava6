package com.vitaliy.practice.module06;

/**
 * Created by vitaliy on 13.03.2017.
 */
public class ArraysUtils {
    public static void sum(int array[]){
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        System.out.println("Сумма всех элементов массива: " + summ);
    }
    public static void min(int array[]){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                continue;
            }
        }
        System.out.println("Минимальное значение среди элементов массива: " + min);
    }
    public static void max(int array[]){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                continue;
            }
        }
        System.out.println("Максимальное значение среди всех элементов массива: " + max);
    }
    public static void maxPositive(int array[]){
        int maxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                continue;
            else if (array[i] > maxPositive)
                maxPositive = array[i];
            else maxPositive = 0;
        }
        if (maxPositive != 0) {
            System.out.println("Максимальное позитивное число в массиве: " + maxPositive);
        } else System.out.println("В массиве нет максимального позитивного значения!");
    }
    public static void multiplication  (int array[]){
        int multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        System.out.println("Произведение всех элементов массива: " + multiplication);
    }
    public static void modulus(int array[]){
        int modulusOfFirstElement = Math.abs(array[0]);
        int modulusOfLastElement = Math.abs(array[array.length-1]);
        System.out.println("Модуль первого элемента массива: " + modulusOfFirstElement);
        System.out.println("Модуль последнего элемента массива: " + modulusOfLastElement);
    }
    public static void secondLargest(int array[]){
        int firstLargest = array[0];
        int secondLargest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > firstLargest) {
                firstLargest = array[i];
                continue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == firstLargest) {
                continue;
            } else if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        System.out.println("Второй по величине элемент массива: " + secondLargest);
    }

    public static int[] reverse(int[] array) {
        return array;
    }
    public static int[] findEvenElements(int[] array){
        return array;
    }

}
