package by.andruhovich.lesson2;

import static java.lang.Integer.parseInt;

/*
В переменную записываем число. Надо вывести на экран сколько в этомчисле цифр и положительное оно или отрицательное.
Например, "этооднозначное положительное число". Достаточно будет определить, является личисло однозначным, "двухзначным или
трехзначным и более.
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println(countingNumbersDecimalPoints(args[0]));
        System.out.println(Math.signum(turnStrToInt(args[0])));
    }

    public static int turnStrToInt(String userNumberStringFormat) {
        return parseInt(userNumberStringFormat);
    }

    public static int countingNumbersDecimalPoints(String userNumberStringFormat) {
        return (turnStrToInt(userNumberStringFormat) == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(turnStrToInt(userNumberStringFormat)) + 0.5));
    }
}
