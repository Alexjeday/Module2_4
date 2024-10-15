package lesson1.ex1.shop;

import lesson1.ex1.product.Bicycle;

public class BicycleShop {

    private Bicycle bicycle;

    /**
     * Покупка велосипеда.
     */
    public void buy(double priceForBuy) {
        bicycle = new Bicycle(priceForBuy);
    }

    public Bicycle sell(double money) {
        if (bicycle == null) {
            throw new RuntimeException("Велосипеда нет в наличии");
        }
        if (bicycle.getPrice() <= money) {
            Bicycle temp = bicycle;
            bicycle = null;
            return temp;
        }
        throw new RuntimeException("Не достаточно денег для покупки велосипеда");
    }
}
