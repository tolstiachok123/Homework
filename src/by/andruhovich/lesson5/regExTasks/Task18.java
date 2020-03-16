package by.andruhovich.lesson5.regExTasks;

/*
Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество
 */

public class Task18 {
    public static void main(String[] args) {
        System.out.println(punctuationMarksCounting(args[0]));
    }

    private static int punctuationMarksCounting(String originalString) {
        String changedString = originalString.replaceAll("[a-zA-Z1234567890+=_£$%^&*#~/<> ]", "");
        return changedString.length();
    }
}
