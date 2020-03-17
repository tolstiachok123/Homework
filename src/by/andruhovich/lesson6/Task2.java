package by.andruhovich.lesson6;

/*
заменить все вхождения символа стоящего в позиции 3 на символ стоящий в позиции 0
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(charsChanging(args[0]));
    }

    public static String charsChanging(String originalString) {
        int wrongCharPosition = consoleReader();
        int rightCharPosition = consoleReader();
        String wrongChar = originalString.substring(wrongCharPosition,wrongCharPosition+1);
        String rightChar = originalString.substring(rightCharPosition,rightCharPosition+1);
        return originalString.replaceAll(wrongChar, rightChar);
    }

    public static int consoleReader() {
        System.out.println("write down char position");
        int charPosition = new Scanner(System.in).nextInt();
        return charPosition;
    }
}
