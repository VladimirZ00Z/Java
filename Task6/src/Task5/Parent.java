package Task5;

import java.util.Scanner;

public class Parent {
    private int age;
    public Scanner in = new Scanner(System.in);

    public void setInfo() {
        System.out.println("Введите возраст:");
        age = in.nextInt();
    }

    public int getAge() {
        return age;
    }
}
