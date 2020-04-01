package by.andruhovich.shop;

import java.util.Objects;
import java.util.UUID;

public class Commodity {

    private static UUID id = UUID.randomUUID();
    private String name;
    private int price;

    public Commodity(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return getId() == commodity.getId() &&
                getPrice() == commodity.getPrice() &&
                getName().equals(commodity.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice());
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
