package by.andruhovich.lesson2;

import static java.lang.Integer.parseInt;

/*
Треугольник существует только тогда, когда сумма любых двух его сторонбольше третьей. Определить существует ли такой треугольник.
Дано: a, b, c –стороны предполагаемого треугольника. Требуется сравнить длину каждогоотрезка-стороны с суммой двух других.
Если хотя бы в одном случае отрезококажется больше суммы двух других, то треугольника с такими сторонами несуществует.
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isTriangleExists(args));
    }

    public static int[] turnStringArrayToIntArray(String[] stringArgs){
        int[] intArgs = new int[stringArgs.length];
        for (int i = 0; i < stringArgs.length; i++) {
            intArgs[i] = parseInt(stringArgs[i]);
        }
        return intArgs;
    }

    public static boolean isTriangleExists(String[] stringArgs){
        int[] intArgs = turnStringArrayToIntArray(stringArgs);
        return (((intArgs[0] + intArgs[1]) > intArgs[2]) &&
                ((intArgs[0] + intArgs[2]) > intArgs[1]) &&
                ((intArgs[2] + intArgs[1]) > intArgs[0]));
    }
}
