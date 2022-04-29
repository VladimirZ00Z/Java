import java.io.*;
import java.util.Arrays;
import java.util.List;

class TestTask10 {

    public static void main(String[] args) {
        File file1 = new File("files/text1.txt");
        File file2 = new File("files/text2.txt");
        File mergeFile = new File("files/mergeText.txt");
        File writeStringFile = new File("files/writeStringText.txt");
        File replaceStringFile = new File("files/replaceStringText.txt");

        System.out.println("Задание 1");
        List fileList = Task10.fileToStringList(file1);
        fileList.forEach(System.out::println);

        System.out.println("Задание 2");
        Task10.writeData("iaafafdsdgfaa", writeStringFile);
        System.out.println("Смотри файл writeStringText.txt");

        System.out.println("Задание 3");
        Task10.mergeData(file1, file2, mergeFile);
        System.out.println("Смотри файл mergeText.txt");

        System.out.println("Задание 4");
        Task10.replaceData(replaceStringFile);
        System.out.println("Смотри файл replaceStringText.txt");

    }

}
