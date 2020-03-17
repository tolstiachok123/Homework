package by.andruhovich.lesson6;

/*
Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String, другой с помощью
StringBuilder и метода append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        stringSummary(args[0]);
    }

    public static void stringSummary(String stringsPullSizeStringFormat) {
        long startTime, stringCycleEndTime, stringBufferCycleEndTime, stringBuilderCycleEndTime;
        int stringsPullSize = Integer.parseInt(stringsPullSizeStringFormat);
        StringBuilder stringBuilderArrayTotalString = new StringBuilder();
        StringBuffer stringBufferTotalString = new StringBuffer();
        String totalString = new String();
        String[] userStrings = new  String[stringsPullSize];
        for (int i = 0; i < stringsPullSize; i++) {
            userStrings[i] = new Scanner(System.in).nextLine() + " ";
        }
        startTime = System.nanoTime();
        System.out.println(startTime);
        for (int i = 0; i < stringsPullSize; i++) {
            totalString += userStrings[i];
        }
        stringCycleEndTime = System.nanoTime();
        System.out.println(stringCycleEndTime - startTime);
        for (int i = 0; i < stringsPullSize; i++) {
            stringBufferTotalString.append(userStrings);
        }
        stringBufferCycleEndTime = System.nanoTime();
        System.out.println(stringBufferCycleEndTime - stringCycleEndTime);
        for (int i = 0; i < stringsPullSize; i++) {
            stringBuilderArrayTotalString.append(userStrings);
        }
        stringBuilderCycleEndTime = System.nanoTime();
        System.out.println(stringBuilderCycleEndTime - stringBufferCycleEndTime);
    }
}
