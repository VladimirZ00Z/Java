package Task2;

public class Calculator {
    //Сложение
    public void sum(Double a, Double b){
        System.out.println("Сумма чисел с плавающей точкой = " + (a+b));
    }
    public void sum(Long a, Long b){
        System.out.println("Сумма больших чисел = " + (a+b));
    }
    public void sum(Integer a, Integer b){
        System.out.println("Сумма стандартных чисел = " + (a+b));
    }


    //Вычитание
    public void subtraction(Double a, Double b){
        System.out.println("Разность чисел с плавающей точкой = " + (a-b));
    }
    public void subtraction(Long a, Long b){
        System.out.println("Разность больших чисел = " + (a-b));
    }
    public void subtraction(Integer a, Integer b){
        System.out.println("Разность стандартных чисел = " + (a-b));
    }


    //Умножение
    public void multiplication(Double a, Double b){
        System.out.println("Произведение чисел с плавающей точкой  = " + (a*b));
    }
    public void multiplication(Long a, Long b){
        System.out.println("Произведение больших чисел = " + (a*b));
    }
    public void multiplication(Integer a, Integer b){
        System.out.println("Произведение стандартных чисел = " + (a*b));
    }


    //Деление
    public void div(Double a, Double b){
        System.out.println("Частное от чисел с плавающей точкой  = " + (a/b));
    }
    public void div(Long a, Long b){
        System.out.println("Частное от больших чисел = " + (a * 1.0/b));
    }
    public void div(Integer a, Integer b){
        System.out.println("Частное от стандартных чисел = " + (a * 1.0/b));
    }
}
