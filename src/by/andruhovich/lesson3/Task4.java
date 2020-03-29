package by.andruhovich.lesson3;

import static java.lang.Integer.parseInt;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(multiplicationBySummary(args));
    }

    public static int[] turnStringArrayToIntArray(String[] stringArgs){
        int[] intArgs = new int[stringArgs.length];
        for (int i = 0; i < stringArgs.length; i++) {
            intArgs[i] = parseInt(stringArgs[i]);
        }
        return intArgs;
    }

    public static int multiplicationBySummary(String[] stringArgs) {
        int[] usersNumbers = turnStringArrayToIntArray(stringArgs);
        int result = 0;
        for (int i = 0; i < usersNumbers[1]; i++) {
            result += usersNumbers[0];
        }
        return result;
    }
}
