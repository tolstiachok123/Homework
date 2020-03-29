package by.andruhovich.lesson5.regExTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов
 */

public class Task20 {
    public static void main(String[] args) {
        String originalString = new Scanner(System.in).nextLine();
        System.out.println(lastLettersStringCreation(originalString.trim()));
    }

    public static String lastLettersStringCreation(String originalString) {
        StringBuilder lastLettersString = new StringBuilder("");
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]\\b\\s*");
        Matcher matcher = pattern.matcher(originalString);
        while(matcher.find()) {
            lastLettersString.append(originalString.charAt(matcher.start()));
        }
        return lastLettersString.toString();
    }
}
