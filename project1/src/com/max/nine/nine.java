package com.max.nine;
import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double array[] = new double[size];

        System.out.println("Вводите значения для заполнения массива");
        for (int i=0;i<array.length;i++){
            array[i] = scan.nextDouble();
        }
        double average = 0;
        double sum = 0;
        for (int i=0;i<array.length;i++){
            sum +=array[i];
        }
        average = sum/array.length;

        System.out.println("Массив умноженный на средн.арифметическое ");
        for(int i=0;i<array.length;i++){
            System.out.print(String.format("%.2f",array[i]*average) + " ");
        }
    }
}
