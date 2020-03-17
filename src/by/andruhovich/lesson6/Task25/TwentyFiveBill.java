package by.andruhovich.lesson6.Task25;

import java.util.Objects;

public class TwentyFiveBill {

    private static final int DENOMINATION = 25;

    public int getDENOMINATION() {
        return DENOMINATION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwentyFiveBill that = (TwentyFiveBill) o;
        return getDENOMINATION() == that.getDENOMINATION();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDENOMINATION());
    }

    @Override
    public String toString() {
        return "TwentyFiveBill{" +
                "DENOMINATION=" + DENOMINATION +
                '}';
    }
}
