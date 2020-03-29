package by.andruhovich.lesson6.Task24;

/*
Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами:
секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
(метод должен работать аналогично compareTo в строках). Создать два конструктора: получающий общее количество секунд, и
часы, минуты и секунды по отдельности. Сделать метод для вывода данных.
 */

import java.util.Objects;

public class Time implements Comparable <Time> {

    private Integer hours;
    private Integer minutes;
    private Integer seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds - this.hours * 3600) / 60;
        this.seconds = seconds - (this.hours * 3600) - (this.minutes * 60);
    }

    @Override
    public int compareTo(Time o) {
        int result = this.hours.compareTo(o.hours);
        if (result == 0) {
            result = this.minutes.compareTo(o.minutes);
        }
        if (result == 0) {
            result = this.seconds.compareTo(o.seconds);
        }
        return result;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        int totalSeconds = this.seconds + this.minutes * 60 + this.hours * 3600;
        return totalSeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return getHours() == time.getHours() &&
                getMinutes() == time.getMinutes() &&
                getSeconds() == time.getSeconds();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHours(), getMinutes(), getSeconds());
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
