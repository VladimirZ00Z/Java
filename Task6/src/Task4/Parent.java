package Task4;

import java.util.Scanner;

public class Parent {
    private int number;

    public void setNumber() {
        System.out.println("Введите целое число:");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
    }
    public int getNumber(){
        return number;
    }

}