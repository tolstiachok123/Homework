package by.andruhovich.Task26;

import java.util.Objects;

public class Fridge extends LargeDomesticAppliances {

    private int capacity;

    public Fridge(boolean workCondition, boolean isItSmart, int power, double length, double height, double width, double weight, int capacity) {
        super(workCondition, isItSmart, power, length, height, width, weight);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fridge fridge = (Fridge) o;
        return getCapacity() == fridge.getCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCapacity());
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "capacity=" + capacity + '\'' +
                "workCondition=" + super.isWorkCondition() + '\'' +
                "isItSmart=" + super.isItSmart() + '\'' +
                "power=" + super.getPower() + '\'' +
                "length=" + super.getLength() + '\'' +
                "height=" + super.getHeight() + '\'' +
                "width=" + super.getWidth() + '\'' +
                "weight=" + super.getWeight() +
                '}';
    }
}
