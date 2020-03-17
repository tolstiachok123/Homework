package by.andruhovich.lesson6.Task24;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        System.out.println("Write please seconds quantity");
        Time firstTime = new Time(new Scanner(System.in).nextInt());

        System.out.println("Write please hours quantity");
        int hours = new Scanner(System.in).nextInt();
        System.out.println("Write please minutes quantity");
        int minutes = new Scanner(System.in).nextInt();
        System.out.println("Write please seconds quantity");
        int seconds = new Scanner(System.in).nextInt();
        Time secondTime = new Time(hours, minutes, seconds);

        System.out.println("total seconds quantity in secondTime = " + secondTime.getTotalSeconds());

        System.out.println(firstTime.compareTo(secondTime));

        System.out.println(firstTime.toString());
        System.out.println(secondTime.toString());
    }
}
