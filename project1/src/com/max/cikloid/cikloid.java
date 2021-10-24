package com.max.cikloid;
import java.util.Scanner;

public class cikloid {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<= n; i++){
            sum = sum + i;
        }
        System.out.println (sum);
    }
}
