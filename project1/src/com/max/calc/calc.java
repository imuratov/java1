package com.max.calc;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        double number1;
        double number2;
        double answer;
        char operation;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите 2 цифры: ");
        number1 = reader.nextDouble();
        number2 = reader.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        operation = reader.next().charAt(0);
        switch(operation) {
            case '+': answer = number1 + number2;
                break;
            case '-': answer = number1 - number2;
                break;
            case '*': answer = number1 * number2;
                break;
            case '/': answer = number1 / number2;
                break;
            default: answer = 0.0;
        }
        System.out.print("Результат: ");
        System.out.print(answer);
    }
}
