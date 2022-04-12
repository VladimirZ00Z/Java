package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Калькулятор
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.print("Добро пожаловать в калькулятор \n");

        //Сложение
        double termOne = 0, termTwo = 0;
        long termLongOne = 0L, termLongTwo = 0L;
        int termIntOne = 0, termIntTwo = 0;

        //Сумма чисел с плавающей точкой
        System.out.println("Введите первое слагаемое:");
        if (scanner.hasNext()) {
            termOne = scanner.nextDouble();
        }
        System.out.println("Введите второе слагаемое:");
        if (scanner.hasNext()) {
            termTwo = scanner.nextDouble();
        }

        //Перегрузка метода
        termLongOne = (long) termOne;
        termLongTwo = (long) termTwo;
        termIntOne = (int) termOne;
        termIntTwo = (int) termTwo;

        calc.sum(termOne, termTwo);//Вызов метода класса Calculator
        calc.sum(termLongOne, termLongTwo);
        calc.sum(termIntOne, termIntTwo);


        //Вычитание
        double minuend = 0, subtrahend = 0;
        long minuendLong = 0L, subtrahendLong = 0L;
        int minuendInt = 0, subtrahendInt = 0;

        //Вычитание чисел с плавающей точкой
        System.out.println("Введите уменьшаемое:");
        if (scanner.hasNext()) {
            minuend = scanner.nextDouble();
        }
        System.out.println("Введите вычитаемое:");
        if (scanner.hasNext()) {
            subtrahend = scanner.nextDouble();
        }

        //Перегрузка метода
        minuendLong = (long) minuend;
        subtrahendLong = (long) subtrahend;
        minuendInt = (int) minuend;
        subtrahendInt = (int) subtrahend;

        calc.subtraction(minuend, subtrahend);
        calc.subtraction(minuendLong, subtrahendLong);
        calc.subtraction(minuendInt, subtrahendInt);


        //Умножение
        double factorOne = 0, factorTwo = 0;
        long factorLongOne = 0L, factorLongTwo = 0L;
        int factorIntOne = 0, factorIntTwo = 0;

        System.out.println("Введите первый множитель:");
        if (scanner.hasNext()) {
            factorOne = scanner.nextDouble();
        }
        System.out.println("Введите второй множитель:");
        if (scanner.hasNext()) {
            factorTwo = scanner.nextDouble();
        }

        //Перегрузка метода
        factorLongOne = (long) factorOne;
        factorLongTwo = (long) factorTwo;
        factorIntOne = (int) factorOne;
        factorIntTwo = (int) factorTwo;

        calc.multiplication(factorOne, factorTwo);
        calc.multiplication(factorLongOne, factorLongTwo);
        calc.multiplication(factorIntOne, factorIntTwo);


        //Деление
        double dividend = 0, divider = 0;
        long dividendLong = 0L, dividerLong = 0L;
        int dividendInt = 0, dividerInt = 0;

        System.out.println("Введите делимое");
        if (scanner.hasNext()) {
            dividend = scanner.nextDouble();
        }
        System.out.println("Введите делитель");
        if (scanner.hasNext()) {
            divider = scanner.nextDouble();
        }

        //Перегрузка метода
        dividendLong = (long) dividend;
        dividerLong = (long) divider;
        dividendInt = (int) dividend;
        dividerInt = (int) divider;

        calc.div(dividend, divider);
        calc.div(dividendLong, dividerLong);
        calc.div(dividendInt, dividerInt);
        //Коты (определение класса)
        Cat cat = new Cat();
        System.out.println("Что это за кошачее \n");
        String name = null; //Кличка
        String breed = null; //Порода
        String furColor = null; //Окрас шерсти
        int age = 5; // Возраст
        double height = 20; //Рост в холке
        double weight = 4; //Вес

        System.out.println("Введите кличку:");
        if (scanner.hasNext()) {
            name = scanner.next();
        }
        System.out.println("Введите породу:");
        if (scanner.hasNext()) {
            breed = scanner.next();
        }
        System.out.println("Введите окрас шерсти:");
        if (scanner.hasNext()) {
            furColor = scanner.next();
        }

        cat.catFullInfo(name, breed, furColor, age, height, weight);
    }
}

