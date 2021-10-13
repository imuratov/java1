package com.max.test;


public class test {
    public static void main(String[] args) {
        int[] myArray1 = {2, 3, 11, 9, 1};
        int myArray2 = myArray1[0];
        myArray1[0] = myArray1[myArray1.length-1];
        myArray1[myArray1.length-1] = myArray2;
        int sum = myArray1[0] + myArray1[(myArray1.length-1)/2];
        System.out.println("Сумма 1го и среднего: " + sum);

    }
}

