package Ex4;

import java.util.Arrays;
import java.util.Scanner;

//задание 1
public class Cycles {
    public static void taskOne() {
        System.out.println("\nЗадание один");
        int i = 1;
        while (i <= 99) {
            System.out.println(i);
            i += 2;
        }
    }

    //задание 2
    public static void taskTwo() {
        System.out.println("\nЗадание два");
        System.out.print("Деление на 3: \n");
        int i = 3;
        while (i <= 100) {
            System.out.print(i + ", ");
            i += 3;
        }

        System.out.print("\nДелится на 5: \n");
        i = 5;
        while (i <= 100) {
            System.out.print(i + ", ");
            i += 5;
        }
        System.out.print("\nДелится и на 3,и на 5: \n");
        i = 15;
        while (i <= 100) {
            System.out.print(i + ", ");
            i += 15;
        }
    }

    //задание 3
    public static boolean taskThree() {
        System.out.println("\nЗадание три");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        System.out.print("Введите второе число: ");
        int second = in.nextInt();
        System.out.print("Введите третье число: ");
        int third = in.nextInt();
        if (first + second == third) {
            return true;
        }
        return false;
    }

    //задание 4
    public static boolean taskFor() {
        System.out.println("\nЗадание четыре");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        System.out.print("Введите второе число: ");
        int second = in.nextInt();
        System.out.print("Введите третье число: ");
        int third = in.nextInt();
        if (first < second && second < third) {
            return true;
        }
        return false;
    }

    //задание 5
    public static boolean taskFive() {
        System.out.println("\nЗадание пять");
        int[] arrayOne = new int[]{3, -3, 7, 4, 5, 4, 3};
        System.out.println("array = " + Arrays.toString(arrayOne));
        if (arrayOne[0] == 3 && arrayOne.length >= 2) {
            System.out.println("Массив записан корректно!");
            return true;
        }
        if (arrayOne[0] != 3 && arrayOne.length >= 2) {
            System.out.println("Первым элементом массива должна быть цифра 3!");
        }
        else if (arrayOne[0] == 3 && arrayOne.length <= 2){
            System.out.println("Массив должен состоять из двух и более элементов!");
        }
        else if (arrayOne[0] != 3 && arrayOne.length <= 2) {
            System.out.println("Не соблюдено ни одно из условий написания данного массива!");
        }
        return false;
    }

    //задание 6
    public static void taskSix() {
        System.out.println("\nЗадание шесть");

        int[] arrayTwo = new int[]{3, -3, 7, 4, 5, 4, 3};
        for (int element : arrayTwo) {
            if (element == 1 || element == 3) {
                System.out.println("Массив содержит числа 1 или 3");
                return;
            }
            System.out.println("Массив не содержит ни число 1, ни число 3");
        }
    }
}

