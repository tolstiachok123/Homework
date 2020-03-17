package by.andruhovich.lesson6.Task25;

import java.util.Objects;

public class FiftyBill {

    private static final int DENOMINATION = 50;

    public int getDENOMINATION() {
        return DENOMINATION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiftyBill fiftyBill = (FiftyBill) o;
        return getDENOMINATION() == fiftyBill.getDENOMINATION();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDENOMINATION());
    }

    @Override
    public String toString() {
        return "FiftyBill{" +
                "DENOMINATION=" + DENOMINATION +
                '}';
    }
}
