package by.andruhovich.lesson3;

import static java.lang.Integer.parseInt;
import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(Summary(args));
    }

    public static int[] turnStringArrayToIntArray(String[] stringArgs){
        int[] intArgs = new int[stringArgs.length];
        for (int i = 0; i < stringArgs.length; i++) {
            intArgs[i] = parseInt(stringArgs[i]);
        }
        return intArgs;
    }

    public static int Summary(String[] stringArgs) {
        int[] usersParameters = turnStringArrayToIntArray(stringArgs);
        int result = 0;
        for (int i = 0; i < (log(usersParameters[1]) / log(usersParameters[0])); i++) {
            result += pow(usersParameters[0], i);
        }
        return result;
    }
}
