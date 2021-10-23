package com.max.konvertervalut;

import java.util.Scanner;

import static java.lang.Math.round;

public class valuta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double dolCourse = scanner.nextDouble();
        System.out.print("Введите количество рублей: ");
        double rubCount = scanner.nextDouble();
        System.out.println("Вы можете купить "+ convert(dolCourse,rubCount)+" Доллары.");
    }

    static double convert(double rubCourse, double count){
        return round((count/rubCourse) * 100) / 100D;

    }
}
