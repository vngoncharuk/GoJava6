package com.vitaliy.practice.module02.Task021;

/**
 * Created by Vitaliy on 31.01.2017.
 */
public class Simple {

    public static void main(String[] args) {

        int[] simpleArray = {2, 5, -1, 10, -6, 15, -4, -3, 18, -1};

        Simple sumArray = new Simple();
        Simple minFromArray = new Simple();
        Simple maxFromArray = new Simple();
        Simple maxPositiveFromArray = new Simple();
        Simple multiplicationOfArray = new Simple();
        Simple modulusOfFirstAndLastEllementOfArray = new Simple();
        Simple secondLargestInArray = new Simple();

        System.out.println("Сумма всех элементов массива: " + sumArray.sumAllElementsInArray(simpleArray));
        System.out.println("Минимальное число массива: " + minFromArray.minFromArray(simpleArray));
        System.out.println("Максимальное число массива: " + maxFromArray.maxInArray(simpleArray));
        maxPositiveFromArray.maxPositiveInArray(simpleArray);
        System.out.println("Произведение всех чисел массива: " + multiplicationOfArray.multiplicationAllElementsInArray(simpleArray));
        modulusOfFirstAndLastEllementOfArray.modulusFisrtAndLastElementOfArray(simpleArray);
        System.out.println("Второе по величине число в массиве: " + secondLargestInArray.secondLargestElementInArray(simpleArray));


    }
    //return summ of all elements in int array
    public int sumAllElementsInArray(int[] array) {

        int summ = 0;

        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        //System.out.println("Сумма всех элементов массива: " + summ);
        return summ;
    }
    //return summ of all elements in double array
    public double sumAllElementsInArray(double[] array) {

        double summ = 0;

        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        return summ;
    }
    //return min value from all elements in int array
    public int minFromArray(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {

             if (array[i] < min) {
                    min = array[i];
                    continue;
            }
        }
        return min;
    }
    //return min value from all elements in double array
    public double minFromArray(double[] array) {
        double min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                continue;
            }
        }
        return min;
    }
    //return max value from all elements in int array
    public int maxInArray(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                continue;
            }
        }
        return max;
    }
    //return max value from all elements in double array
    public double maxInArray(double[] array) {
        double max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                continue;
            }
        }
        return max;
    }
    //show message with maxPositive value in int array. If there's no positive values it shows msg about that.
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
    //show message with maxPositive value in double array. If there's no positive values it shows msg about that.
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
    //return multiplication of all elements in int array
    public int multiplicationAllElementsInArray(int[] array) {
        int multiplication = array[0];

        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        return multiplication;
    }
    //return multiplication of all elements in double array
    public double multiplicationAllElementsInArray(double[] array) {
        double multiplication = array[0];

        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        return multiplication;
    }
    //show msg with modulus of the first & last element in int array
    public void modulusFisrtAndLastElementOfArray(int[] array) {
        int modulusOfFirstElement = Math.abs(array[0]);
        int modulusOfLastElement = Math.abs(array[array.length-1]);

        System.out.println("Модуль первого элемента массива: " + modulusOfFirstElement + ".");
        System.out.println("Модуль последнего элемента массива: " + modulusOfLastElement + ".");
    }
    //show msg with modulus of the first & last element in double array
    public void modulusFisrtAndLastElementOfArray(double[] array) {
        double modulusOfFirstElement = Math.abs(array[0]);
        double modulusOfLastElement = Math.abs(array[array.length-1]);

        System.out.println("Модуль первого элемента массива: " + modulusOfFirstElement + ".");
        System.out.println("Модуль последнего элемента массива: " + modulusOfLastElement + ".");
    }
    //return second largest element in int array
    public int secondLargestElementInArray(int[] array) {
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
        return secondLargest;
    }
    //return second largest element in double array
    public double secondLargestElementInArray(double[] array) {
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
        return secondLargest;
    }
}
