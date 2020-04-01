package by.andruhovich.Task29;

import java.util.ArrayList;
import java.util.Objects;

public class Journal {
    private ArrayList<Notation> list;

    public Journal(ArrayList<Notation> list) {
        this.list = list;
    }

    public Journal() {
        this.list = new ArrayList<>(1);
    }

    public void cleanBadMarks() {
        list.removeIf(notation -> notation.getMark() < 4);
    }

    public ArrayList<Notation> getList() {
        return list;
    }

    public void setList(ArrayList<Notation> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Journal journal = (Journal) o;
        return getList().equals(journal.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getList());
    }

    @Override
    public String toString() {
        return "Journal{" +
                "list=" + list +
                '}';
    }
}
