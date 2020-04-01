package by.andruhovich.shop;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Shop {

    private LinkedList<Commodity> commodityLinkedList;

    public Shop(LinkedList<Commodity> commodityLinkedList) {
        this.commodityLinkedList = commodityLinkedList;
    }

    public Shop() {
        this.commodityLinkedList = new LinkedList<Commodity>();
    }

    public void addCommodity(Commodity commodity) {
        this.commodityLinkedList.addFirst(commodity);
    }

    public void deleteCommodity(String uuid) {
        int iteration = 0;
        while (this.commodityLinkedList.get(iteration).getId() != uuid) {
            iteration++;
            if (iteration > this.commodityLinkedList.size()) {
                System.out.println("don't exist this commodity");
                break;
            }
        }
        this.commodityLinkedList.remove(iteration);
    }

    public void changeCommodity(String uuid) {
        int iteration = 0;
        while (this.commodityLinkedList.get(iteration).getId() != uuid) {
            iteration++;
            if (iteration > this.commodityLinkedList.size()) break;
        }
        if (iteration > this.commodityLinkedList.size()) {
            System.out.println("don't exist this commodity");
        } else {
            this.commodityLinkedList.get(iteration).setName(new Scanner(System.in).nextLine());
            this.commodityLinkedList.get(iteration).setPrice(new Scanner(System.in).nextInt());
        }
    }

    public LinkedList<Commodity> getCommodityLinkedList() {
        return commodityLinkedList;
    }

    public void setCommodityLinkedList(LinkedList<Commodity> commodityLinkedList) {
        this.commodityLinkedList = commodityLinkedList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return getCommodityLinkedList().equals(shop.getCommodityLinkedList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommodityLinkedList());
    }

    @Override
    public String toString() {
        return "Shop{" +
                "commodityLinkedList=" + commodityLinkedList.toString() +
                '}';
    }
}
