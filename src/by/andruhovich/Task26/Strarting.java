package by.andruhovich.Task26;

/*
Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */

public class Strarting {
    public static void main(String[] args) {
        Fridge fridge = new Fridge(false, true, 2, 134.00, 123.00, 123.00, 84.00, 200);
        System.out.println(fridge.toString());
        fridge.turnOn();
        System.out.println(fridge.toString());
    }
}
