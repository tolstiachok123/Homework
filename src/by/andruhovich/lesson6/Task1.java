package by.andruhovich.lesson6;

/*
Вырезать подстроку из строки начиная с первого вхождения символа на произвольной позиции  до последнего вхождения
другого символа на произвольной позиции. Первый символ должен быть выбран рандомно из первой половины предложения,
второй - из второй. Если символы совпадают, генерировать пары, пока символы не будут различны.
 */

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        char firstChar = firstCharSelect(args[0]);
        char secondChar = secondCharSelect(args[0], firstChar);
        String subString = substringMutcher(args[0], firstChar, secondChar);
        System.out.println(subString);
    }

    protected static char firstCharSelect(String originalString) {
        int i;
        do {
            Random randomNumber = new Random();
            i = (int) randomNumber.nextInt(originalString.length());
        } while (i < originalString.length()/2);
        return originalString.charAt(i);
    }

    protected static char secondCharSelect(String originalString, char firstChar) {
        int i;
        do {
            i = (int) Math.random() * originalString.length() * 100;
        } while (i > originalString.length()/2 && i != firstChar);
        return originalString.charAt(i);
    }

    protected static String substringMutcher(String originalString, char firstChar, char secondChar) {
        String regEx = firstChar + ".+" + secondChar;
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(originalString);
        return  originalString.substring(matcher.start(), matcher.end());
    }
}
