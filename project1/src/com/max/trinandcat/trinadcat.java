package com.max.trinandcat;
import java.util.Scanner;

public class trinadcat {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] array = str.split("\\s+");

        for (int i = 0; i < array.length; i++) {
            boolean Alphabet = array[i].matches("^[a-zA-Z]+$");
            if (Alphabet) {
                count = count + 1;
                System.out.println(array[i]);
            }
        }
        System.out.println("Кол-во слов: " + count);
    }
}
