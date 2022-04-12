package Ex5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methods {
    //задача 1
    public static String taskOne(String string) {
        int max = 0;
        int len = 0;
        int lenString = string.length();
        String word = "";
        StringBuilder longestWord = new StringBuilder();
        for (int i = 0; i < lenString; i++) {
            char charInString = string.charAt(i);
            if (!Character.isLetter(charInString)) {
                if (max < len) {
                    max = len;
                    word = longestWord.toString();
                }
                len = 0;
                longestWord.setLength(0);
            } else {
                len++;
                longestWord = longestWord.append(charInString);
                if (i == lenString - 1 && max < len) {
                    word = longestWord.toString();
                }
            }
        }
        return word;
    }

    //задача 2
    public static boolean taskTwo(String string) {
        String stringToLow = string.toLowerCase();
        return (stringToLow.equals(new StringBuilder(stringToLow).reverse().toString()));
    }

    //задача 3
    public static String taskThree(String string) {
        String stringToLow = string.toLowerCase();
        return (stringToLow.replaceAll("бяка", "[ВЫРЕЗАНО ЦЕНЗУРОЙ]"));
    }

    //задача 4
    public static int taskFour(String string, String subString) {
        Pattern p = Pattern.compile(subString);
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }

    //задача 5
    public static void taskFive(String string) {
        System.out.println("The given string is: " + string);
        String[] stringArr = string.split(" ");
        StringBuilder stringRev = new StringBuilder();
        for (String word : stringArr) {
            stringRev.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println("The string reversed word by word is: " + stringRev);
    }
}
