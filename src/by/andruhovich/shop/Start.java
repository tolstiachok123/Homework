package by.andruhovich.shop;

public class Start {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addCommodity(new Commodity("mars", 200));
        shop.addCommodity(new Commodity("snickers", 300));
        shop.addCommodity(new Commodity("bountie", 250));
        System.out.println(shop.toString());
        shop.deleteCommodity(shop.getCommodityLinkedList().element().getId());
        System.out.println(shop.toString());
        shop.changeCommodity(shop.getCommodityLinkedList().element().getId());
        System.out.println(shop.toString());
    }
}
