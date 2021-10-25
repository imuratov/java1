package com.max.massivefiveten;
import java.util.Random;

public class massivefiveten {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        for(int i = 0; i < 15; i = i + 1 ){
            myArray[i] = new Random().nextInt(40) - 20;
        }

        int max = myArray[0];
        int min = myArray[0];

        for(int j = 0; j < 15; j = j + 1){
            if(max < myArray[j])
                max = myArray[j];
            if(min > myArray[j])
                min = myArray[j];
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);
        if (min < 0)
            min = min * -1;


        if (max < 0)
            max = max * -1;

        if(min < max)
            System.out.println(max);
        else
            System.out.println(min);


    }
}
