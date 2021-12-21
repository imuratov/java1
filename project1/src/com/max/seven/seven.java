package com.max.seven;
import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        {
            System.out.println("Заполните массив, вводя значения с клавиатуры");
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == x) {
                    System.out.println("Данное значение имеется в константах");
                    break;
                } else if (array[i] == y) {
                    System.out.println("Данное значение имеется в константах");
                    break;
                } else if (array[i] == z) {
                    System.out.println("Данное значение имеется в константах");
                    break;
                }
            }
        }
    }
}