package by.andruhovich.Task30;

import java.util.HashSet;

public class Lisst {

    private HashSet<Integer> hashSet;

    public Lisst(HashSet<Integer> set) {
        this.hashSet = set;
    }

    public Lisst() {
        this.hashSet = new HashSet<Integer>();
    }

    public void formingLisst() {
        for (int i = 0; i < 10; i++) {
            hashSet.add((int) (Math.random() * 100));
        }
    }

    public HashSet<Integer> getSet() {
        return hashSet;
    }

    public void setHashSet(HashSet<Integer> set) {
        this.hashSet = set;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lisst lisst = (Lisst) o;
        return getSet().equals(lisst.getSet());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Lisst{" +
                "set=" + hashSet +
                '}';
    }
}
