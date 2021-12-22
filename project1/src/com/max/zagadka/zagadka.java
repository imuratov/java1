package com.max.zagadka;

import java.util.Scanner;

public class zagadka {
    public static void main(String[] args) {
        String str;
        boolean exit;
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        int count = 0;
        Scanner scan1 = new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.print("Ответ: ");
            str = scan1.nextLine();
            if (str.equalsIgnoreCase("заархивированный вирус")){
                System.out.println("Правильно!");
                break;
            } else if (str.equalsIgnoreCase("подсказка")){
                if (i>0){
                    System.out.println("Подсказка уже недоступна");
                    i--;
                } else {
                    count++;
                    System.out.println("Подсказка: winrar");
                }
            } else if(!str.equalsIgnoreCase("заархивированный вирус")){
                if (count == 1){
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                } else if (i<2) {
                    System.out.println("Подумай еще!");
                }else System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
}

