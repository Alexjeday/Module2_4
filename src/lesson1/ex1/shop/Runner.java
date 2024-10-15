package lesson1.ex1.shop;

import lesson1.ex1.product.Bicycle;

public class Runner {
    public static void main(String[] args) {
        BicycleShop shop = new BicycleShop();
        shop.buy(7000);
        Bicycle bicycle = shop.sell(100000);
        System.out.println(bicycle);
    }
}
