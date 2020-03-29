package by.andruhovich.Task26;

import java.util.Objects;

public class Kittle extends SmallDomesticAppliances {

    private double volume;

    public Kittle(boolean workCondition, boolean isItSmart, int power, boolean reparable, double volume) {
        super(workCondition, isItSmart, power, reparable);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kittle kittle = (Kittle) o;
        return Double.compare(kittle.getVolume(), getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume());
    }

    @Override
    public String toString() {
        return "Kittle{" +
                "volume=" + volume + '\'' +
                "workCondition=" + super.isWorkCondition() + '\'' +
                "isItSmart=" + super.isItSmart() + '\'' +
                "power=" + super.getPower() + '\'' +
                "reparable=" + super.isReparable() + '\'' +
                '}';
    }
}
