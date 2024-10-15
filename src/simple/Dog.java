package simple;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog is barking. ");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping. ");

    }
}
