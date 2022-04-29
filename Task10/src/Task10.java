import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task10 {
    //задание 1
    public static List<String> fileToStringList(File file) {
        List stringList = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input = null;
            while ((input = reader.readLine()) != null) {
                stringList.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    //задание 2
    public static void writeData(String string, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append(string + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //задание 3
    public static void mergeData(File file1, File file2, File mergeFile) {
        List<String> stringList1 = fileToStringList(file1);
        List<String> stringList2 = fileToStringList(file2);
        try {
            new FileWriter(mergeFile, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String str : stringList1) {
            writeData(str, mergeFile);
        }
        for (String str : stringList2) {
            writeData(str, mergeFile);
        }
    }

    //задание 4
    public static void replaceData(File file) {
        List<String> stringList = fileToStringList(file);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            for (String str : stringList) {
                writer.append(str.replaceAll("\\W", "\\$") + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}