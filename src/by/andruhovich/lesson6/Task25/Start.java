package by.andruhovich.lesson6.Task25;

/*
Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию снимающую деньги.
На вход передается сумма денег. На выход – булевское значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать конструктор с тремя параметрами – количеством купюр.
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.toString());
        atm.withdrawals(new Scanner(System.in).nextInt());
        System.out.println(atm.toString());
        atm.payment(100, 100, 100);
        System.out.println(atm.toString());
    }
}
