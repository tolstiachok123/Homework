package by.andruhovich.lesson2;

import static java.lang.Integer.parseInt;

/*
Даны 2 числа. Вывести большее из них
 */

public class Task6 {
    public static void main(String[] args) {
        System.out.println(intComparison(args));
    }

    public static int intComparison(String[] args) {
        int[] userInts = turnStringArrayToIntArray(args);
        int max = userInts[0];
        for (int i = 1; i < userInts.length; i++) {
            if (max < userInts[i]) max=userInts[i];
        }
        return max;
    }

    public static int[] turnStringArrayToIntArray(String[] args) {
        int[] userInts = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            userInts[i] = parseInt(args[i]);
        }
        return userInts;
    }
}
