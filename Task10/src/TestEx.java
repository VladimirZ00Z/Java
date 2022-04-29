import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestEx {

    public static void main(String[] args) {
        File file1 = new File("src/file/ex1.txt");
        File file2 = new File("src/file/ex2.txt");
        File file3 = new File("src/file/ex3.txt");
        String stringEx2 = "    @\t@@";


        System.out.println("Задание 1");
        Ex.ex1(file1).forEach(System.out::println);

        System.out.println("Задание 2");
        Ex.ex2(file2, stringEx2);

        System.out.println("Задание 3");
        Ex.ex3(file1, file2, file3);

        System.out.println("Задание 4");
        Ex.ex4(file3);
    }
}