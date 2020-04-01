package by.andruhovich.Task28;

import java.util.LinkedList;
import java.util.Objects;

public class Depository {

    private LinkedList<Object> linkedList;

    public Depository(LinkedList<Object> linkedList) {
        this.linkedList = linkedList;
    }

    public Depository() {
        this.linkedList = new LinkedList<>();
    }

    public void addObject(Object object) {
        this.linkedList.addFirst(object);
    }

    public Object getByPosition(int position) {
        return this.linkedList.get(position);
    }

    public LinkedList<Object> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<Object> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depository that = (Depository) o;
        return getLinkedList().equals(that.getLinkedList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLinkedList());
    }

    @Override
    public String toString() {
        return "Depository{" +
                "linkedList=" + linkedList +
                '}';
    }
}
