package by.andruhovich.lesson5;

import by.andruhovich.lesson5.Serviсes.ComputerService;

/*
Создать класс компьютер.
Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)

Методы:
- метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вывзове метода рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если угадали комп выключается, если нет сгорает.Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает
*/

public class Start {
    public static void main(String[] args) {
        ComputerService.writeDiscription(ComputerService.turnOn(ComputerService.initialization()));
    }
}