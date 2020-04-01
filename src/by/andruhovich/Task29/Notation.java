package by.andruhovich.Task29;

import java.util.Objects;

public class Notation {

    private int mark;

    public Notation(int mark) {
        this.mark = mark;
    }

    public Notation() {
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notation notation = (Notation) o;
        return getMark() == notation.getMark();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMark());
    }

    @Override
    public String toString() {
        return "Notation{" +
                "mark=" + mark +
                '}';
    }
}
