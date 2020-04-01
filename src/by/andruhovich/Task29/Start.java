package by.andruhovich.Task29;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
 */

public class Start {
    public static void main(String[] args) {
        Journal journal = new Journal();
        for (int i = 0; i < 22; i++) {
            journal.getList().add(new Notation((int) (Math.random() * 10)));
        }
        System.out.println(journal.toString());
        journal.cleanBadMarks();
        System.out.println(journal.toString());
    }
}
