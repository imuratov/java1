package com.max.eleven;
import java.util.Scanner;

public class eleven {
    public static void main(String args [ ])
    {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = string1.replace(" ",  "");
        String p = "\\d+";
        if (string2.matches(p)){
            System.out.println("Введите второе число:");
            int a  = scanner.nextInt();
            int b = Integer.parseInt(string2);
            int resultInt = Math.max(a,b);
            System.out.println("Большее число: " + resultInt);
            double resultDouble = Math.min(a,b);
            System.out.println("Меньшее число: " + resultDouble);
        }
        else System.out.println("Введен некорректный символ");
    }
}
