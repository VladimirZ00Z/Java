package Ex4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
    public static int[] inputArray() {
        System.out.print("Укажите длинну массива: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] array = new int[len];
        System.out.println("Перечислите элементы массива: ");
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    //задание 1
    public static void task1() {
        System.out.println("\n Задание 1 ");
        int[] array1 = inputArray();
        int len1 = array1.length;
        for (int i = 0; i < len1 - 1; i++) {
            if (array1[i] > array1[i + 1]) {
                System.out.println("Please, try again\n");
                return;
            }
        }
        System.out.println("OK\n");
    }

    //задание 2
    public static void task2() {
        System.out.println("\n Задание 2 ");
        int[] array2 = inputArray();
        System.out.println("Тело массива: " + Arrays.toString(array2));
    }

    //задание 3
    public static void task3() {
        System.out.println("\n Задание 3 ");
        int[] array3 = inputArray();
        int len3 = array3.length;
        System.out.println("Array 1 : " + Arrays.toString(array3));
        int element = array3[0];
        array3[0] = array3[len3 - 1];
        array3[len3 - 1] = element;
        System.out.println("Array 2 : " + Arrays.toString(array3));
    }

    //задание 4
    //Найти первое уникальное число в массиве.
    public static void task4() {
        System.out.println("\nЗадание 4");
        int[] array4 = inputArray();
        int len4 = array4.length;
        System.out.println("Result: " + Arrays.toString(array4));
        for (int element1 : array4) {
            int numEqualElements = 0;
            for (int element2 : array4) {
                if (element1 == element2) {
                    numEqualElements++;
                }
            }
            if (numEqualElements == 1) {
                System.out.println("Первый уникальный элемент в массиве: " + element1);
                return;
            }
        }
        System.out.println( "В массиве нет уникальных элементов");
        return;
    }

    //задание 5
    //Заполнить массив случайным числами и отсортировать его.
    public static void task5() {
        System.out.println("Задание 5");
        int start = 0;
        int end = 1000;
        boolean isSorted = true;
        int len5 = 2 + (int) (Math.random() * 8);
        int[] array5 = new int[len5];
        for (int i = 0; i < len5; i++) {
            array5[i] = start + (int) (Math.random() * end);
        }
        System.out.println("Result: " + Arrays.toString(array5));
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < len5 - 1; i++) {
                if (array5[i] > array5[i + 1]) {
                    isSorted = true;
                    int elem = array5[i];
                    array5[i] = array5[i + 1];
                    array5[i + 1] = elem;
                }
            }
        }
        System.out.println("Sort result: " + Arrays.toString(array5));
    }
}
