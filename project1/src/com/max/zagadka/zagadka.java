package com.max.zagadka;

import java.util.Scanner;

public class zagadka {
    public static void main (String [] args) {
        String answer;
        boolean exit;
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner inputAnswer = new Scanner (System.in);

        exit = false;
        for(int i = 1; i <= 3; i++){
            answer = inputAnswer.next();
            switch (answer){
                case ("Заархивированный вирус"):
                    System.out.println ("Правильно!");
                    break;
                case ("Подсказка"):
                    if (i == 1){
                        exit = true;
                        System.out.println("winrar");
                    }
                    else
                        System.out.println("Подсказка уже недоступна");
                default:
                    if ((i==3) || ((exit == true) && (i != 1))) {
                        System.out.println("Обидно, приходи в другой раз");
                        i = 3;
                        break;
                    }
                    else
                        System.out.println("Подумай еще!");
            }
        }
    }
}

