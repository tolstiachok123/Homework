package by.andruhovich.lesson3;

import static java.lang.Integer.parseInt;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(bacteriesColonySize(args));
    }

    public static int[] turnStringArrayToIntArray(String[] stringArgs){
        int[] intArgs = new int[stringArgs.length];
        for (int i = 0; i < stringArgs.length; i++) {
            intArgs[i] = parseInt(stringArgs[i]);
        }
        return intArgs;
    }

    public static int bacteriesColonySize(String[] stringArgs) {
        int[] usersValues = turnStringArrayToIntArray(stringArgs);
        int colonySize = usersValues[0];
        for (int i = 0; i < usersValues[2]/usersValues[0]; i++) {
            colonySize *= usersValues[1];
        }
        return colonySize;
    }
}
