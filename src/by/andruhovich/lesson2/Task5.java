package by.andruhovich.lesson2;

import static java.lang.Integer.parseInt;

/*
Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.
 */

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Положительных чисел " + countingByMark(args)[0] + "; отрицательных чисел " + countingByMark(args)[1]);
    }

    public static int[] countingByMark(String[] usersStringArray) {
        int[] counters = new int[2];
        for (int i = 0; i < usersStringArray.length; i++) {
            if (parseInt(usersStringArray[i]) > 0) {
                counters[0]++;
            } else if (parseInt(usersStringArray[i]) < 0) {
                counters[1]++;
            }
        }
        return counters;
    }
}
