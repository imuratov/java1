package com.max.neravenstvo;

import java.util.Scanner;

public class neravenstvo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите неравенство: ");
        String neravensto = scanner.next();
        int firstNum = 0;
        int secondNum = 0;
        char operation = neravensto.charAt(1);
        int x = 0;

        if (neravensto.charAt(0) != 'x'){
            firstNum = Character.getNumericValue(neravensto.charAt(0));
            if (neravensto.charAt(2) != 'x') {
                secondNum = Character.getNumericValue(neravensto.charAt(2));
                if (operation == '+')
                    x = firstNum + secondNum;
                else
                    x = firstNum - secondNum;
            }
            else {
                secondNum = Character.getNumericValue(neravensto.charAt(4));
                if (operation == '+')
                    x = secondNum - firstNum;
                else
                    x = firstNum - secondNum;
            }
            }
        else {
            firstNum = Character.getNumericValue(neravensto.charAt(2));
            secondNum = Character.getNumericValue(neravensto.charAt(4));
            if (operation == '+')
                x = secondNum - firstNum;
            else
                x = firstNum + secondNum;
        }

        System.out.println(x);
    }
}
