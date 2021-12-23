package com.max.operat;
import java.util.Scanner;

public class operat {
    public static void main(String[] args) {
        int array[] = new int[3];
        double sum = 0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите три числа ");
        for (int i = 0;i < 3;i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0;i < array.length;i++){
            sum = sum + array[i];
        }
        average = sum/array.length;
        System.out.println("Среднее арифметическое = " + average);
        average = average/2;
        double avg = Math.floor(average);
        if (avg > 3)
            System.out.println("Программа выполнена корректно ");

    }
}
