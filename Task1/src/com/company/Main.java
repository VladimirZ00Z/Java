package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Задача 1
        System.out.println("Упражнение 1");
	    System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        System.out.println();

        //Задача 2
        System.out.println("Упражнение 2");
        double result1 = (46+10)*(10d/3);
        System.out.println(result1);
        double result2 = (29)*(4)*(-15);
        System.out.println(result2);

        System.out.println();

        //Задача 3
        System.out.println("Упражнение 3");
        int number = 10500;
        int result3 = (number/10)/10;
        System.out.println(result3);

        System.out.println();

        //Задача 4
        System.out.println("Упражнение 4");
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result4 = a*b*c;
        System.out.println(result4);

        System.out.println();

        //Задача 5
        System.out.println("Упражнение 5");
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int numb1 = scan.nextInt();
        System.out.println("Введите второе число");
        int numb2 = scan.nextInt();
        System.out.println("Введите третье число");
        int numb3 = scan.nextInt();
        System.out.println(numb1);
        System.out.println(numb2);
        System.out.println(numb3);

        //Задача 6
        System.out.println("Упражнение 6");
        System.out.println("Введите число");
        Scanner scanb = new Scanner(System.in);
        double numb = scanb.nextInt();
        if (numb % 2 == 0 && numb < 101) {
            System.out.println("Четное");
        } else if (numb % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
        if (numb % 2 != 0) {
            System.out.println(numb);
        }
    }
}
