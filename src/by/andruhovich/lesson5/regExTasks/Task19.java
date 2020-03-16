package by.andruhovich.lesson5.regExTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться
несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
*/

public class Task19 {

    public static void main(String[] args) {
        System.out.println(numberOfWordsInSentence(args[0]));
    }

    static int numberOfWordsInSentence(String originalString) {
        int wordsCounter = 0;
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]+");
        Matcher matcher = pattern.matcher(originalString.trim());
        while(matcher.find()) {
            wordsCounter++;
        }
        return wordsCounter;
    }
}
