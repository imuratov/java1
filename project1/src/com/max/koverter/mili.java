package com.max.koverter;
import java.util.Scanner;

public class mili {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - массу, 2 - расстояние");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        boolean a1 = false;
        boolean a2 = false;
        switch (a){
            case 1: a1 = true;
                break;
            case 2: a2 = true;
                break;
            default:
                System.out.println("Введен некорректный символ!");
        }
        if (a1 == true){
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна");
            int b = scan.nextInt();
            boolean b1 = false;
            boolean b2 = false;
            boolean b3 = false;
            boolean b4 = false;
            switch (b){
                case 1: b1 = true;
                    break;
                case 2: b2 = true;
                    break;
                case 3: b3 = true;
                    break;
                case 4: b4 = true;
                    break;
                default:
                    System.out.println("Введен некорректный символ!");
            }
            System.out.println("Введите число");
            double c = scan.nextInt();
            if (b1 == true){
                System.out.printf("Результат:\nГрамм: "+c+"\nКилограмм: "+c/1000+"\nЦентнер: "+c/100000+"\nТонны: "+c/1000000);
            } else if (b2 == true){
                System.out.println("Результат:\nГрамм: "+c*1000+"\nКилограмм: "+c+"\nЦентнер: "+c/100+"\nТонны: "+c/1000);
            } else if (b3 == true){
                System.out.println("Результат:\nГрамм: "+c*100000+"\nКилограмм: "+c*100+"\nЦентнер: "+c+"\nТонны: "+c/10);
            } else if (b4 == true){
                System.out.println("Результат:\nГрамм: "+c*1000000+"\nКилограмм: "+c*1000+"\nЦентнер: "+c*10+"\nТонны: "+c);
            }
        } else if (a2 == true){
            System.out.println("Выберите единицу измерения: 1 - Сантиметр, 2 - Дециметр, 3 - Метр, 4 - Киллометр");
            int b = scan.nextInt();
            boolean b1 = false;
            boolean b2 = false;
            boolean b3 = false;
            boolean b4 = false;
            switch (b){
                case 1: b1 = true;
                    break;
                case 2: b2 = true;
                    break;
                case 3: b3 = true;
                    break;
                case 4: b4 = true;
                    break;
                default:
                    System.out.println("Введен некорректный символ!");
            }
            System.out.println("Введите число");
            double c = scan.nextInt();
            if (b1 == true){
                System.out.println("Результат:\nСантиметр: "+c+"\nДециметр: "+c/10+"\nМетр:"+c/100+"\nКилометр: "+c/100000);
            } else if (b2 == true){
                System.out.println("Результат:\nСантиметр: "+c*10+"\nДециметр: "+c+"\nМетр: "+c/10+"\nКилометр: "+c/10000);
            } else if (b3 == true){
                System.out.println("Результат:\nСантиметр: "+c*100+"\nДециметр: "+c*10+"\nМетр: "+c+"\nКилометр: "+c/1000);
            } else if (b4 == true){
                System.out.println("Результат:\nСантиметр: "+c*100000+"\nДециметр: "+c*10000+"\nМетр: "+c*1000+"\nКилометр: "+c);
            }
        }
    }
}