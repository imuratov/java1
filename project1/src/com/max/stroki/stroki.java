package com.max.stroki;
import java.util.Scanner;


public class stroki {
    public static void main(String args [ ])
    {
        System.out.print("Количество строк: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String [] strArray = new String[a];
        int [] intArray = new int[a];
        scanner.nextLine();
        for (int i = 0;i < strArray.length;i++){
            System.out.print("Строка "+(i + 1)+" : ");
            strArray[i] = scanner.nextLine();
        }
        System.out.print("Ответ: ");
        int counter = 0;
        int counter1 = 0;
        for (int i = 0;i < strArray.length;i++) {
            counter = 0;
            char[] chArray = strArray[i].toCharArray();
            for (int j = 0;j < chArray.length;j++){
                counter1 = 0;
                for (int k = 0;k<chArray.length;k++){
                    if (chArray[j] == chArray[k]){
                        counter1 += 1;
                    }if (counter1 > 1){
                        counter += 1;
                    }
                    intArray[i] = counter;
                }
            }

        }
        int min = intArray[0];
        for (int i = 0;i < intArray.length;i++){
            if (intArray[i] < min){
                min = intArray[i];
            }
        }
        int counter2 = 0;
        for(int i = 0;i < intArray.length;i++){
            if(intArray[i] == min){
                counter2 += 1;
            }
        }
        for (int i = 0;i < intArray.length;i++){
            if (intArray[i] == min){
                System.out.print(strArray[i]);
                if (counter2 > 1){
                    break;
                }
            }
        }
    }
}