package com.max.stroki;

import java.util.Scanner;

public class stroki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        Integer n = new Integer( scanner.next());
        int max = 0;
        String maxStr = "";
        for (int i = 1; i <= n; i = i+ 1){
            System.out.print("Строка " + i + ": ");
            String j = scanner.next();
            System.out.println(j);
            System.out.println("");
            if (max < j.length()){
                max = j.length();
                maxStr = j;
            }

        }
        System.out.println("Ответ: " + maxStr );
    }
}
