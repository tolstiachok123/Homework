package by.andruhovich.lesson6.Task25;

import java.util.Objects;

public class HundredBill {

    private static final int DENOMINATION = 100;

    public int getDENOMINATION() {
        return DENOMINATION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HundredBill that = (HundredBill) o;
        return getDENOMINATION() == that.getDENOMINATION();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDENOMINATION());
    }

    @Override
    public String toString() {
        return "HundredBill{" +
                "DENOMINATION=" + DENOMINATION +
                '}';
    }
}
