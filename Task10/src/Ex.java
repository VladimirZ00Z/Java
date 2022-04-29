import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Ex{


    public static List<String> ex1(File file) {
        List<String> text = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input = null;
            while ((input = reader.readLine()) != null) {
                text.add(input);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            return text;
        }
    }

    public static void ex2(File file, String str) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(str + "\n");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void ex3(File file1, File file2, File outFile){
        List<String> text1 = ex1(file1);
        List<String> text2 = ex1(file2);

        for (String str: text1) {
            ex2(outFile, str);
        }

        for (String str: text2) {
            ex2(outFile, str);
        }
    }

    public static void ex4(File file) {
        List<String> text = ex1(file);
        for (String str: text){
            System.out.println(str.replaceAll("[^a-zA-Zа-яА-Я\\d]","\\$"));
        }
    }
}