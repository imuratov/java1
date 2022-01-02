package com.max.cikliten;
import java.util.Scanner;

public class cikliten {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Кол-во строк: ");
        int a = scanner.nextInt();
        System.out.print("Кол-во элементов: ");
        int b = scanner.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Строка " + i + " Элемент " + j + " : ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Номер строки массива для вывода");
        int rowNum = scanner.nextInt();
        while (rowNum > (a-1)){
            System.out.println("Такой строки не существует! Введите число меньше " + (a));
            System.out.println("Номер строки массива для вывода");
            rowNum = scanner.nextInt();
        }
            System.out.println(rowNum);
            for (int i = 0; i < array[rowNum].length; i++) {
                System.out.print(array[rowNum][i] * 3 + " ");
            }
    }
}