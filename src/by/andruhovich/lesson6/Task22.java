package by.andruhovich.lesson6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записаных по правилам Java, с помощью регулярных
выражений и вывести их на страницу.
 */

public class Task22 {
    public static void main(String[] args) {
        String originalString = new Scanner(System.in).nextLine();
        System.out.println(formingStingFromNumbers(originalString));
    }

    public static String formingStingFromNumbers(String originalString) {
        String resultString = "";
        Pattern pattern = Pattern.compile("0[xX][A-Fa-f\\d]+");
        Matcher matcher = pattern.matcher(originalString);
        while (matcher.find()) {
            resultString = resultString + " " + originalString.substring(matcher.start(), matcher.end());
        }
        return resultString;
    }
}
