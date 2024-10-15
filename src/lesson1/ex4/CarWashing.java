package lesson1.ex4;

public class CarWashing {
    private int money = 0;

    public <T extends Car> T wash(T car) {
        car.setClean(true);
        money += 1000;
        return car;
    }
}
