package lesson1.ex4;

public class Runner {
    public static void main(String[] args) {
        CarWashing carWashing = new CarWashing();
        LightCar lightCar = new LightCar();
        Bus bus = carWashing.wash(new Bus());

        System.out.println(bus.toString());
        System.out.println(lightCar);
    }
}
