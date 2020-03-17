package by.andruhovich.lesson6.Task25;

import java.util.LinkedList;
import java.util.Objects;

public class ATM {

    private LinkedList <TwentyFiveBill> twentyFiveBills = new LinkedList<>();
    private LinkedList <FiftyBill> fiftyBills = new LinkedList<>();
    private LinkedList <HundredBill> hundredBills = new LinkedList<>();

    public ATM() {
        for (int  i = 0; i < 500; i++) {
            this.twentyFiveBills.add(new TwentyFiveBill());
            this.fiftyBills.add(new FiftyBill());
            this.hundredBills.add(new HundredBill());
        }
    }

    public ATM(int hundredBillsQuantity, int fiftyBillsQuantity, int twentyFiveBillsQuantity) {
        for (int i = 0; i < hundredBillsQuantity; i++) this.hundredBills.add(new HundredBill());
        for (int i = 0; i < fiftyBillsQuantity; i++) this.fiftyBills.add(new FiftyBill());
        for (int i = 0; i < twentyFiveBillsQuantity; i++) this.twentyFiveBills.add(new TwentyFiveBill());
    }

    public boolean withdrawals(int sum) {
        int twentyFiveBillsCounter = 0, fiftyBillsCounter = 0, hundredBillsCounter = 0;
        hundredBillsCounter = sum / hundredBills.get(0).getDENOMINATION();
        fiftyBillsCounter = (sum % hundredBills.get(0).getDENOMINATION()) / fiftyBills.get(0).getDENOMINATION();
        twentyFiveBillsCounter = ((sum % hundredBills.get(0).getDENOMINATION()) % fiftyBills.get(0).getDENOMINATION()) / twentyFiveBills.get(0).getDENOMINATION();
        if (sum - hundredBillsCounter * hundredBills.get(0).getDENOMINATION() - fiftyBillsCounter * fiftyBills.get(0).getDENOMINATION() - twentyFiveBillsCounter * twentyFiveBills.get(0).getDENOMINATION() != 0) {
            System.out.println("Нельзы выдать данную сумму");
            return false;
        } else {
            System.out.println("Получите распишитесь! 100 - " + hundredBillsCounter + " купюр, 50 - " + fiftyBillsCounter + " купюр, 25 - " + twentyFiveBillsCounter + " купюр.");
            while (hundredBillsCounter != 0) {
                hundredBills.removeFirst();
                hundredBillsCounter--;
            }
            while (fiftyBillsCounter != 0) {
                fiftyBills.removeFirst();
                fiftyBillsCounter--;
            }
            while (twentyFiveBillsCounter != 0) {
                twentyFiveBills.removeFirst();
                twentyFiveBillsCounter--;
            }
            return true;
        }
    }

    public void payment(int hundredBillsQuantity, int fiftyBillsQuantity, int twentyFiveBillsQuantity) {
        for (int i = 0; i < hundredBillsQuantity; i++) this.hundredBills.add(new HundredBill());
        for (int i = 0; i < fiftyBillsQuantity; i++) this.fiftyBills.add(new FiftyBill());
        for (int i = 0; i < twentyFiveBillsQuantity; i++) this.twentyFiveBills.add(new TwentyFiveBill());
        System.out.println("Деньги успешно внесены");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return twentyFiveBills.equals(atm.twentyFiveBills) &&
                fiftyBills.equals(atm.fiftyBills) &&
                hundredBills.equals(atm.hundredBills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(twentyFiveBills, fiftyBills, hundredBills);
    }

    @Override
    public String toString() {
        return "ATM{" +
                "twentyFiveBills=" + twentyFiveBills.size() +
                ", fiftyBills=" + fiftyBills.size() +
                ", hundredBills=" + hundredBills.size() +
                '}';
    }
}
