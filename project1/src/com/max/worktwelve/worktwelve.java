package com.max.worktwelve;

import java.util.Scanner;

public class worktwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean containsJava = str.contains("Java");
        boolean startsWith = str.startsWith("I like");
        boolean endsWith = str.endsWith("!!!");

        if (containsJava && startsWith && endsWith)
            System.out.println(str.toUpperCase());

        str = str.replaceAll("a", "o");

        if (str.contains("Jovo")){
            int index = str.indexOf("Jovo");
            System.out.println(str.substring(index, index+4));
        }

    }
}
