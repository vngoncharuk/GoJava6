package com.vitaliy.practice.module02.Task021;

/**
 * Created by Vitaliy on 31.01.2017.
 */
public class ArrayModificator {

    public static void main(String[] args) {

        //double[] simpleArray = {2, 5, -1, 10, -6, 15, -4, -3, 18, -1};
        int[] simpleArray = {2, 5, -1, 10, -6, 15, -4, -3, 18, -1};

        ArrayModificator onlyObjectForTest = new ArrayModificator();

        onlyObjectForTest.sumAllElementsInArray(simpleArray);
        onlyObjectForTest.minFromArray(simpleArray);
        onlyObjectForTest.maxInArray(simpleArray);
        onlyObjectForTest.maxPositiveInArray(simpleArray);
        onlyObjectForTest.multiplicationAllElementsInArray(simpleArray);
        onlyObjectForTest.modulusFisrtAndLastElementOfArray(simpleArray);
        onlyObjectForTest.secondLargestElementInArray(simpleArray);

    }
    public void sumAllElementsInArray(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        System.out.println("Сумма всех элементов массива: " + summ);
    }
    public void sumAllElementsInArray(double[] array) {
        double summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        System.out.println("Сумма всех элементов массива: " + summ);
    }
    public void minFromArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
             if (array[i] < min) {
                    min = array[i];
                    continue;
            }
        }
        System.out.println("Минимальное значение среди элементов массива: " + min);
    }
    public void minFromArray(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                continue;
            }
        }
        System.out.println("Минимальное значение среди элементов массива: " + min);
    }
    public void maxInArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                continue;
            }
        }
        System.out.println("Максимальное значение среди всех элементов массива: " + max);
    }
    public void maxInArray(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                continue;
            }
        }
        System.out.println("Максимальное значение среди всех элементов массива: " + max);
    }
    public void maxPositiveInArray(int[] array) {
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
    public void maxPositiveInArray(double[] array) {
        double maxPositive = 0;
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
    public void multiplicationAllElementsInArray(int[] array) {
        int multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        System.out.println("Произведение всех элементов массива: " + multiplication);
    }
    public void multiplicationAllElementsInArray(double[] array) {
        double multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        System.out.println("Произведение всех элементов массива: " + multiplication);
    }
    public void modulusFisrtAndLastElementOfArray(int[] array) {
        int modulusOfFirstElement = Math.abs(array[0]);
        int modulusOfLastElement = Math.abs(array[array.length-1]);
        System.out.println("Модуль первого элемента массива: " + modulusOfFirstElement);
        System.out.println("Модуль последнего элемента массива: " + modulusOfLastElement);
    }
    public void modulusFisrtAndLastElementOfArray(double[] array) {
        double modulusOfFirstElement = Math.abs(array[0]);
        double modulusOfLastElement = Math.abs(array[array.length-1]);
        System.out.println("Модуль первого элемента массива: " + modulusOfFirstElement);
        System.out.println("Модуль последнего элемента массива: " + modulusOfLastElement);
    }
    public void secondLargestElementInArray(int[] array) {
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
    public void secondLargestElementInArray(double[] array) {
        double firstLargest = array[0];
        double secondLargest = array[0];
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
}
