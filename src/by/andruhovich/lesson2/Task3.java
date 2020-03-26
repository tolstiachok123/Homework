package by.andruhovich.lesson2;

import static java.lang.Integer.parseInt;

/*
Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным, то вычесть из него 2. Если нулевым,
то заменить его на10. Вывести полученное число
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println(numberIdentification(args[0]));
    }

    public static int numberIdentification(String usersNumber) {
        int number = parseInt(usersNumber);
        number = (number > 0) ? ++number : ((number < 0) ? (number - 2) : 10);
        return number;
    }
}
