package lesson1.ex2.output;

public class Tv implements Output {
    @Override
    public void show() {
        System.out.println("Телевизор показывает. ");
    }

    public void makeSound() {
        System.out.println("ТВ орет на всю комнату. ");
    }
}
