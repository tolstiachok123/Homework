package by.andruhovich.lesson6;

/*
Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры, например <p id=”p1”>,
и замену их на простые теги абзацев <p>.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task23 {
    public static void main(String[] args) {
        StringBuffer originalString = new StringBuffer(new Scanner(System.in).nextLine());
        System.out.println(stringChanging(originalString).toString());
    }

    public static StringBuffer stringChanging(StringBuffer originalString) {
        Pattern pattern = Pattern.compile("<p\\s+[^>]*>");
        Matcher matcher = pattern.matcher(originalString);
        if (matcher.find()) {
            originalString.replace(matcher.start(), matcher.end(), "<p>");
            return stringChanging(originalString);
        }
        else return originalString;
    }
}
